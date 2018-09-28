package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int k;
		int i;
		int j;
		int mid;
		int judge;
		int timer;
		int[] l = new int[100];
		int[] r = new int[100];
		int stop;
		mid = 0;
		judge = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (k = 0;k < n;k++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			if (m == 0)
			{
				r[k] = 60;
			}
			for (i = 0;i < m;i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					l[i] = Integer.parseInt(tempVar3);
				}
			}
			l[m] = 60 - l[m - 1];
			for (i = m - 1;i > 0;i--)
			{
				l[i] = l[i] - l[i - 1];
			}
			for (i = 0;i < m;i++)
			{
				if (mid < 60)
				{
					mid += l[i];
				}
				if (mid >= 60)
				{
					judge = 10000;
					timer = i;
					break;
				}
				if (mid < 60)
				{
					mid += 3;
				}
				if (mid >= 60)
				{
					judge = 33333;
					timer = i;
					break;
				}
			}
		//	printf("judge=%d\n",judge);
			if (judge == 10000)
			{
				r[k] = 60 - 3 * (i);
			}
			else if (judge == 33333)
			{
				r[k] = 60 - 3 * (i) - (3 - (mid - 60));
			}
			else if (judge == 0)
			{
				r[k] = 60 - 3 * i;
			}
			mid = 0;
		}
		for (k = 0;k < n;k++)
		{
			if (k < n - 1)
			{
				System.out.printf("%d\n",r[k]);
			}
			else
			{
				System.out.printf("%d",r[k]);
			}
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			stop = Integer.parseInt(tempVar4);
		}
		return 0;
	}
}

