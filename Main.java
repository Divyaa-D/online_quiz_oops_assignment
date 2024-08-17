package online_quiz;

import java.util.*;

public class Main {
    public static void main(String args[]) {
        List<question> ques_list = new ArrayList<>();
        admin ad1 = new admin("sanjay", "1");
        Scanner sc = new Scanner(System.in);
        question ques = new question("1", "frrf", "wefc", "ewfew", "dewde", "ewdw", "wecfe");
        ques_list.add(ques);
        ques = new question("2", "frrf", "w efc", "e wfew", " dewde", " ewdw", "w ecfe");
        ques_list.add(ques);
        ques = new question("3", "frrf", "wefc", "ewfew", "dewde", "ewdw", "wecfe");
        ques_list.add(ques);
        ques = new question("4", "frrf", "wefc", "ewfew", "dewde", "ewdw", "wecfe");
        ques_list.add(ques);
        while (1 == 1) {
            int choice = 0;
            System.out.println("To create a question enter 1:");
            System.out.println("To delete a question enter 2:");
            System.out.println("TO view Questions enter 3:");
            System.out.println("Enter your choice:");
            choice = sc.nextInt();
            if (choice == 1) {
                List<String> ques_desc = ad1.create_ques();
                ques = new question(ques_desc.get(0), ques_desc.get(1), ques_desc.get(2), ques_desc.get(3),
                        ques_desc.get(4), ques_desc.get(5), ques_desc.get(6));
                ques_list.add(ques);
            }
            if (choice == 2) {
                String ind = ad1.delete_ques();
                for (int i = 0; i < ques_list.size(); i++) {
                    if (ques_list.get(i).ques_no.equals(ind)) {
                        ques_list.remove(i);
                        break;
                    }
                }
            }
            if (choice == 3) {
                for (int i = 0; i < ques_list.size(); i++) {
                    System.out.println(ques_list.get(i).toString());
                }
            }
            if (choice > 3)
                break;
        }
    }
}
