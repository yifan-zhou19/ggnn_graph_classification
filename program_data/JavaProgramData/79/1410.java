package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		for (t = 0;1;t++)
		{
		int n;
		int m;
		int[] a = new int[301];
		int i;
		int r;
		int x;
		int y = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		if (n == 0 && m == 0)
		{
					   break;
		}
		x = n;
		for (i = 0;i < n;i++)
		{
						 a[i] = i;
		}
		for (i = 0;1;i++)
		{
				  if (a[i] == i)
				  {
							  y++;
				  }
				  if (y == m)
				  {
						   a[i] = -1;
						   y = 0;
						   x--;
				  }
				  if (x == 1)
				  {
						   for (r = 0;r < n;r++)
						   {
											if (a[r] != -1)
											{
														System.out.printf("%d\n",a[r] + 1);
											}
						   }
						   break;
				  }
				  if (i == n - 1)
				  {
							 i = -1;
				  }


		}
		}
		return 0;
	}
}

