package com.cts.cloud.enablement.onlinesales1.service;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.cloud.enablement.onlinesales1.domain.EventRegistration;
import com.cts.cloud.enablement.onlinesales1.domain.ActiveDirectory;
import com.cts.cloud.enablement.onlinesales1.repository.EventRegistrationRepository;
import com.cts.cloud.enablement.onlinesales1.repository.ActiveDirectoryRepository;
import com.cts.cloud.enablement.onlinesales1.domain.EventSummary;
import com.cts.cloud.enablement.onlinesales1.repository.EventSummaryRepository;

/**
 * @author 547991
 *
 */
@Service
public class EventRegistrationServiceImpl implements EventRegistrationService {

	@Autowired
	private transient EventRegistrationRepository eventRegistrationRepository;
	
	@Autowired
	private transient ActiveDirectoryRepository activeDirectoryRepository;
	
	@Autowired
	private transient EventSummaryRepository eventSummaryRepository;
	
	@Override
	public List<EventRegistration> retrieveEventRegistrationByEmpID(Long empID) {
		ActiveDirectory activeDirectory = activeDirectoryRepository.findByEmpid(empID);
		return eventRegistrationRepository.findByEmpID(activeDirectory.getEmpid());
	}

	@Override
	public List<EventRegistration> retrieveEventRegistrationByProjID(Long projID) {
		return eventRegistrationRepository.findByEmpProjId(projID);
	}
	
	@Override
	public List<EventRegistration> retrieveAllEventRegistration() {
		return eventRegistrationRepository.findAll();
	}
	
//	@Override
//	public List<SalesTransaction> retrievePocTransactions(Long pocID) {
//		return salesTransactionRepository.findByPocIDOrderByStatusAsc(pocID);
//	}
//	
//	@Override
//	public List<SalesTransaction> retrieveEventTransactions(Long eventID) {
//		return salesTransactionRepository.findByEventID(eventID);
//	}
	
	@Override
	public EventRegistration createEventRegistration(EventRegistration eventRegistration) throws Exception {
//		SalesTransaction existingEvent salesTransactionRepository.findByEmpIDAndEventID(salesTransaction.getEmpID(),salesTransaction.getEventID());
//		if(existingEvent.size()==1) {
//			throw new Exception("Already Registered for the current event");
//		}
		
		EventRegistration existingEventRegistration = eventRegistrationRepository.findByEmpIDAndEventDate(eventRegistration.getEmpID(),eventRegistration.getEventDate());
		
		if(existingEventRegistration != null) {
			throw new Exception("Already Registered for an event on that date");
		}
		
		EventSummary eventSummary = eventSummaryRepository.findByEventID(eventRegistration.getEventID());
		ActiveDirectory activeDirectory = activeDirectoryRepository.findByEmpid(eventRegistration.getEmpID());
		eventRegistration.setStatus("OPEN");
		eventRegistration.setEventName(eventSummary.getEventName());
		eventRegistration.setEventDesc(eventSummary.getEventDesc());
		eventRegistration.setEventDate(eventSummary.getEventDate());
		eventRegistration.setBuid(activeDirectory.getBuid());
		eventRegistrationRepository.save(eventRegistration);
//		return eventRegistrationRepository.findById(eventRegistration.getId());
		return eventRegistration;
	}
	
	@Override
	public List<EventRegistration> updateEventRegistrationStatus(Long eventID) {
		List<EventRegistration> eventRegistrationList = eventRegistrationRepository.findByEventID(eventID);
		for(EventRegistration eachRecord : eventRegistrationList) {
		    eachRecord.setStatus("cancelled");
		}
		eventRegistrationRepository.saveAll(eventRegistrationList);
		return eventRegistrationRepository.findByEventID(eventID);
	}

//	@Override
//	public List<SalesTransaction> retrievePocTransactions(Long pocID) {
//		SalesUser currentRelationManager = salesUserRepository.findByUserEmailId(userEmailId);
//		List<SalesUser> salesUser = salesUserRepository.findByRoleAndLocation("user", currentRelationManager.getLocation());
//		
//		List<String> listOfUserEmailIds = salesUser.stream().map(SalesUser::getUserEmailId).map(Object::toString).collect(Collectors.toList());
//		
//		List<SalesTransaction> salesRelationshipManagerTransactionList = salesTransactionRepository.findByRequestedByInAndStatus(listOfUserEmailIds, "OPEN");
//		
//		salesRelationshipManagerTransactionList.forEach( salesRM -> {
//			salesUser.forEach( sales -> {
//				if(salesRM.getRequestedBy().equals(sales.getUserEmailId())) {
//					salesRM.setRequestedBy(sales.getUserEmailId());
//				}
//			});
//		});		
//		return salesRelationshipManagerTransactionList;
//	}
//	
//	@Override
//	public List<SalesTransaction> updateTransaction(List<SalesTransaction> salesTransactionList) throws Exception {
//		if(salesTransactionList.size() < 1) {
//			throw new Exception("No data");
//		}
//		final String user = salesTransactionList.get(0).getApprover();
//		SalesUser approverDetails = salesUserRepository.findByUsername(user);
//		for(SalesTransaction eachRecord : salesTransactionList) {
//			//fetch user id by invoking DB with username
//		    eachRecord.setRequestedBy(eachRecord.getRequestedBy());
//			eachRecord.setApprovedDate(new Date().toString());
//		}
//		salesTransactionRepository.saveAll(salesTransactionList);
//		return retrieveRelationshipManagerTransactions(approverDetails.getUserEmailId());
//	}
//
//	
	

	
}
