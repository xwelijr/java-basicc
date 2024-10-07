public class payroll {
    public static void main (String[] args) {
        // VARIABLE
        String employeeName = "Jane Doe";
        int employeeId = 101;
        float baseSalary = 20000.0f;
        int overtimeHours = 10;
        float overtimeRate = 1.5f;

        /// calculation
        float hourlyWage = baseSalary / 40;

        // step 2
        float overtimePay = overtimeHours * overtimeRate * hourlyWage;

        //Step 3
        float totalSalary = baseSalary + overtimePay;


        System.out.println("Employee Name : " + employeeName);
        System.out.println("Employee ID"  + employeeId);
        System.out.println("Base Salary : " + baseSalary);
        System.out.println("Overtime Hours " + overtimeHours);
        System.out.println("Overtime Rate :" + overtimeRate);
        System.out.println("Hourly Wage : " + hourlyWage);
        System.out.println("Overtime Pay : " + overtimePay);
        System.out.println("Total Salary : " + totalSalary);
     }
}
