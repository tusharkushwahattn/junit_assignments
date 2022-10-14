package com.demo.service;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;
import com.demo.domain.Order;

@RunWith(MockitoJUnitRunner.class)
public class EmailServiceTest {

    @InjectMocks
    EmailService emailService;

    @Test
    public void sendEmailTest() {
        Order o1 = new Order(5, "Choclate", 10);
        boolean b = emailService.sendEmail(o1, "Tushar Kushwaha");
        assertTrue(b);
    }

    @Test(expected = RuntimeException.class)
    public void setcheckmailException() {
        emailService.sendEmail(new Order());
    }
}
