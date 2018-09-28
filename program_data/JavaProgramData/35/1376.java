package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[N][N];
		int t;
		int r;
		int T;
		int R;
		int x;
		int y;
		int i;
		int l;
		int k = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			R = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			T = Integer.parseInt(tempVar2);
		}
		for (r = 0;r < R;r++)
		{
			for (t = 0;t < T;t++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[r][t] = Integer.parseInt(tempVar3);
				}
			}
		}

		for (r = 0;r < R;r++)
		{
			for (t = 0;t < T;t++)
			{
				  for (x = 0,i = 0;x < T;x++)
				  {
					  if (a[r][x] <= a[r][t])
					  {
						   i++;
					  }
				  }
				  for (y = 0,l = 0;y < R;y++)
				  {
					  if (a[y][t] >= a[r][t])
					  {
						  l++;
					  }
				  }
				  if (i >= T != 0 && l >= R)
				  {
					  System.out.printf("%d+%d",r,t);
					  k++;
				  }
			}
		}
		if (k == 0)
		{
			System.out.print("No");
		}
		return 0;
	}
}

