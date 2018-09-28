package <missing>;

public class GlobalMembers
{
	public static int cross_out(tangible.RefObject<Integer> q, int n)
	{
		int m = 0;
		int i;
		int j;
		int k;
		for (i = 0;i < n - m;i++)
		{
			for (j = i + 1;j < n - m;j++)
			{
				if (*(q.argValue + i) == *(q.argValue + j))
				{
					for (k = j;k < n - m - 1;k++)
					{
						*(q.argValue + k) = *(q.argValue + k + 1);
					}
					j--;
					m++;
				}
			}
		}
		return m;
	}

	public static void Main()
	{
		int m;
		int n;
		int i;
		int[] a = new int[301];
		int[] p = a;
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
				p + i = tempVar2;
			}
		}
	tangible.RefObject<Integer> tempRef_p = new tangible.RefObject<Integer>(p);
		m = cross_out(tempRef_p, n);
		p = tempRef_p.argValue;
		for (i = 0;i < n - m - 1;i++)
		{
			System.out.printf("%d,",p[i]);
		}
		System.out.printf("%d",p[i]);
		/*printf("%d",m);*/
	}
}

