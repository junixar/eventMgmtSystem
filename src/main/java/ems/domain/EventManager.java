package ems.domain;

import java.time.LocalDateTime;

public interface EventManager {
	
	public Event build(LocalDateTime start, LocalDateTime end, String organizer, String title, String description) throws InvalidEventException;
	public void create(Event event) throws InvalidEventException;
	
	public static class InvalidEventException extends Exception
	{
		public InvalidEventException(String arg0) {
			super(arg0);
		}
	}
}

