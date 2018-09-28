package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i = 0;
		int j = 0;
		int m;
		char[][] a = new char[50][100];
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
			m = String.valueOf(a[i]).length();
			if (a[i][m - 2] == 'e' && a[i][m - 1] == 'r')
			{
				a[i][m - 2] = 0;
			}
			else if (a[i][m - 2] == 'l' && a[i][m - 1] == 'y')
			{
				a[i][m - 2] = 0;
			}
			else if (a[i][m - 3] == 'i' && a[i][m - 2] == 'n' && a[i][m - 1] == 'g')
			{
				a[i][m - 3] = 0;
			}
			System.out.printf("%s\n",a[i]);
		}
	}
}

