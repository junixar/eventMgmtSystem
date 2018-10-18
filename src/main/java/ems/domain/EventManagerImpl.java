package ems.domain;

import java.time.LocalDateTime;

public class EventManagerImpl implements EventManager {

	public Event build(LocalDateTime start, LocalDateTime end, String organizer, String title, String description) {
		return new Event(start, end, organizer, title, description);
	}

	public void create(Event event) {
		// TODO Auto-generated method stub

	}
	
	public Event newEvent(LocalDateTime start, LocalDateTime end, String organizer) {
		return build (start, end, organizer, null, null);
	}

}
