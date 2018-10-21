package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int y;
		int[] h = new int[25];
		int[] g = new int[25];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < k;i++)
		{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					h[i] = Integer.parseInt(tempVar2);
				}
		}
		 for (int a = 0;a < k;a++)
		 {
		 g[a] = 1;
		 }
		for (int j = k - 2;j >= 0;j--)
		{
				y = 0;
				for (int i = j + 1;i < k;i++)
				{
							if (h[i] <= h[j])
							{
								if (y < g[i])
								{
								y = g[i];
								}
							}
				}
				g[j] = g[j] + y;
		}
		int d = g[0];
		for (int i = 0;i < k - 1;i++)
		{
				if (d < g[i])
				{
				d = g[i];
				}
		}
		System.out.printf("%d",d);
		System.in.read();
		System.in.read();
		 System.in.read();
		System.in.read();
	}

}

