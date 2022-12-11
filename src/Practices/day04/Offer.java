package Practices.day04;

public class Offer {
    /*
create a class called Offer
- data:
location, company, salary, is full time, number of PTO
*/
    String location;
    String company;
    double salary;
    boolean isFullTime;
    int numberOfPTO;

    public Offer(String company, String location) {
        this.company = company;
        this.location = location;
    }
    public Offer(String company, String location, double salary) {
        this.company = company;
        this.location = location;
        this.salary = salary;
    }
    public Offer(String company, String location, double salary, boolean isFullTime,
                 int numberOfPTO) {
        this.company = company;
        this.location = location;
        this.salary = salary;
        this.isFullTime = isFullTime;
        this.numberOfPTO = numberOfPTO;
    }
/*
- method:
toString()
print all the employees information
*/

    public String toString(){
//String info = company + " located in " + location;
        String info = "\n" + company + " located in " + location;
// info += "\n " + (salary > 0 ? salary : "");
        info += " - " + (salary > 0 ? salary : "");
//info += "\n " + (isFullTime ? "Full Time" : "Contract");
        info += " - " + (isFullTime ? "Full Time" : "Contract");
//info += "\n " + (numberOfPTO > 0 ? numberOfPTO : "");
        info += " - " + (numberOfPTO > 0 ? numberOfPTO : "");
        return info;
    }
}
