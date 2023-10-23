class BankAccountMain {
    public static void main(String[] args){

        BankAccount account = new BankAccount();

        account.setName("Elena Realisan");
        account.setAge(20);
        account.setAccountNumber(20211758);
        account.deposit(40000.0);
        account.deposit(4000.0);
        account.displaySummary();
    }
}