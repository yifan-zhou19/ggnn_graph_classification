package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		char[][] a = new char[21][21];
		int[][] b = new int[21][21];
		int[] c = new int[100];
		for (i = 0;i < n;i++)
		{
			c[i] = 0;
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 21;j++)
			{
				b[i][j] = 0;
			}
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
			for (j = 0;j < String.valueOf(a[i]).length();j++)
			{
				if (((a[i][j] >= '0') && (a[i][j] <= '9')) || ((a[i][j] >= 'a') && (a[i][j] <= 'z')) || ((a[i][j] >= 'A') && (a[i][j] <= 'Z')) || (a[i][j] == '_'))
				{
					b[i][j] = 0;
				}
				else
				{
					b[i][j] = 1;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if ((a[i][0] >= '0') && (a[i][0] <= '9'))
			{
				b[i][0] = 1;
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 21;j++)
			{
				c[i] = c[i] + b[i][j];
			}
		}
		for (i = 0;i < n;i++)
		{
			if (c[i] == 0)
			{
				System.out.print("yes\n");
			}
			else
			{
				System.out.print("no\n");
			}

		}
		return 0;
	}
}

