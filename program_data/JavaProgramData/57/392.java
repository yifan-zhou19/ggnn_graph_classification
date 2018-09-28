package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m = 0;
		int n;
		int j = 0;
		char[][] s = new char[50][20];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (m = 0;m < n;m++)
		{
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   s[m] = tempVar2.charAt(0);
		   }
		}
		 for (m = 0;m < n;m++)
		 {
			 j = String.valueOf(s[m]).length();
			 if ((s[m][j - 1] == 'r') && (s[m][j - 2] == 'e'))
			 {
				s[m][j - 2] = '\0';
			 }
			 else if ((s[m][j - 1] == 'y') && (s[m][j - 2] == 'l'))
			 {
				s[m][j - 2] = '\0';
			 }
			 else if ((s[m][j - 1] == 'g') && (s[m][j - 2] == 'n') && (s[m][j - 3] == 'i'))
			 {
				 s[m][j - 3] = '\0';
			 }
		 }
		   for (m = 0;m < n;m++)
		   {
		   System.out.printf("%s\n",s[m]);
		   }
		 return 0;
	}

}

