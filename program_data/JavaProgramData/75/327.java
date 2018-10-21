package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int s = 100000;
		int d = (-100000);
		int i;
		int[] a = new int[1000];
		int[] x = new int[100000];
		int[] y = new int[100000];
		int k;
		int j;
		int m = 0;
		char c;
		for (i = 0;;i++)
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
			if (x[i] < s)
			{
				s = x[i];
			}
			if (c == '\n')
			{
				break;
			}
		}
		k = (i + 1);
		for (i = 0;i < k;i++)
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
			if (d < y[i])
			{
				d = y[i];
			}
		}
		for (i = s;i < d;i++)
		{
			for (j = 0;j < k;j++)
			{
				if (i >= x[j] != 0 && i < y[j])
				{
					a[i - s] = (a[i - s] + 1);
				}
			}
			if (a[i - s] > m)
			{
				m = a[i - s];
			}
		}
		System.out.printf("%d %d",k,m);
		return 0;
	}

}

