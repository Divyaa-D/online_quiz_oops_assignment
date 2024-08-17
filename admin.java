package online_quiz;

import java.util.*;

public class admin {
    private String name;
    private String A_id;
    Scanner sc = new Scanner(System.in);

    public admin(String name, String A_id) {
        this.name = name;
        this.A_id = A_id;
    }

    public String getName() {
        return this.name;
    }

    public String getA_id() {
        return this.A_id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setA_id(String A_id) {
        this.A_id = A_id;
    }

    // Create Question
    public List<String> create_ques() {
        List<String> desc = new ArrayList<>();
        System.out.println("Enter Question Number");
        String q_no = sc.nextLine();
        System.out.println("Enter the question:");
        String ques = sc.nextLine();
        System.out.println("Enter Option 1");
        String op1 = sc.nextLine();
        System.out.println("Enter Option 2");
        String op2 = sc.nextLine();
        System.out.println("Enter Option 3");
        String op3 = sc.nextLine();
        System.out.println("Enter Correct answer");
        String crct_ans = sc.nextLine();
        System.out.println("Enter the complexity");
        String comp = sc.nextLine();
        desc.add(q_no);
        desc.add(ques);
        desc.add(op1);
        desc.add(op2);
        desc.add(op3);
        desc.add(crct_ans);
        desc.add(comp);
        return desc;
    }

    public String delete_ques() {
        System.out.println("Enter a question number to delete:");
        String no = sc.nextLine();
        return no;
    }
}
