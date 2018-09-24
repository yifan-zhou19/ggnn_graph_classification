package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		char[][] s = new char[50][10];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s[i] = tempVar2.charAt(0);
		}
		}
		for (i = 0;i < n;i++)
		{
			if (s[i][String.valueOf(s[i]).length() - 2] == 'e' || s[i][String.valueOf(s[i]).length() - 2] == 'l')
			{
		  s[i][String.valueOf(s[i]).length() - 2] = '\0';
			}
		 else
		 {
			 s[i][String.valueOf(s[i]).length() - 3] = '\0';
		 }
		}
		 for (i = 0;i < n;i++)
		 {
		 System.out.printf("%s\n",s[i]);
		 }
		 return 0;
	}

}

