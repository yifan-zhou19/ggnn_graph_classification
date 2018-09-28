package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int f = new int(int p[5],int n,int m);
		int[][] a = new int[5][5];
		int m;
		int n;
		int i;
		int j;
		int k;
		(int)(*p)[5];
		for (i = 0;i < 5;i++)
		{
		for (j = 0;j < 5;j++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i][j] = Integer.parseInt(tempVar);
			}
		}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		p = a;
		k = f(p, n, m);
		if (k == 0)
		{
			System.out.print("error");
		}
		if (k == 1)
		{
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
		if (j == 0)
		{
			System.out.printf("%d",a[i][j]);
		}
		else
		{
			System.out.printf(" %d",a[i][j]);
		}
			}
		System.out.print("\n");
		}
		}
	}
	public static int f(int[] p, int n, int m)
	{
		int j;
		int temp;
		if (n < 0 || n>4 || m < 0 || m>4)
		{
			return 0;
		}
		else
		{
			for (j = 0;j < 5;j++)
			{
				temp = (p[n] + j);
				*(p[n] + j) = *(p[m] + j);
			*(p[m] + j) = temp;
			}
		}
		return 1;
	}

}

