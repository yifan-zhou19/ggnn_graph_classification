package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int m;
		int n;
		int i;
		int j;
		int t;
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
		if (m < 0 || m>4 || n < 0 || n>4)
		{
			System.out.print("error");
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
				  System.out.printf("%d",a[i][j]);
				  if (j >= 0 && j < 4)
				  {
					  System.out.print(" ");
				  }
				  else
				  {
					  System.out.print("\n");
				  }
			  }
			}
		}
		return 0;
	}
}

