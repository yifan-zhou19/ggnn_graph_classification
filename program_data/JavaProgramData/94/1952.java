package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int t;
		int[] shuzu = new int[500];
		int[] shushu = new int[500];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
						 String tempVar2 = ConsoleInput.scanfRead();
						 if (tempVar2 != null)
						 {
							 shuzu[i] = Integer.parseInt(tempVar2);
						 }
						 if (shuzu[i] % 2 != 0)
						 {
										   shushu[i] = shuzu[i];
						 }
		}
		for (k = 1;k <= n;k++)
		{
						 for (i = 0;i < n - k;i++)
						 {
											if (shushu[i] > shushu[i + 1])
											{
																	  t = shushu[i + 1];
																	  shushu[i + 1] = shushu[i];
																	  shushu[i] = t;
											}
						 }
		}
	   for (i = 0;i < n;i++)
	   {
						if ((shushu[i] != 0) && (i != n - 1))
						{
										 System.out.printf("%d,",shushu[i]);
						}
						if (i == n - 1)
						{
								   System.out.printf("%d",shushu[i]);
						}
	   }
	   return 0;
	}
}

