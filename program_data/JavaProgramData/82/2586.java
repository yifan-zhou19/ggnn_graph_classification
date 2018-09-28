package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int i;
		int[] x = new int[100];
		int[] y = new int[100];
		int s = 0;
		int k;
		int m;
		int e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
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
			if ((a >= 90 && a <= 140) && (b <= 90 && b >= 60))
			{
				x[i] = 1;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (x[i] == 1)
			{
				while (x[i] == 1)
				{
					y[s] = y[s] + 1;
					i++;
				}
				s = s + 1;
			}
		}
		for (k = 1;k <= s;k++)
		{
			for (m = 0;m < s - k + 1;m++)
			{
				if (y[m] < y[m + 1])
				{
					e = y[m];
					y[m] = y[m + 1];
					y[m + 1] = e;
				}
			}
		}
		System.out.printf("%d",y[0]);
		return 0;
	}

}

