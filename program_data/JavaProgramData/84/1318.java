package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int l;
		int m;
		int[] a = new int[100];
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
		l = a[0] > a[1] != 0?a[0]:a[1];
		m = a[0] > a[1] != 0?a[1]:a[0];
		for (i = 2;i < n;i++)
		{
			if (a[i] > l && a[i] > m)
			{
				m = l;
				l = a[i];
			}
			else if (a[i] > m && a[i] < l)
			{
				m = a[i];
			}
		}
		System.out.printf("%d\n%d\n",l,m);
		return 0;
	}
}

