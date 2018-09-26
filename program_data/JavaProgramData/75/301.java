package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] x = new int[1001];
		int[] y = new int[1001];
		int i;
		int j;
		int m;
		int k = 0;
		int[] a = new int[1001];
		int[] b = new int[1001];
		char c;
		for (i = 1;i < 1001;i++)
		{
			a[i] = i;
		}
		for (i = 1;i < 1001;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				x[i] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				c = tempVar2.charAt(0);
			}
				k += 1;
			if (c != ',')
			{
				break;
			}
		}
		for (i = 1;i <= k;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				y[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(null, 1);
			if (tempVar4 != null)
			{
				c = tempVar4.charAt(0);
			}
		}
		for (i = 1;i <= k;i++)
		{
			for (j = x[i];j < y[i];j++)
			{
				b[j] += 1;
			}
		}
		m = b[1];
		for (i = 2;i < 1001;i++)
		{
			if (b[i] > m)
			{
				m = b[i];
			}
		}
		System.out.printf("%d %d\n",k,m);
		return 0;
	}

}

