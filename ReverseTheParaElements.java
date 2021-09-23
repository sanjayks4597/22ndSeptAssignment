package Problems;

public class ReverseTheParaElements {
   public static void main(String[] args) {
	String str="Geekster Is Academy";
	String word[]=str.split(" ");
	String reversedString="";
	for(int i=0;i<word.length;i++)
	{
		String revStr=reverseString(word[i]);
		reversedString=reversedString+" "+revStr;
	}
	System.out.print("Reverse of This :"+reversedString);
	
}
   public static String reverseString(String revStr) {
	   
	   String str1="";
	   for(int i=revStr.length()-1;i>=0;i--)
	   {
		   str1=str1+revStr.charAt(i);
	   }
	   
	   return str1;
   }
   
}
