package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int a;
		int b;
		int e;
		int[] sz = new int[500];
		int[] jishu = new int[500];
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
				sz[i] = Integer.parseInt(tempVar2);
			}
		}
		   for (i = 0;i < n;i++)
		   {
			  if (sz[i] % 2 != 0)
			  {
				jishu[i] = sz[i];
			  }
			if (sz[i] % 2 == 0)
			{
				jishu[i] = 0;
			}
		   }
		for (a = 1;a <= n;a++)
		{
			for (b = 0;b < n - a;b++)
			{
				if (jishu[b] > jishu[b + 1])
				{
				e = jishu[b];
				jishu[b] = jishu[b + 1];
				jishu[b + 1] = e;
				}
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			   if (jishu[i] != 0)
			   {
			System.out.printf("%d,",jishu[i]);
			   }
		}
		  System.out.printf("%d",jishu[n - 1]);


		return 0;


	}
}

