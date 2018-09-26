package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int n;
		int c;
		int d;
		int e;
		int f;
		int g;
		int[] sz = new int[500];
		int[] Sz = new int[250];
		a = 0;
		b = 0;
		c = 0;
		d = 0;
		e = 0;
		g = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (b = 0;b < n;b++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[b] = Integer.parseInt(tempVar2);
			}
		}
		for (a = 0;a < n;a++)
		{

				if (sz[a] % 2 != 0)
				{

				Sz[c] = sz[a];

				c++;
				}

		}
		for (d = 0;d < c;d++)
		{
			for (e = 0;e < c;e++)
			{
				if (Sz[e] > Sz[e+1])
				{
					  f = Sz[e];
					  Sz[e] = Sz[e+1];
					  Sz[e+1] = f;
				}
			}
		}
		for (g = 1;g < c;g++)
		{
			System.out.printf("%d,",Sz[g]);
		}
		System.out.printf("%d",Sz[c]);
		return 0;
	}

}

