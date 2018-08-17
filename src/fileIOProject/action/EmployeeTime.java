package fileIOProject.action;

import java.time.LocalTime;

public class EmployeeTime {
	
	private LocalTime startedWork;
	private LocalTime endedWork;
	
	public EmployeeTime(LocalTime startedWork, LocalTime endedWork) {
		super();
		this.startedWork = startedWork;
		this.endedWork = endedWork;
	}

	public EmployeeTime() {
	}

	public LocalTime getStartedWork() {
		return startedWork;
	}

	public void setStartedWork(LocalTime startedWork) {
		this.startedWork = startedWork;
	}

	public LocalTime getEndedWork() {
		return endedWork;
	}

	public void setEndedWork(LocalTime endedWork) {
		this.endedWork = endedWork;
	}

	@Override
	public String toString() {
		return "EmployeeTime [startedWork=" + startedWork + ", endedWork=" + endedWork + "]";
	}
	
	

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}	
}
