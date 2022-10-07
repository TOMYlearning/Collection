package practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

public class Chapter5 {
	public static void main(String[] args) {
		
		ArrayList<Task> schedule = new ArrayList<>();
		//データセット
		schedule.add(new Task(LocalDate.of(2021,10,21), "牛乳を買う。"));
		schedule.add(new Task(LocalDate.of(2021, 9,15), "〇〇社面談。"));
		schedule.add(new Task(LocalDate.of(2021,12,04), "手帳を買う。"));
		schedule.add(new Task(LocalDate.of(2021, 8,10), "散髪に行く。"));
		schedule.add(new Task(LocalDate.of(2021,11, 9), "スクールの課題を解く。"));
		
		schedule.sort(Comparator.comparing(Task::getDate));
		
		for(Task task : schedule) {
			System.out.println(task.getDate() + ":" + task.getTaskName());
		}
	}
}
