
public class stringsExample {
	public static void main(String[] args) {
		String s1="Sudhindra Deshpande Entrata";
		String[] str =s1.split(" ");
		
		for(int i=0;i<s1.length();i++)
		{
			System.out.println(s1.charAt(i)+ "\n");
		}
		
		for(int i=s1.length()-1;i>=0;i--)
		{
			System.out.println(s1.charAt(i));
		}
		
	}

}
