package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int num;
		int js;
		int[] sz = new int[500];
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
			(sz[i]) = Integer.parseInt(tempVar2);
		}
		}
		   num = 0;
		for (i = 0;i < n;i++)
		{
		if (sz[i] % 2 == 1)
		{
				num++;
		}
		}
		i = 0;
		js = 1;
		while (i < num)
		{
			for (j = 0;j < n;j++)
			{
				if (sz[j] == js)
				{
					System.out.printf("%d",sz[j]);
					i = i + 1;
					   if (i < num)
					   {
				System.out.print(",");
					   }

				}
			}
		js = js + 2;
		}

		return 0;
	}
}

