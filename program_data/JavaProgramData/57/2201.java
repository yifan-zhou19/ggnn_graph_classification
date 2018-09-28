package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int m;
		char[][] a = new char[50][10];
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
				a[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = (int)String.valueOf(a[i]).length() - 1;j >= 0;j--)
			{
			m = (int)String.valueOf(a[i]).length();
			if (a[i][m - 1] == 'r' && a[i][m - 2] == 'e')
			{
				a[i][m - 2] = '\0';
			}
			if (a[i][m - 1] == 'y' && a[i][m - 2] == 'l')
			{
				a[i][m - 2] = '\0';
			}
			if (a[i][m - 1] == 'g' && a[i][m - 2] == 'n' && a[i][m - 3] == 'i')
			{
				a[i][m - 3] = '\0';
			}
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",a[i]);
		}
	}


}

