package com.tekkombud.test.service.message;

import com.tekkombud.application.entity.Messenger;
import com.tekkombud.test.config.ServiceMockConfig;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@ContextConfiguration(classes = ServiceMockConfig.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class MessengerServiceTest {

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void saveMessageTest() {
        int id = 27;
        Messenger messenger = new Messenger();
        messenger.setName("oles");
    }
}
