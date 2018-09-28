package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int i;
		int t;
		int p;
		int q;
		int[] sz = new int[500];
		int[] js = new int[500];
		t = -1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		for (i = 0;i < N;i++)
		{
			if (i < N - 1)
			{
			   String tempVar2 = ConsoleInput.scanfRead();
			   if (tempVar2 != null)
			   {
				   sz[i] = Integer.parseInt(tempVar2);
			   }
			}
			else
			{
			   String tempVar3 = ConsoleInput.scanfRead();
			   if (tempVar3 != null)
			   {
				   sz[i] = Integer.parseInt(tempVar3);
			   }
			}
		}
		for (i = 0;i < N;i++)
		{
			if (sz[i] % 2 == 1)
			{
			   t++;
			   js[t] = sz[i];
			}
		}
		for (q = 1;q <= t + 1;q++)
		{
		for (p = 0;p < t;p++)
		{
			if (js[p] > js[p + 1])
			{
			  int e = js[p];
			  js[p] = js[p + 1];
			  js[p + 1] = e;
			}
		}
		}
		for (p = 0;p <= t;p++)
		{
				if (p < t)
				{
				   System.out.printf("%d,",js[p]);
				}
				else
				{
				   System.out.printf("%d",js[p]);
				}
		}
		return 0;
	}
}

