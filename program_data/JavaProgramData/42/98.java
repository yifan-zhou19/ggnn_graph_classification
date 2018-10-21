package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int k;
		int i;
		int m;
		int t;
		int[] a = new int[100001];
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
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			k = Integer.parseInt(tempVar3);
		}
		a[n] = k + 1;
		for (m = 0,i = 0;i < n;i++)
		{
			if (a[i] == k)
			{
				t = i;
				for (i = t;i < n;i++)
				{
					a[i] = a[i + 1];
				}
				a[t] == k != 0 ? (i = t - 1):(i = t);
				m++;
			}
		}
		if (m != n)
		{
			for (i = 0;i < n - m - 1;i++)
			{
				System.out.printf("%d ",a[i]);
			}
			System.out.printf("%d",a[n - m - 1]);
		}
	}
}

