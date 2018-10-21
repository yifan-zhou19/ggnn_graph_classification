package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int p;
		int q;
		int x;
		char[][][] a = new char[20][2][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 2;j++)
			{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i][j] = tempVar2.charAt(0);
			}
			}
			System.out.print("\n");
		}
		for (i = 0;i < n;i++)
		{
			p = String.valueOf(a[i][0]).length();
			q = String.valueOf(a[i][1]).length();
			for (j = 0;j < q;j++)
			{
				x = a[i][0][p - j - 1] - a[i][1][q - j - 1];
				if (x < 0)
				{
					x = x + 10;
					a[i][0][p - j - 2]--;
				}
				a[i][0][p - j - 1] = x + 48;
			}
			for (k = 0;k < p;k++)
			{
				System.out.printf("%c",a[i][0][k]);
			}
			if (i < n - 1)
			{
				System.out.print("\n");
			}
		}
	}

}

