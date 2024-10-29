public class NumbofVowels {
    public static void main(String[] args) {
        String name = "KeshuaeiouU";
        int count =0 ;
        name = name.toLowerCase();

        for (int i = 0; i < name.length(); i++) {
            if(name.charAt(i)=='a'|| name.charAt(i)=='e'|| name.charAt(i)=='i'|| name.charAt(i)=='o' || name.charAt(i)=='u' ){
                count+=1;
            }
            
        }
        System.out.println(count);
    }
}
