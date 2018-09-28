package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] sz = new int[500];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i] = Integer.parseInt(tempVar2);
			}
		}
		int e;
		for (int z = 1;z <= n;z++)
		{
			for (int s = 0;s < n - z;s++)
			{

				 if (sz[s] > sz[s + 1])
				 {
					e = sz[s + 1];
					sz[s + 1] = sz[s];
					sz[s] = e;
				 }

			}

		}
		int a;
		for (int f = 0;f <= n - 1;f++)
		{
		if (sz[f] % 2 != 0)
		{
			a = sz[f];
		}
		}
	  for (int d = 0;d <= n - 1;d++)
	  {

			if (sz[d] < a && sz[d] % 2 != 0)
			{
		System.out.printf("%d,",sz[d]);
			}

	  }

		System.out.printf("%d",a);


		return 0;
	}
}

