public class Exam03 {
    public static void main(String[] args){

        int n = 4;

        for(int i = 0; i < n; i++){
            String str = " ";
            for(int j = 0; j < n - i; j++) str += " ";
            for(int j = 0; j < i * 2 + 1; j++) str += "*" ;
            System.out.println(str);
        }
    }
}
