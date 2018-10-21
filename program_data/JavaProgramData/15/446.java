package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[1000][1000];
	public static int Main()
	{
		int n;
		int i;
		int j;
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		int f;
		int x = 0;
		int y = 0;
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
					a[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}

		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
			   if (a[i][j] == 0)
			   {
				   b = i;
				   c = j;
				   x = 1;
				   break;
			   }

			}
			if (x == 1)
			{
				   break;
			}

		}

		for (i = n - 1;i >= 0;i--)
		{
			for (j = n - 1;j >= 0;j--)
			{
			   if (a[i][j] == 0)
			   {
				   d = i;
				   e = j;
				   y = 1;
				   break;
			   }

			}
			if (y == 1)
			{
				   break;
			}

		}

		f = (d - b - 1) * (e - c - 1);
		System.out.printf("%d",f);


		return 0;
	}

}

