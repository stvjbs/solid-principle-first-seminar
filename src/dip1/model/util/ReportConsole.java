package dip1.model.util;

import dip1.model.ReportItem;
import dip1.model.Reportable;

import java.util.List;

public class ReportConsole implements Reportable {

    @Override
    public void output(List<ReportItem> items) {
        System.out.println("Report console ");
        System.out.println(items);
    }
}
