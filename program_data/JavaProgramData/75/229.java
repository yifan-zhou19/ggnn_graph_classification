package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int[] a = new int[10000];
		int[] b = new int[10000];
		int t = 0;
		int[] p = new int[1000];
		int n;
		int q;
		char c = ',';
		for (i = 0;c == ',';i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			c = System.in.read();
		}
		for (j = 0;j < i;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b[j] = Integer.parseInt(tempVar2);
			}
			c = System.in.read();
		}
		System.out.printf("%d ",i);
		n = i;
		k = 0;
		for (t = 0;t <= 999;t++)
		{
			for (i = 0;i < n;i++)
			{
				if (a[i] <= t != 0 && b[i] >= t + 1)
				{
					p[k] = p[k] + 1;
				}
				else
				{
					;
				}
			}
			k = k + 1;
		}
		q = p[0];
		for (i = 0;i < k;i++)
		{
			if (p[i] > q)
			{
				q = p[i];
			}
			else
			{
				;
			}
		}
		System.out.printf("%d",q);
		return 0;
	}
}

