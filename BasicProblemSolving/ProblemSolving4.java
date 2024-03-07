public class ProblemSolving4 {
    public static void main(String[] args) {

        String s="a!b@c#1$2%3&";
       System.out.println("SPECIAL CHARACTERS REMOVED STRING IS :"+s.replaceAll("[^a-zA-Z0-9]",""));
       String s1="    abc     def  ghi   klm     ";
       System.out.println("EXTRA SPACES REMOVED STRING :"+s1.replaceAll("\\s+"," ").trim());
       //separate;
      s1= s1.replaceAll("\\s+"," ").trim();
       String s2[]=s1.split(" ");
       System.out.println("NUMBER OF WORDS :"+s2.length);
    }
    
}
