package Film;

import java.util.ArrayList;
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
	}

	public void work() {
		int choice;
		outer: while (true) {
			printMenu();
			choice = in.nextInt();
			switch (choice) {
			case 1:
				loadIn();
				break;
			case 2:
				printScore();
				break;
			case 3:
				printTime();
				break;
			case 4:
				break outer;
			default: break outer;
			}
		}
	}

	public void loadIn() {

	}

	private void printScore() {
		

	}

	private void printTime() {
		

	}

	public void printMenu() {
		System.out.println("----------------------");
		System.out.println("      1               录入");
		System.out.println("      2     豆瓣评分浏览");
		System.out.println("      3    上映时间浏览");
		System.out.println("      4    退出");
		System.out.println("----------------------");
		System.out.println("请输入功能（1-4）：");
	}

}
