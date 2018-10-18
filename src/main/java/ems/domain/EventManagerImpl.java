package ems.domain;

import java.time.LocalDateTime;

public class EventManagerImpl implements EventManager {

	public Event build(LocalDateTime start, LocalDateTime end, String organizer, String title, String description) throws InvalidEventException {
		if(start==null||end==null) {
			throw new InvalidEventException("start and end can not be null");
		}
		return new Event(start, end, organizer, title, description);
	}

	/**
	 * Persist the event as new entry only
	 * if the date is in the future.
	 * 
	 * Otherwise exception will be thrown.
	 * 
	 */
	public void create(Event event) throws InvalidEventException {
       LocalDateTime now = LocalDateTime.now();
       if(event.getStart().isBefore(now)) {
    	   throw new InvalidEventException("start can not be in the past: "+event.getStart());
       }
		
		
	}

	public Event newEvent(LocalDateTime start, LocalDateTime end, String organizer) throws InvalidEventException {
		return build(start, end, organizer, null, null);
	}

}
