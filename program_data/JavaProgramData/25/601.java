package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int c;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] sz = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		c = 0;
		for (j = 0;j < n;j++)
		{
				for (i = 0;i < 100;i++)
				{
						   sz[i] = sz[i] * 2 + c;
						   if (sz[i] >= 10)
						   {
										 sz[i] -= 10;
										 c = 1;
						   }
										 else
										 {
											   c = 0;
										 }
				}
		}
		 i = 99;
							while (sz[i] == 0)
							{
										   i--;
							}

		  for (;i >= 0;i--)
		  {
						 System.out.printf("%d",sz[i]);
		  }

	return 0;
	}

}

