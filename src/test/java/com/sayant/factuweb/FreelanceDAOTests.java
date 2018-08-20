package com.sayant.factuweb;

import com.sayant.factuweb.dao.FreelanceDAO;
import com.sayant.factuweb.entity.Freelance;
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
public class FreelanceDAOTests {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private FreelanceDAO freelanceDAO;

	@Test
	public void fingById_Basic() {
		Freelance freelance = freelanceDAO.findById(20001L);
		assertEquals("YESOS Y ESCAYOLAS RUBIO S.L.", freelance.getName());
	}

	@Test
    @DirtiesContext
	public void saveBasic() {
		Freelance freelance = freelanceDAO.findById(10001L);
		assertEquals("YESOS Y ESCAYOLAS RUBIO S.L.", freelance.getName());
		freelance.setName("YESOS Y ESCAYOLAS PERALES S.L.");
		freelanceDAO.save(freelance);
		freelance = freelanceDAO.findById(10001L);
		assertEquals("YESOS Y ESCAYOLAS PERALES S.L.", freelance.getName());
	}

	@Test
    @DirtiesContext
    public void deleteById() {
	    Long freelanceId = 10001L;
	    freelanceDAO.remove(freelanceId);
	    assertNull(freelanceDAO.findById(freelanceId));
    }
}
