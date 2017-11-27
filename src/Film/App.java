package Film;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * 
 * @author Amy_oyzl
 *
 */
public class App {

	Scanner in = new Scanner(System.in);

	ArrayList<Film> films = new ArrayList<>();

	public static void main(String[] args) {

		App app = new App();
		app.work();
		System.out.println("END!");
	}

	public void work() {
		int choice;
		outer: while (true) {
			System.out.println();
			printMenu();
			choice = in.nextInt();
			switch (choice) {
			case 1:
				System.out.println();
				loadIn();
				break;
			case 2:
				System.out.println();
				printScore();
				break;
			case 3:
				System.out.println();
				printTime();
				break;
			case 4:
				break outer;
			default:
				break outer;
			}
		}
	}

	public void loadIn() {
		Film f = new Film();
		System.out.println("录入电影");
		System.out.print("请输入片名：");
		f.setTitle(in.next());
		System.out.print("请输入上映时间：");
		f.setYear(in.nextInt());
		System.out.print("请输入评分：");
		f.setScore(in.nextDouble());
		films.add(f);
		System.out.print("是否继续录入（yes/no）：");
		if (in.next().equalsIgnoreCase("yes"))
			loadIn();
	}

	private void printScore() {
		if(films.size()==0) {
			System.out.println("暂无内容！");
			return;
		}
		Collections.sort(films,new ScoreCompare());
		System.out.println("豆瓣评分");
		for (Film e : films) {
			System.out.println(e.getTitle() + ":" + e.getScore());
		}
	}

	private void printTime() {
		if(films.size()==0) {
			System.out.println("暂无内容！");
			return;
		}
		Collections.sort(films);
		System.out.println("上映时间");
		for (Film e : films) {
			System.out.println(e.getTitle() + ":" + e.getYear());
		}
	}

	public void printMenu() {
		System.out.println("----------------------------");
		System.out.println("      1     录入");
		System.out.println("      2     豆瓣评分浏览");
		System.out.println("      3     上映时间浏览");
		System.out.println("      4     退出");
		System.out.println("----------------------------");
		System.out.print("请输入功能（1-4）：");
	}

}
