package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int l;
		char[][] s = new char[50][50];
		String[] p = new String[50];
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
			p[i] = s[i] + l - 1;
			if (p[i] == 'r')
			{
				*(p[i] - 1) = '\0';
			}
			if (p[i] == 'y')
			{
				*(p[i] - 1) = '\0';
			}
			if (p[i] == 'g')
			{
				*(p[i] - 2) = '\0';
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",s[i]);
		}
	}


}

