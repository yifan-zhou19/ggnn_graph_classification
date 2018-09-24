package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	   String str = new String(new char[250]);
	   int i;
	   int j;
	   int n;
	   str = new Scanner(System.in).nextLine();
	   for (i = 0;i < str.length();i++)
	   {
		 if (str.charAt(i) != ' ')
		 {
			 System.out.printf("%c",str.charAt(i));
		 }
		 if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ')
		 {
			 System.out.print(" ");
		 }
	   }

	}
}
