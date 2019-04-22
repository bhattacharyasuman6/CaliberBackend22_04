package com.cts.cloud.enablement.onlinesales1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.cloud.enablement.onlinesales1.domain.EventRegistration;
import com.cts.cloud.enablement.onlinesales1.domain.EventSummary;

/**
 * @author 547991
 *
 */
public interface EventSummaryRepository extends JpaRepository<EventSummary, Long> {
	
	EventSummary findByEventID(Long eventID);
	
	List<EventSummary> findAll();
//	
//	List<Event> findByIDs(List<Long> eventIDList);
//	
//	List<Event> findByTypeOrderByEventTimeAsc(String eventType);
//	
//	List<Event> findByStatusOrderByEventTimeAsc(String status);
//	
//	List<Event> findByLocationOrderByEventTimeAsc(String location);
//	
//	List<Event> findByLocationAndStatusOrderByEventTimeAsc(String location, String Status);
//	
	List<EventSummary> findByPocID(Long pocID);
	
//	
//	List<Event> findByPocIDOrderByEventTimeAsc(Long pocID);
	
}