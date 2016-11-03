class Assignment {
	private String userName;
	private String cwid;
	private Code code;
	private double grade;
	private String comment;
	
	public void upDate() {       // update the comment and grade file of this assignment

	}
	public void download() {
		Code code = new Code();
	}
}

class Code {                       //class the store the code and compile it, comment it, and grade it.
				   /* the teacher and TAs could access and run the method in this class 
					while the student role could not run this. 
				   */ 
	private double score;
	private String sourceCode;
	private String comment;

	Code() {             //constructor for class Code
		
	}
	public double getScore() {
		return this.score;
	}
	public void setScore(double scr) {
		this.score = scr;
	}

	public String getSourceCode() {
		return this.sourceCode;
	}
	public void setSourceCode(String sourceCode) {
		this.sourceCode = sourceCode;
	}

	public void compile() {         // compile the code using cmd
		if (code == ".java") {

		} else if (code == ".cpp") {

		} else if (code == ".jpg") {

		} else if (code == ".zip") {
			code = code.unZip();
		} else if (code == ".py") {

		} else {
			System.out.println("The file does not compile");
		}
	}
	public void display() {
		String str = this.getSourceCode();
		// display the source code.
	}
	public double score(double score) {
		this.score = score;
		// allow the grader to grade the code based on the result. 
	}
	public void setComments() {
		// allow the grader to comment the code and write the comment into a file. 
	}
	public void grade() {
		double temp = 0.0;
		temp = this.getScore();
		// update the grade file 
	}
	public void update() {
		// update the comments file and grade file.
	}
}
class Interface {                            // interface class for comment and grade
	private TextArea commentArea;        //Interface for texting comment
	private TextArea gradeArea;          //Interface for grading
}