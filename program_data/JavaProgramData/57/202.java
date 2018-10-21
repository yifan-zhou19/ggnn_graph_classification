package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int m;
		int i;
		char[][] a = new char[50][20];
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
			if (m > 1)
			{
				if (a[i][m - 1] == 'r' && a[i][m - 2] == 'e')
				{
					a[i][m - 2] = 0;
				}
				if (a[i][m - 1] == 'y' && a[i][m - 2] == 'l')
				{
					 a[i][m - 2] = 0;
				}
			}
			if (m > 2)
			{
				if (a[i][m - 1] == 'g' && a[i][m - 2] == 'n')
				{
					  if (a[i][m - 3] == 'i')
					  {
						a[i][m - 3] = 0;
					  }
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (i > 0)
			{
				System.out.print("\n");
			}
			System.out.printf("%s",a[i]);
		}
	}

}

