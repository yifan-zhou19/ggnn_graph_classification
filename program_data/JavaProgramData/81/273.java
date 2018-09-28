package <missing>;

public class GlobalMembers
{
	public static int num(int a,int b)
	{
		int p;
		if (a <= 4 && b <= 4)
		{
			p = 1;
		}
		else
		{
			p = 0;
		}
		return (p);
	}
	public static void Main()
	{
		int num = new int(int a,int b);
		int[][] a = new int[5][5];
		int i;
		int j;
		int m;
		int n;
		int c;
		int d = 0;
		int t = 0;
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
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}
		c = num(m, n);
		if (c == 0)
		{
			System.out.print("error\n");
		}
		else
		{
			for (i = 0;i < 5;i++)
			{
				t = a[m][i];
				a[m][i] = a[n][i];
				a[n][i] = t;
			}
			for (i = 0;i < 5;i++)
			{
				for (j = 0;j < 5;j++)
				{
					if (j % 5 - 4 != 0)
					{
						System.out.printf("%d ",a[i][j]);
					}
					else
					{
						System.out.printf("%d",a[i][j]);
					}
					d = d + 1;
					if (d % 5 == 0)
					{
						System.out.print("\n");
					}
				}
			}
		}
	}

}

