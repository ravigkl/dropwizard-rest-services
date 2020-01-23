package com.rs.phonebook;

import com.rs.phonebook.resources.ContactResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PhonebookApplication extends Application<PhonebookConfiguration> {
    private static final Logger LOGGER = LoggerFactory.getLogger(PhonebookApplication.class);


    public static void main(final String[] args) throws Exception {
        new PhonebookApplication().run(args);
    }

    @Override
    public String getName() {
        return "Phonebook";
    }

    @Override
    public void initialize(final Bootstrap<PhonebookConfiguration> bootstrap) {
        LOGGER.info("PhonebooApplication initialization method is called");
    }

    @Override
    public void run(final PhonebookConfiguration configuration,
                    final Environment environment) {
        environment.jersey().register(new ContactResource());
        LOGGER.info("Method run is called from PhonebookApplication");
        LOGGER.info(configuration.getAdditionalMessage());

        for( int i=0; i < configuration.getMessageRepeatitions(); i++){
            LOGGER.error(configuration.getMessage());
        }
    }

}
