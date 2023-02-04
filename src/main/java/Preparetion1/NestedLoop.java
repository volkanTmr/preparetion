package Preparetion1;

public class NestedLoop {

    public static void main(String[] args) {

        for(int i = 1; i<=4; i++){

            System.out.println(" outer start " + i);

            for(int j =1; j<=4; j++){

                System.out.println(" inner loop" + j);
            }

            System.out.println(" outer finished ");
        }
    }
}
