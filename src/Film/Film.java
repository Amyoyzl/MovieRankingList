package Film;

public class Film {
	private String title;
	private int year;
	private double score;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public void print() {
		System.out.println(title + "   " + year + "   " + score);
	}
	
}
