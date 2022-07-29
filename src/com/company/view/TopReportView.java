package com.company.view;

import com.company.dto.BuyingDto;
import com.company.dto.TopReportDto;

public class TopReportView {
    public static final String DESCRIPTION = "REPORT DATA: ";

    public void printDetails(TopReportDto report) {
        int dash = 50;
        System.out.println("=".repeat(dash));
        System.out.println(DESCRIPTION + report.getName());
        System.out.println("=".repeat(dash));
        System.out.printf("%-30s%-10s%s%n", "name", "count", "sum");
        System.out.println("=".repeat(dash));
        for (BuyingDto buyingDto : report.getData()) {
            String cost = Math.round(buyingDto.getSum()) + " uah";
            System.out.printf("%-30s%-10d%s%n", buyingDto.getName(), buyingDto.getCount(), cost);
            System.out.println("-".repeat(dash));
        }
        System.out.println("=".repeat(dash));
        System.out.println("Total sum: " + report.getTotalSum() + " uah");
    }

}
