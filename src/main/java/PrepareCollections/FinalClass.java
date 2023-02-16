package PrepareCollections;

final class FinalClass {

    // eğer class ı final yaparsanız extend yani inherit edemezsin

     final int a=4; // eğer variable ı final yaparsan değiştiremezsin


    final void  courseMet(){ // eğer method u final yaparsan override yapamazsın

        System.out.println("this is final method");



    }

    public static void main(String[] args) {

        FinalClass abc = new FinalClass();

        //abc.a=9;
    }
}
