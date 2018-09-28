package <missing>;

public class GlobalMembers
{
	public static int sum;
	public static void print(int[][] a, int m1, int n1, int m2, int n2, int k)
	{
		int i;
		for (i = n1;i < n2 && k != sum;i++)
		{
			System.out.printf("%d\n",a[m1][i]);
			k += 1;
		}
		for (i = m1 + 1;i < m2 && k != sum;i++)
		{
			System.out.printf("%d\n",a[i][n2 - 1]);
			k += 1;
		}
		for (i = n2 - 2;i > n1 && k != sum;i--)
		{
			System.out.printf("%d\n",a[m2 - 1][i]);
			k += 1;
		}
		for (i = m2 - 1;i > m1 && k != sum;i--)
		{
			System.out.printf("%d\n",a[i][n1]);
			k += 1;
		}
		if (n2 - n1 > 2 && m2 - m1 > 2)
		{
			print(a, m1 + 1, n1 + 1, m2 - 1, n2 - 1, k);
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
		sum = m * n;
		print(a, 0, 0, m, n, 0);
	}
}

