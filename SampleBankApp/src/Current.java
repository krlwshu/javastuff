public class Current extends Account {
    float penaltyFees, annualAccountFees;
    public Current (String pname, String pAccNum, String accType, int pPin, float pDeposit, float pFees, float annualFees){
        super(pname, pAccNum, accType, pPin, pDeposit);
        penaltyFees = pFees;
        annualAccountFees = annualFees;


    }

    public float getAnnualAccountFees() {
        return annualAccountFees;
    }

    public float getPenaltyFees() {
        return penaltyFees;
    }

    @Override
    public void printStatement(){
        super.printStatement();
        System.out.println("Penalty Fees: £"+ getPenaltyFees());
        System.out.println("The Annual Account Fees: £"+ getAnnualAccountFees());
    }

    @Override
    public String toString(){
        return super.toString()+","+getPenaltyFees()+",£"+getAnnualAccountFees();
    }
}