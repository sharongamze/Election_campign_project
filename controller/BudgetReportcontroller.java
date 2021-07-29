package controller;

import model.service.BudgetReportservice;

import java.time.LocalDate;

public class BudgetReportcontroller {

    private BudgetReportservice reportmodel;

    public BudgetReportcontroller() throws Exception {
       reportmodel=new BudgetReportservice();
    }

    public void budgetreport() throws Exception {
        reportmodel.budgetreport();
    }
    public void allreports(){
        reportmodel.allreports();
    }
    public void specific(LocalDate local) throws Exception {
        reportmodel.specific(local);
    }

}
