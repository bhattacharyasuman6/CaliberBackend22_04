package com.cts.cloud.enablement.onlinesales1.service;

import java.util.List;

import com.cts.cloud.enablement.onlinesales1.domain.ActiveDirectory;

/**
 * @author 547991
 *
 */
public interface ActiveDirectoryService {

	ActiveDirectory retrieveUserByEmpID(ActiveDirectory user);
	
	ActiveDirectory retrieveUserByEmailId(ActiveDirectory user);
	
	ActiveDirectory retrieveUserByEmpIDAndPassword(ActiveDirectory user);
	
	ActiveDirectory createNewUser(ActiveDirectory user);
	
	ActiveDirectory updateUserRole(ActiveDirectory user);
	
	List<ActiveDirectory> retrieveEmpByProj(ActiveDirectory user);
	
}