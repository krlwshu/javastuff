public class Premiere extends Account {
    float overDraft, interestRate;

    public Premiere (String pname, String pAccNum, String accType, int pPin, float pDeposit, float overDraft, float interestRate){
        super(pname, pAccNum, accType, pPin, pDeposit);
        this.overDraft = overDraft;
        this.interestRate = interestRate;


    }

    public float getOverDraft(){
        return overDraft;
    }
    public float getInterestRate(){
        return interestRate;
    }


    public  float calculateInterest(float balance){
        float interest= balance * interestRate;
        return interest;

    }

    @Override
    public void printStatement(){
        super.printStatement();
        System.out.println("Overdraft Amount: £"+ getOverDraft());
        System.out.println("Interest: £"+ calculateInterest(getBalance()));
    }

    @Override
    public String toString(){
        return super.toString()+",£"+getOverDraft()+",£"+calculateInterest(getBalance());
    }

}
