package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[30][30];
		int[] c = new int[30];
		int b;
		int j;
		int l;
		int i;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0;i <= n - 1;i++)
		{
			b = 1;
			l = String.valueOf(a[i]).length();
			if ((a[i][0] <= 'z' && a[i][0] >= 'a') || (a[i][0] <= 'Z' && a[i][0] >= 'A') || (a[i][0] == '_'))
			{
			for (j = 1;j <= l - 1;j++)
			{
				if ((a[i][j] <= 'z' && a[i][j] >= 'a') || (a[i][j] <= 'Z' && a[i][j] >= 'A') || (a[i][j] == '_') || ((a[i][j]) <= '9' && a[i][j] >= '0'))
				{
					;
				}
				else
				{
					b = 0;
				}
			}
			}
			else
			{
				b = 0;
			}
			if (b == 0)
			{
				c[i] = 0;
			}
			else
			{
				c[i] = 1;
			}
		}
		for (i = 0;i <= n - 1;i++)
		{
			if (c[i] == 1)
			{
				System.out.print("yes\n");
			}
			else
			{
				System.out.print("no\n");
			}
		}

	}

}

