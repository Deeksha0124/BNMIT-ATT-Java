package Day2;
public class JaggedArrays {
    public static void main(String[] args) {
        //array of arrays (row x col)
        int[][] jagged = {{1,2,3,4},
                         {4,5,6},
                         {7,8}};
        for(int i=0; i< jagged.length; i++){ //3 rows
            for(int j=0; j<jagged[i].length; j++){  //4 cols
                System.out.print(jagged[i][j]+ " ");
            }
            System.out.println();
        }
        //using for each loop -> enhanced for loop
        for(int[] arr : jagged){
            for(int x: arr){
                System.out.print(x + " ");
            }
            System.out.println();
        }
        char[][] languages = {{'J','A','V','A'},
                            {'C','+','+'},
                            {'P','Y','T','H','O','N'}};
        for(char[] ch : languages){
            for(char c : ch){
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}
