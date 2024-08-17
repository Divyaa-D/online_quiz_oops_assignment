package online_quiz;

public class question {
    String ques_no;
    private String ques;
    private String op1;
    private String op2;
    private String op3;
    private String crct_ans;
    private String complexity;

    public question(String ques_no, String ques, String op1, String op2, String op3, String crct_ans,
            String complexity) {
        this.ques_no = ques_no;
        this.ques = ques;
        this.op1 = op1;
        this.op2 = op2;
        this.op3 = op3;
        this.crct_ans = crct_ans;
        this.complexity = complexity;
    }

    @Override
    public String toString() {
        return "Question no: " + ques_no +
                " Question: " + ques +
                " Option 1: " + op1 +
                " Option 2: " + op2 +
                " Option 3: " + op3 +
                " Correct answer: " + crct_ans +
                " Complexity: " + complexity;
    }
}
