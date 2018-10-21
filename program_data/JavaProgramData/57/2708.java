package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		char[][] a = new char[50][20];
		char[][] b = new char[50][20];
		int[] t = new int[50];
		int i;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = tempVar2.charAt(0);
			}
			t[i] = String.valueOf(a[i]).length();
			if (a[i][t[i] - 1] == 'r')
			{
				int j;
				for (j = 0;j < t[i] - 2;j++)
				{
					b[i][j] = a[i][j];
				}

			}
			else if (a[i][t[i] - 1] == 'g')
			{
				int j;
				for (j = 0;j < t[i] - 3;j++)
				{
					b[i][j] = a[i][j];
				}

			}
			else if (a[i][t[i] - 1] == 'y')
			{
				int j;
				for (j = 0;j < t[i] - 2;j++)
				{
					b[i][j] = a[i][j];
				}

			}
		}
		for (i = 0;i < n;i++)
		{
			int j;
			if (a[i][t[i] - 1] == 'r' || a[i][t[i] - 1] == 'y')
			{
				for (j = 0;j < t[i] - 2;j++)
				{
					System.out.printf("%c",b[i][j]);
				}
			}
			else if (a[i][t[i] - 1] == 'g')
			{
				for (j = 0;j < t[i] - 3;j++)
				{
					System.out.printf("%c",b[i][j]);
				}
			}
			System.out.print("\n");
		}
		return 0;
	}
}

