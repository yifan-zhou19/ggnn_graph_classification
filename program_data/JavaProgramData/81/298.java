package <missing>;

public class GlobalMembers
{
	public static int Main()
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
		if (m > 4 || n > 4)
		{
			System.out.print("error");
			return (0);
		}
		else
		{
			for (i = 0;i < 5;i++)
			{
			   b[i] = a[m][i];
			}
			for (i = 0;i < 5;i++)
			{
			   a[m][i] = a[n][i];
			}
			for (i = 0;i < 5;i++)
			{
			   a[n][i] = b[i];
			}
			for (i = 0;i < 5;i++)
			{
				for (j = 0;j < 5;j++)
				{
				   if (j == 4)
				   {
					 System.out.printf("%d\n",a[i][j]);
				   }
				   else
				   {
					 System.out.printf("%d ",a[i][j]);
				   }
				}
			}
			return (1);
		}
	}
}

