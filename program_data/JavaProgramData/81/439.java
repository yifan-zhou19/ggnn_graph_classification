package <missing>;

public class GlobalMembers
{
	public static int exchange(int[] p, int n, int m)
	{
		int i;
		int temp;
		if ((n >= 0 && n <= 4) && (m >= 0 && m <= 4))
		{
			if (m != n)
			{
				for (i = 0;i < 5;i++)
				{
					temp = (p[n] + i);
					*(p[n] + i) = *(p[m] + i);
					*(p[m] + i) = temp;
				}
			}
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static void Main(String[] args)
	{
		int[][] a = new int[5][5];
		int i;
		int j;
		int n;
		int m;
		int num;
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
		num = exchange(a, n, m);
		if (num == 0)
		{
			System.out.print("error");
		}
		else
		{
			for (i = 0;i < 5;i++)
			{
				for (j = 0;j < 5;j++)
				{
					if (j == 4)
					{
						System.out.printf("%d",a[i][j]);
					}
					else
					{
						System.out.printf("%d ",a[i][j]);
					}
					if ((j + 1) % 5 == 0)
					{
						System.out.print("\n");
					}
				}
			}
		}
	}
}

