package com.cts.cloud.enablement.onlinesales1.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.cts.cloud.enablement.onlinesales1.domain.ActiveDirectory;

/**
 * @author 547991
 *
 */
public interface ActiveDirectoryRepository extends JpaRepository<ActiveDirectory, Long> {
	
	ActiveDirectory findByUserId(String userId);
	
	ActiveDirectory findByUserIdRole(String userId, String role);
	
	ActiveDirectory findByUserIdAndPassword(String userId, String password);
	
	
}