package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int same;
		int i;
		int j;
		int k;
		String str = new String(new char[100]);
		String sub = new String(new char[100]);
		String repl = new String(new char[100]);
	   str = new Scanner(System.in).nextLine();
	   sub = new Scanner(System.in).nextLine();
	   repl = new Scanner(System.in).nextLine();
	   for (i = 0;i < str.length();i++)
	   {
		   same = 1;
		 for (j = 0;j < sub.length();j++)
		 {
			 if (str.charAt(i + j) != sub.charAt(j))
			 {
		  same = 0;
			 }
		 }
		 if ((same == 1 && str.charAt(i - 1) == ' ') || (same == 1 && i == 0))
		 {
			 System.out.printf("%s",repl);
		   i += sub.length() - 1;
		 }
		 else
		 {
		 System.out.printf("%c",str.charAt(i));
		 }

	   }
	   return 0;
	}

}
