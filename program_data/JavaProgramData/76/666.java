package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] sz = new int[20001];
		int[] ddz = new int[500000];
		int[] ddy = new int[500000];
		for (i = 0;i < 20001;i++)
		{
			sz[i] = 1;
		}

		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				ddz[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				ddy[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (k = 2 * ddz[i];k < 2 * ddy[i] + 1;k++)
			{
				sz[k] = 0;
			}
		}
		int a;
		for (i = 0;i < n;i++)
		{
			for (k = 0;k < n - 1;k++)
			{
				if (ddz[k] > ddz[k + 1])
				{
					a = ddz[k + 1];
					ddz[k + 1] = ddz[k];
					ddz[k] = a;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			for (k = 0;k < n - 1;k++)
			{
				if (ddy[k] > ddy[k + 1])
				{
					a = ddy[k + 1];
					ddy[k + 1] = ddy[k];
					ddy[k] = a;
				}
			}
		}
		a = 0;
		for (i = 2 * ddz[0];i <= 2 * ddy[n - 1];i++)
		{
			if (sz[i] != 0)
			{
				a++;
			}
		}

		if (a > 0)
		{
			System.out.print("no");
		}
		else
		{
			System.out.printf("%d %d",ddz[0],ddy[n - 1]);
		}
		return 0;
	}




}

