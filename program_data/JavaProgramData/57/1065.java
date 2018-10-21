package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[50][33];
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n;i++)
		{
			a[i] = new Scanner(System.in).nextLine();
		}
		for (i = 0;i <= n;i++)
		{
			for (j = 0;j < String.valueOf(a[i]).length();j++)
			{
				if (a[i][j] == 'e' && a[i][j + 1] == 'r' && j == String.valueOf(a[i]).length() - 2 || a[i][j] == 'i' && a[i][j + 1] == 'n' && a[i][j + 2] == 'g' || a[i][j] == 'l' && a[i][j + 1] == 'y')
				{
					a[i][j] = '\0';
				}
			}
		}
		for (i = 0;i <= n;i++)
		{
			System.out.println(a[i]);
		}
		return 0;
	}
}

