package ems.domain;

import java.time.LocalDateTime;

/**
 * Data object for event.
 */
public class Event {

	private LocalDateTime start;
	
	private LocalDateTime end;
	
	private String organizer;
	
	private String title;
	
	private String description;

//ublic Event (LocalDateTime start, LocalDateTime end, String organizer, String title) {
//todo
//
	public LocalDateTime getStart() {
		return start;
	}

	public void setStart(LocalDateTime start) {
		this.start = start;
	}

	public LocalDateTime getEnd() {
		return end;
	}

	public void setEnd(LocalDateTime end) {
		this.end = end;
	}

	public String getOrganizer() {
		return organizer;
	}

	public void setOrganizer(String organizer) {
		this.organizer = organizer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}