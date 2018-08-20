package com.sayant.factuweb;

import com.sayant.factuweb.dao.ClientDAO;
import com.sayant.factuweb.entity.Client;
import com.sayant.factuweb.service.ClientService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
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
public class ClientServiceTests {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private ClientService clientService;

	@Mock
	private ClientDAO clientDAO;

	@Test
    @DirtiesContext
	public void saveBasic() {
        Client clientToSave = new Client("TEST", "240303A", "NINGUNA", 46999, "VALENCIA", "VALENCIA", "", "");
        clientToSave.setId(50005L);
	    Client clientSaved = new Client("TESTSAVED", "240303A", "SOMETHING", 46999, "VALENCIA", "VALENCIA", "", "");
        clientSaved.setId(50005L);
        Mockito.when(clientDAO.save(Mockito.any())).thenReturn(clientSaved);

        clientToSave.setName("TESTSAVED");
        clientToSave.setAddress("SOMETHING");
        Client clientResult = clientService.save(clientToSave);

		assertEquals(clientResult.getName(), clientSaved.getName());
	}

	@Test
    @DirtiesContext
    public void deleteById() {
	    Long clientId = 10001L;
		Mockito.when(clientDAO.remove(Mockito.any())).thenReturn(true);
		boolean wasDeleted = clientService.delete(clientId);
	    assertEquals(wasDeleted, true);
    }
}
