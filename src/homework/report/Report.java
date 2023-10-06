package homework.report;

import homework.User;

public class Report implements Reportable{

    @Override
    public void report(User user) {
        System.out.println("Report for user: " + user.getName());
    }
}
