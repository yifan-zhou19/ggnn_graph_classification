package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int t = 0;
		int s = 0;
		int h;
		int l;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] ss = new int[100];
		int[] sz = new int[100];
		int[] xs = new int[100];
		xs[0] = 0;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(ss[i]) = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				(sz[i]) = Integer.parseInt(tempVar3);
			}
			if ((ss[i] <= 140) && (ss[i] >= 90) && (sz[i] <= 90) && (sz[i] >= 60))
			{
			   s++;
			   xs[t] = s;
			}
			else
			{
				s = 0;
				  t++;
			}
		}
		l = t;
		h = xs[0];
		for (t = 0;t <= l;t++)
		{
			if (h < (xs[t]))
			{
			h = xs[t];
			}
		}
		System.out.printf("%d",h);
		return 0;
	}

}

