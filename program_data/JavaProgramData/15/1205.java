package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] sz1 = new int[1000];
		int h;
		int j = 0;
		int k = 0;
		int i;
		int n;
		int mj;
		int a = -1;
		int b = -1;
		int c = 0;
		int d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (h = 0;h < n;h++)
		{
			k = 0;
		for (i = 0;i < n;i++)
		{
			if (a < 0)
			{
			c++;
			}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			sz1[i] = Integer.parseInt(tempVar2);
		}
		if (sz1[i] == 0)
		{
		 a = i;
		 b = h;
		}
		}
		for (i = 0;i < n;i++)
		{
		sz1[i] = 0;
		}
		}
		d = c % n;
		mj = (b - d) * (a - d);
		System.out.printf("%d\n",mj);
		return 0;
	}
}

