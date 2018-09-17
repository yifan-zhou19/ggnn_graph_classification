package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int y;
		int i = 1;
		int j = 1;
		int[] a = new int[20];
		int[] b = new int[20];
		int k;
		int s;
		int f = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
		a[1] = x;
		b[1] = y;
		while (x > 0)
		{
				   i++;
				   a[i] = x / 2;
				   x = x / 2;
		}
		while (y > 0)
		{
				   j++;
				   b[j] = y / 2;
				   y = y / 2;
		}
		for (k = 1;k <= i;k++)
		{
						  for (s = 1;s <= j;s++)
						  {
											if (a[k] == b[s])
											{
														  if (f == 0)
														  {
															  System.out.printf("%d", a[k]);
																   f = 1;
														  }
											}
						  }
		}
		return 0;
	}

}

