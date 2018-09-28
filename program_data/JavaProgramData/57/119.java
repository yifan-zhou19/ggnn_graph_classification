package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int l;
		int n;
		char[][] s = new char[60][60];
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
			l = String.valueOf(s[i]).length();
			  s[i][l - 1] = '\0';
			  s[i][l - 2] = '\0';
		   if (s[i][l - 3] == 'i')
		   {
		   s[i][l - 3] = '\0';
		   }
		   System.out.printf("%s\n",s[i]);
		}
	}

}

