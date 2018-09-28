package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int n;
		int[] z = new int[100];
		int i;
		int e;
		int r;
		r = 0;
		e = -1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < 100;i++)
		{
			z[i] = 0;
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b = Integer.parseInt(tempVar3);
			}
			if (a >= 90 && a <= 140 && b >= 60 && b <= 90)
			{
				z[i] = 1;
				r = 1;
			}
		}
		for (i = e+1;i < n - 1;i++)
		{
			if (z[i] == 1 && z[i + 1] == 1)
			{
				for (e = i + 1;e < n - 1;e++)
				{
					if (z[e] == 1 && z[e+1] == 1)
					{
						continue;
					}
					else
					{
						break;
					}
				}
				if (r < e - i + 1)
				{
					r = e - i + 1;
				}
			}
		}
		System.out.printf("%d",r);
		return 0;
	}


}

