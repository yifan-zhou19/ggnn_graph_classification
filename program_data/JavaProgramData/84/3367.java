package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int k;
		int l;
		int m;
		int n;
		int[] a = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		m = a[1];
		for (i = 2;i <= n;i++)
		{
			if (a[i] > m)
			{
				m = a[i];
			}
		}
		System.out.printf("%d\n",m);
		for (i = 1;i <= n;i++)
		{
			if (a[i] < m)
			{
				k = a[i];
			}
			break;
		}
		for (i = 1;i <= n;i++)
		{
			if (a[i] > k && a[i] < m)
			{
				k = a[i];
			}
		}
		System.out.printf("%d",k);
	}
}

