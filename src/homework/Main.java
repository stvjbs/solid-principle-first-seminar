package homework;

import homework.persist.Persistable;
import homework.persist.Persister;
import homework.report.Report;
import homework.report.Reportable;

public class Main{
    public static void main(String[] args){
        User robert = new User("Robert");
        Persistable persister = new Persister();
        Reportable report = new Report();
        persister.save(robert);
        report.report(robert);
    }
}