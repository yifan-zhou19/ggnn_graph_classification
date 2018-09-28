package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct block
	//	{
	//		int a,b;
	//	}
	//	bk[10000];
		for (int q = 0;q < n;q++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				bk[q].a = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				bk[q].b = tempVar3;
			}
		}
		for (int k = 1;k <= n;k++)
		{
			int e = 0;
			for (int i = 0;i < n - k;i++)
			{
				if (bk[i].a > bk[i + 1].a)
				{
				e = bk[i + 1].a;
				bk[i + 1].a = bk[i].a;
				bk[i].a = e;
				e = bk[i + 1].b;
				bk[i + 1].b = bk[i].b;
				bk[i].b = e;
				}
			}
		}
		int max = bk[0].b;
		int min = bk[0].a;
		for (int d = 0;d < n;d++)
		{
			if (max <= bk[d].b)
			{
				max = bk[d].b;
			}
			if (min >= bk[d].a)
			{
				min = bk[d].a;
			}
		}
		int pd = 0;
		for (double t = 1.0 * min;t < max;t += 0.5)
		{
			pd = 0;
			for (int f = 0;f < n;f++)
			{
				if (t >= bk[f].a && t <= bk[f].b)
				{
					pd = 1;
					break;
				}
			}
			if (pd == 0)
			{
				System.out.print("no");
				return 0;
			}
		}
		System.out.printf("%d %d\n",min,max);
		return 0;
	}
}

