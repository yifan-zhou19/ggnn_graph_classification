package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[][] a = new int[100][2];
	int i = 0;
	int x = 0;
	int c = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n;i++)
	{
	for (int j = 0;j < 2;j++)
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
		if (90 <= a[i][0] != 0 && a[i][0] <= 140 && 60 <= a[i][1] != 0 && a[i][1] <= 90)
		{
	   x++;
	   if (x > c)
	   {
		   c = x;
	   }
		}
		else
		{
			x = 0;
		}
	}
	System.out.printf("%d",c);
	 return 0;
	}
}

