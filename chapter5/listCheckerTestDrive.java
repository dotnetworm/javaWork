public class listCheckerTestDrive {
    public static void main(String[] args){
        listChecker checkMe = new listChecker();
        int[] checkable = {3,5,8};
        int limitable = 15;
        checkMe.setListValues(checkable);
        checkMe.getListValues();

        checkMe.setUpperLimit(limitable);
        checkMe.countUp();


        checkMe.setRandom();
        checkMe.countRandom();
    }
}