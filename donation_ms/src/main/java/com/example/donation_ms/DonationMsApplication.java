package com.example.donation_ms;

import com.example.donation_ms.DAO.Donation;
import com.example.donation_ms.DAO.OrganisationModel;
import com.example.donation_ms.DAO.UserModel;
import com.example.donation_ms.Repository.DonationRepository;
import com.example.donation_ms.Service.OrganisationModelRestClient;
import com.example.donation_ms.Service.UserModelRestClient;
import jakarta.jms.ConnectionFactory;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jms.DefaultJmsListenerContainerFactoryConfigurer;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import org.springframework.jms.config.JmsListenerContainerFactory;

import java.util.logging.Logger;

@SpringBootApplication
@EnableFeignClients
public class DonationMsApplication implements CommandLineRunner {
    //private static final Logger logger = (Logger) LoggerFactory.getLogger(DonationMsApplication.class);
    @Autowired
    OrganisationModelRestClient orgRest;
    @Autowired
    UserModelRestClient usrRest;
    @Autowired
    DonationRepository donationRepo;
    public static void main(String[] args) {
        SpringApplication.run(DonationMsApplication.class, args);
    }
    /*@Bean
    public JmsListenerContainerFactory<?> jmsTopicContainerFactory(
            ConnectionFactory connectionFactory,
            DefaultJmsListenerContainerFactoryConfigurer configurer )
    {
        DefaultJmsListenerContainerFactory factory = new DefaultJmsListenerContainerFactory();
        configurer.configure( factory, connectionFactory );
        factory.setPubSubDomain( true );
        return factory;
    }

    @JmsListener( destination = "example",
            containerFactory = "jmsTopicContainerFactory" )
    public void receiveMessage( String message )
    {
        logger.info("jms message: {}");
    }*/

    @Override
    public void run(String... args) throws Exception {
        UserModel user = usrRest.getUserById(1);
        OrganisationModel orga = orgRest.getOrganisationById(2);
        Donation donation = donationRepo.save(Donation.builder()
                .userId(user.getId())
                .organisationId(orga.getId())
                .amount(200.0)
                .org(orga)
                .usr(user)
                .build());
    }

}
