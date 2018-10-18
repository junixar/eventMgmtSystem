package ems.domain;

import java.time.LocalDateTime;

public interface EventManager {
	
	public Event build(LocalDateTime start, LocalDateTime end, String organizer, String title, String description);
	public void create(Event event);
}

