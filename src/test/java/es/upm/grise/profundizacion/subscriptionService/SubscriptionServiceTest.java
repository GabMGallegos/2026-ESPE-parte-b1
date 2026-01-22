package es.upm.grise.profundizacion.subscriptionService;
import es.upm.grise.profundizacion.exceptions.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SubscriptionServiceTest {
	
	@Test
	public void subscriptionService_seCreaElObjetoNormalmente() {
		SubscriptionService service = new SubscriptionService();

		assertNotNull(service);
	}

	@Test
	public void addUser_colocarUnUsuarioNulo(){
		SubscriptionService service = new SubscriptionService();
		User user = new User();
		user.setEmail(null);
		user.setDelivery(null);

		assertThrowsExactly(NullUserException.class, () -> service.addSubscriber(user));
	}

	@Test
	public void addUser_colocarUnUsuarioExistente(){
		SubscriptionService service = new SubscriptionService();
		User user = new User();
		user.setEmail(null);
		user.setDelivery(null);


		assertThrows(NullUserException.class, ()-> service.addSubscriber(user));
	}
	
	@Test
	public void addUser_siElUsuarioEsLocalElEmailDebeSerNull(){
		SubscriptionService service = new SubscriptionService();
		User user = new User();
		// user.setDelivery(LOCAl);

	}
}
