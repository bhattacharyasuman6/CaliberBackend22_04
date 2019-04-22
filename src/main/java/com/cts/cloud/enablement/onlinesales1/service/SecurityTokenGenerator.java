package com.cts.cloud.enablement.onlinesales1.service;

import java.util.Map;
import com.cts.cloud.enablement.onlinesales1.domain.ActiveDirectory;

public interface SecurityTokenGenerator {
	
	/**
	 * Generate Token
	 * @param user
	 * @return
	 */
	Map<String, Object> generateToken(ActiveDirectory user);

}
