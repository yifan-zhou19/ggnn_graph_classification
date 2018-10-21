package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 String str1 = new String(new char[100]);
		 String str2 = new String(new char[100]);
		 int i;
		 int j;
		 int k;
		 int n;
		 k = 0;
		 str1 = new Scanner(System.in).nextLine();
		 str2 = new Scanner(System.in).nextLine();
		 n = str1.length();
		 if (str2.length() < n)
		 {
			 n = str2.length();
		 }
		 for (i = 0;i <= n;i++)
		 {
			  if (k == 0)
			  {
				  if (str1.charAt(i) > 90)
				  {
					  str1 = tangible.StringFunctions.changeCharacter(str1, i, str1.charAt(i) - 32);
				  }
				  if (str2.charAt(i) > 90)
				  {
					  str2 = tangible.StringFunctions.changeCharacter(str2, i, str2.charAt(i) - 32);
				  }
				  if (str1.charAt(i) > str2.charAt(i))
				  {
					  k = 1;
				  }
				  if (str1.charAt(i) < str2.charAt(i))
				  {
					  k = -1;
				  }
			  }
		 }
		 if (k > 0)
		 {
			 System.out.print(">\n");
		 }
		 if (k < 0)
		 {
			 System.out.print("<\n");
		 }
		 if (k == 0)
		 {
			 System.out.print("=");
		 }
	}
}

