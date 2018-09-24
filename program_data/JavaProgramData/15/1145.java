package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[][] u = new int[1000][1000];
		int i;
		int j;
		int chang = 0;
		int bian = 0;
		int sum;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				u[i][j] = Integer.parseInt(tempVar2);
			}
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (u[i][j] == 0)
				{
					chang = chang + 1;
				}
			}
			if (chang != 0)
			{
				break;
			}
		}

		for (j = 0;j < n;j++)
		{
			for (i = 0;i < n;i++)
			{
				if (u[i][j] == 0)
				{
					bian = bian + 1;
				}
			}
			if (bian != 0)
			{
				break;
			}
		}
	   sum = (chang - 2) * (bian - 2);
	  System.out.printf("%d",sum);

		  return 0;
	}


}

