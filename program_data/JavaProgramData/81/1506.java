package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER WARNING: The following constructor is declared outside of its associated class:
	public static fanwei(int x,int y)
	{
		int z = 1;
		if (x * (x - 4) > 0)
		{
			z = 0;
		}
		if (y * (y - 4) > 0)
		{
			z = 0;
		}
		return (z);
	}
	public static void Main()
	{
		int[][] a = new int[5][5];
		int[] c = new int[5];
		int m;
		int n;
		int i;
		int j;
		for (i = 0;i <= 4;i++)
		{
			for (j = 0;j <= 4;j++)
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
		if (fanwei(m,n) == 0)
		{
			System.out.print("error");
		}
		else if (fanwei(m,n) == 1)
		{
			for (i = 0;i <= 4;i++)
			{
				c[i] = a[m][i];
				a[m][i] = a[n][i];
				a[n][i] = c[i];
			}
			for (i = 0;i <= 4;i++)
			{
				for (j = 0;j <= 3;j++)
				{
					System.out.printf("%d ",a[i][j]);
				}
				System.out.printf("%d\n",a[i][4]);
			}
		}
	}
}

