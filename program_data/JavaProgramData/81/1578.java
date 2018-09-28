package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER WARNING: The following constructor is declared outside of its associated class:
	public static change(int x,int y)
	{
		int t;
		if (x >= 0 && y <= 4 && x >= 0 && y <= 4)
		{
			t = 1;
		}
		else
		{
			t = 0;
		}
		return (t);
	}

	public static void Main()
	{
		int[][] a = new int[5][5];
		int[] b = new int[5];
		int i;
		int j;
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
		if (change(m,n) == 1)
		{
			for (i = 0;i < 5;i++)
			{
				b[i] = a[m][i];
				a[m][i] = a[n][i];
				a[n][i] = b[i];
			}
			for (i = 0;i < 5;i++)
			{
				for (j = 0;j < 4;j++)
				{
					System.out.printf("%d ",a[i][j]);
				}
				System.out.printf("%d",a[i][4]);
				System.out.print("\n");
			}
		}
		if (change(m,n) == 0)
		{
			System.out.print("error");
		}
	}

}

