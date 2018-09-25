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
		int[] ss = new int[100];
		int[] sz = new int[100];
		int i;
		int[] qk = new int[100];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				ss[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				sz[i] = Integer.parseInt(tempVar3);
			}
		}
		int e;
		for (e = 0;e < n;e++)
		{
			if (ss[e] >= 90 && ss[e] <= 140 && sz[e] >= 60 && sz[e] <= 90)
			{
				qk[e] = 1;
			}
			else
			{
				qk[e] = 0;
			}
		}
		int a = 0;
		int c = 0;
		int r;
		for (r = 0;r < n;r++)
		{
			if (qk[r] == 1)
			{
			  int t;
			  for (t = r;qk[t] == 1;t++)
			  {
				  c++;
			  }
			}
			if (c > a)
			{
				a = c;
			}
			c = 0;
		}
		System.out.printf("%d",a);
		return 0;
	}


}

