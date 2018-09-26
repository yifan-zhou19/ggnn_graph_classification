package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[5][5];
	public static int change(int m,int n)
	{
			 int i;
			 int j;
			 int t;
		if (n >= 5 || m >= 5)
		{
			return (0);
		}
		else
		{
			for (j = 0;j < 5;j++)
			{
				t = a[m][j];
				a[m][j] = a[n][j];
				a[n][j] = t;
			}
			return (1);
		}
	}

	public static void Main()
	{
			 int m;
			 int n;
			 int i;
			 int j;
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
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		if (change(m, n) == 0)
		{
			System.out.print("error\n");
		}
		else
		{
			for (i = 0;i < 5;i++)
			{
				for (j = 0;j < 5;j++)
				{
							   if (j < 4)
							   {
				 System.out.printf("%d ",a[i][j]);
							   }
				 if (j == 4)
				 {
					 System.out.printf("%d\n",a[i][j]);
				 }
				}
			}
		}
	}

}

