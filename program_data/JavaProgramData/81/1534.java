package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int f = new int(int x,int y);
		int[][] a = new int[5][5];
		int i;
		int j;
		int[] b = new int[5];
		int m;
		int n;
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
		if (f(m, n) == 0)
		{
			System.out.print("error");
		}
		else if (f(m, n) == 1)
		{
			for (j = 0;j < 5;j++)
			{
				b[j] = a[n][j];
				a[n][j] = a[m][j];
				a[m][j] = b[j];
			}
			for (i = 0;i < 5;i++)
			{
				System.out.print("\n");
				for (j = 0;j < 4;j++)
				{
					System.out.printf("%d ",a[i][j]);
				}
				System.out.printf("%d",a[i][4]);
			}
		}
	}
	public static int f(int m,int n)
	{
		int z;
		if (m >= 0 && m < 5)
		{
			if (n >= 0 && n < 5)
			{
				z = 1;
			}
			else
			{
				z = 0;
			}
		}
		else
		{
			z = 0;
		}
		return (z);
	}





}

