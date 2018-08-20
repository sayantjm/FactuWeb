package com.sayant.factuweb;

import com.sayant.factuweb.dao.ClientDAO;
import com.sayant.factuweb.entity.Client;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ClientDAOTests {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private ClientDAO clientDAO;

	@Test
	public void fingById_Basic() {
		Client client = clientDAO.findById(10001L);
		assertEquals("YESOS Y ESCAYOLAS RUBIO S.L.", client.getName());
	}

	@Test
    @DirtiesContext
	public void saveBasic() {
		Client client = clientDAO.findById(10001L);
		assertEquals("YESOS Y ESCAYOLAS RUBIO S.L.", client.getName());
		client.setName("YESOS Y ESCAYOLAS PERALES S.L.");
		clientDAO.save(client);
		client = clientDAO.findById(10001L);
		assertEquals("YESOS Y ESCAYOLAS PERALES S.L.", client.getName());
	}

	@Test
    @DirtiesContext
    public void deleteById() {
	    Long clientId = 10001L;
	    clientDAO.remove(clientId);
	    assertNull(clientDAO.findById(clientId));
    }
}
