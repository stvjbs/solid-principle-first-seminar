package dip1.model.util;

import dip1.model.ReportItem;
import dip1.model.Reportable;

import java.util.List;

public class ReportManager {
    private Reportable report;

    public ReportManager(Reportable report) {
        this.report = report;
    }

    public void output(List<ReportItem> items){
        report.output(items);
    }
}
