package <missing>;

public class GlobalMembers
{
	public static int[] sum = new int[99999];
	public static int[] m = new int[99999];
	public static void Main(String[] args)
	{
		int n;
		int i;
		int b;
		int c;
		int a;
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
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				c = Integer.parseInt(tempVar4);
			}
			sum[i] = b + c;
			m[i] = a;
		}
		int j;
		int k;
		int t;
		int x;
		int l = 0;
		for (j = 0;j < n;j++)
		{
			for (k = n - 1;k > j;k--)
			{
				if (sum[k] > sum[k - 1])
				{
					t = sum[k - 1];
					sum[k - 1] = sum[k];
					sum[k] = t;
					x = m[k - 1];
					m[k - 1] = m[k];
					m[k] = x;
				}
			}
			l++;
			if (l == 3)
			{
				break;
			}
		}
		for (i = 0;i < l;i++)
		{
		System.out.printf("%d %d\n",m[i],sum[i]);
		}
	}

}

