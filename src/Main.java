

public class Main {

    public static void main(String[] args) {
      int[] mass = new int[10];
        int min = mass[0];
        for(int i = 0; i < mass.length; i++){
            mass[i] = (int)((Math.random()*100));
        }
        int mins = mass[0];
        for(int i = 0; i < mass.length; i++){
            if(min > mass[i]){
                min = mass[i];
            }

        }
        System.out.println("min value " + mins);
        }

    }



