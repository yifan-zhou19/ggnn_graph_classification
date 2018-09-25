package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] p = new int[26];
		int[] q = new int[26];
		int a = 0;
		int b;
		int c;
		int d;
		int e;
		int f;
		int g;
		int i;
		int j;
		int k;
		int l;
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p[i] = Integer.parseInt(tempVar2);
			}
		}
		q[k - 1] = 1;
		for (i = k - 2;i >= 0;i--)
		{
			b = 1;
			for (j = i + 1;j < k;j++)
			{
				if (p[i] >= p[j])
				{
					if (q[j] + 1 > b)
					{
						b = q[j] + 1;
					}
				}
			}
			q[i] = b;
		}
		for (i = 0;i < k;i++)
		{
			if (a < q[i])
			{
				a = q[i];
			}
		}
		System.out.printf("%d\n",a);
	return 0;
	}
}

