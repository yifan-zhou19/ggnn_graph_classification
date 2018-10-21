package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int change = new int(int,int);
		int[][] a = new int[5][5];
		int i;
		int j;
		int n;
		int m;
		int temp;
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
			n = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		if (change(n, m) != 0)
		{
			for (j = 0;j <= 4;j++)
			{
				temp = a[n][j];
				a[n][j] = a[m][j];
				a[m][j] = temp;
			}
			for (i = 0;i <= 4;i++)
			{
				for (j = 0;j <= 4;j++)
				{
					  System.out.printf("%d",a[i][j]);
					if (j != 4)
					{
						System.out.print(" ");
					}
				}
				System.out.print("\n");
			}
			System.out.print("\n");
		}
		else
		{
			System.out.print("error\n");
		}
	}
	public static int change(int n,int m)
	{
		int flag = 0;
		if (n >= 0 && n <= 4 && m >= 0 && m <= 4)
		{
			flag = 1;
		}
		return (flag);
	}
}

