package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER NOTE: This was formerly a static local variable declaration (not allowed in Java):
private static int prt_t = 0;
	public static void prt(int[][] a, int i, int j, int m, int n)
	{
	//C++ TO JAVA CONVERTER NOTE: This static local variable declaration (not allowed in Java) has been moved just prior to the method:
	//	static int t=0;
		System.out.printf("%d\n",a[i][j]);
		if (i == m - 1 || j == 0)
		{
			prt_t++;
			if (prt_t < n)
			{
				prt(a, 0, prt_t, m, n);
			}
			else if (prt_t < m + n - 1)
			{
				prt(a, prt_t - n + 1, n - 1, m, n);
			}
		}
		else
		{
			prt(a, i + 1, j - 1, m, n);
		}
	}
	public static void Main()
	{
		int i;
		int j;
		int m;
		int n;
		int[][] a = new int[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		prt(a, 0, 0, m, n);
	}
}

