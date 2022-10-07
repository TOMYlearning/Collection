package practice;

import java.time.LocalDate;

class Task {
	//変数
	private LocalDate date;
	private String taskname;
	
	public Task(LocalDate date, String name) {
		this.date = date;
		this.taskname = name;
	}
	public LocalDate getDate() {
		return this.date;
		  }
	public void setDate(LocalDate date) {
		    this.date = date;
		  }
	public String getTaskName() {
		return taskname;
	}
}