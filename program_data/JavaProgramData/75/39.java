package <missing>;

public class GlobalMembers
{
	/* Note:Your choice is C IDE */
	public static void Main()
	{
		char c;
		int[][] pre = new int[1000][1000];
		int[] beg = new int[1000];
		int[] en = new int[1000];
		int[] pptt = new int[1000];
		int tmax;
		int pmax;
		int p;
		int t;
		int n;
		int sl;
		int i;
		/*????????????*/
		n = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			beg[0] = Integer.parseInt(tempVar);
		}
		do
		{
			n++;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				beg[n - 1] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(null, 1);
			if (tempVar3 != null)
			{
				c = tempVar3.charAt(0);
			}
		}while (c == 44 && n <= 1000);
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			en[0] = Integer.parseInt(tempVar4);
		}
		for (i = 1;i <= n - 1;i++)
		{
			String tempVar5 = ConsoleInput.scanfRead(",");
			if (tempVar5 != null)
			{
				en[i] = Integer.parseInt(tempVar5);
			}
		}
		tmax = en[0];
		for (i = 1;i <= n - 1;i++)
		{
			if (tmax < en[i])
			{
				tmax = en[i];
			}
		}

		/*???????????*/
		for (p = 0;p <= n - 1;p++)
		{
			for (t = 0;t <= tmax - 1;t++)
			{
			pre[p][t] = 0;
			}
		}
		p = 0;
		do
		{
			t = 0;
			do
			{
				if (beg[p] <= t != 0 && (t + 1) <= en[p])
				{
				pre[p][t] = 1;
				}
				t++;
			}while (t <= tmax - 1);
			p++;
		}while (p <= n - 1);

		/*????????*/
		for (i = 0;i <= tmax;i++)
		{
			pptt[i] = 0;
		}
		for (t = 0;t <= tmax - 1;t++)
		{
			for (p = 0;p <= n - 1;p++)
			{
			pptt[t] = pptt[t] + pre[p][t];
			}
		}
		/*?????????*/
		pmax = pptt[0];
	/*    for(t=0;t<=tmax-1;t++)
	    printf("%d ",pre[1][t]);*/
		for (t = 1;t <= tmax - 1;t++)
		{
			if (pmax < pptt[t])
			{
				pmax = pptt[t];
			}
		}

		System.out.printf("%d %d",n,pmax);
	}
}

