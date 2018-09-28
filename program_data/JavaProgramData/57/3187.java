package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] a = new char[100][100];
		char[][] b = new char[100][100];
		int[] c = new int[100];
		int n;
		int i;
		int j;
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
			c[i] = String.valueOf(a[i]).length();
			if (a[i][c[i] - 1] == 'r' || a[i][c[i] - 1] == 'y')
			{
				for (j = 0;j < c[i] - 2;j++)
				{
					b[i][j] = a[i][j];
				}
				b[i][c[i] - 2] = '\0';
			}
				else
				{
				for (j = 0;j < c[i] - 3;j++)
				{
					b[i][j] = a[i][j];
					b[i][c[i] - 3] = '\0';
				}
				}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s",b[i]);
			if (i < n - 1)
			{
				System.out.print("\n");
			}
		}
	}
}

