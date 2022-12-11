package Practices.day04;

public class OfferV1 {
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

    /*
- constructor
- create a constructor that creates an Offer object with the company and
location
- create a constructor that creates an Offer object with the company,
location, and salary
- create a constructor that creates an Offer object with the company,
location, salary, is full time, and number of PTO
*/
    public OfferV1(String company, String location){
        this.company = company;
        this.location = location;
    }
    public OfferV1(String company, String location, double salary){
        this (company, location);
        this.salary = salary;
    }
    public OfferV1(String company, String location, double salary,
                   boolean isFullTime, int numberOfPTO){
        this (company, location, salary);
        this.isFullTime = isFullTime;
        this.numberOfPTO = numberOfPTO;
    }
    public String toString(){
        String info = company + " located in " + location;
        info += "\n " + (salary > 0 ? salary : "");
        info += "\n " + (isFullTime ? "Full Time" : "Contract");
        info += "\n " + (numberOfPTO > 0 ? numberOfPTO : "");
        return info;
    }

}
