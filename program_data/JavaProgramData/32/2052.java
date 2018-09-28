package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[][] j = new int[100][2];
		int i;
		int[][] a = new int[100][100];
		int b;
		int[][] c = new int[100][100];
		int d;
		int p;
		int q;
		int r;
		char[][] e = new char[100][100];
		char[][] f = new char[100][100];
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
				e[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				f[i] = tempVar3.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			j[i][0] = String.valueOf(e[i]).length();
			j[i][1] = String.valueOf(f[i]).length();
			for (p = 0;p < j[i][0];p++)
			{
				 a[i][p] = e[i][j[i][0] - p - 1] - 48;
			}
			for (p = 0;p < j[i][1];p++)
			{
				 c[i][p] = f[i][j[i][1] - p - 1] - 48;
			}
		}
		for (i = 0;i < n;i++)
		{
			for (d = 0;d < j[i][0];d++)
			{
				if (a[i][d] >= c[i][d])
				{
					a[i][d] -= c[i][d];
				}
				else
				{
					a[i][d] = a[i][d] - c[i][d] + 10;
					a[i][d + 1]--;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			for (d = j[i][0] - 1,r = 0;d >= 0;d--)
			{
				if (a[i][d] != 0)
				{
					r++;
				}
				if (r != 0)
				{
				System.out.printf("%d",a[i][d]);
				}
			}
			System.out.print("\n");
		}
	}

}

