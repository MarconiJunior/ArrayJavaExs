import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int chooseArray = 0;
        System.out.println("Dígite o valor do vetor:");
        chooseArray = scan.nextInt();
        String[] array = new String[chooseArray];
        int yesOrNo = 0;



        for (int i = 0; i < array.length; i++) {
            System.out.println("Dígite um dado para ser inserido no vetor:");
            array[i] = scan.next();

        }
        System.out.println(Arrays.toString(array));
        while(true) {
            System.out.println("Dígite o elemento do vetor que deseja ver: | Digite sair para parar");
            String chooseElement = scan.next();
        if (chooseElement.equals("sair")) {
            break;
        } else {
            for (int i = 0; i < array.length; i++) {
                if (chooseElement.equals(array[i])) {
                    System.out.println("O valor "+chooseElement+" se encontra no array e se encontra no índice: "+i+ ".");
                    yesOrNo += 1;
                    break;
                } if (yesOrNo == 0){
                    System.out.println("O valor "+chooseElement+" não se encontra no vetor");
                }
            }
        }
       }
    }
}
