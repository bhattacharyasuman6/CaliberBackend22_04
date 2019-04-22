package com.cts.cloud.enablement.onlinesales1.service;

import java.util.List;

import com.cts.cloud.enablement.onlinesales1.domain.EventRegistration;
import com.cts.cloud.enablement.onlinesales1.domain.EventSummary;

/**
 * @author 547991
 *
 */
public interface EventSummaryService {
	
	List<EventSummary> retrieveEventByPoc(Long pocID);
	
	List<EventSummary> retrieveAllEventSummary();
	
//	List<Event> retrieveEventByLocation(String location);
//	
	EventSummary createEvent(EventSummary eventSummary) throws Exception;
//	
	List<EventSummary> createEvents(List<EventSummary> eventSummary) throws Exception;
//	
	EventSummary updateEventSummary(Long eventID, EventSummary eventSummary);
//	
//	Event updateLivesTouched(Long eventID, Long livesTouched);
	
}
