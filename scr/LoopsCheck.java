public class LoopsCheck {
    public static void main(String[] args) {
        for (int i = 1; i<100; i++){
            if (i%3 ==0){
                System.out.println("liczba podzielna przez 3 :"+i);
            }
        }

        // odwracanie tablicy
        int[] array= new int[] {1,3,5,7,9};
        for(int j =0; j < array.length/2; j++){ //dojscie do połowy tablicy
            int temp = array[j]; //zmienna tymczasowa
            array[j] = array[array.length-1-j]; //pierwsza cyfra zmienia sie w wartosc ostatniej
            array[array.length-1-j] = temp; // ostatnia wartosc zmienia sie w wartosc pierwsza
            //System.out.println(array[j]);
        }
        for(int j =0; j < array.length; j++){
            System.out.println(array[j]);
        }
    }
}
