package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int k;
		 int i;
		 int j;
		 int m;
		 int n;
		 final String str1 = "";
		 final String str2 = "";
		 final String c = "";
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 k = Integer.parseInt(tempVar);
		 }
		 for (i = 0;i < k;i++)
		 {
			 str1 = new Scanner(System.in).nextLine();
			 str2 = new Scanner(System.in).nextLine();
			 System.in.read();
		   m = str1.length();
		   n = str2.length();
		   for (j = 1;j <= n;j++)
		   {
			   if ((str1.charAt(m - j) - str2.charAt(n - j)) >= 0)
			   {
				   str1 = tangible.StringFunctions.changeCharacter(str1, m - j, str1.charAt(m - j) - str2.charAt(n - j));
			   }
		   else
		   {
			   str1 = tangible.StringFunctions.changeCharacter(str1, m - j, str1.charAt(m - j) - str2.charAt(n - j) + 10);
			   str1 = tangible.StringFunctions.changeCharacter(str1, m - j - 1, str1.charAt(m - j - 1) - 1);
		   }
		   str1.charAt(m - j) += 48;
		   }
		   c = tangible.StringFunctions.changeCharacter(c, i, str1);
		 }
		 for (i = 0;i < k;i++)
		 {
			 System.out.printf("%s\n",c.charAt(i));
		 }
	}

}

