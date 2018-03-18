package io.xunyss.gazua.api.bithumb;

import org.junit.Test;

/**
 *
 * @author XUNYSS
 */
public class ApiTest {
	
	@Test
	public void publicApi() {
		Api api = new Api();
		api.ticker();
	}
}
