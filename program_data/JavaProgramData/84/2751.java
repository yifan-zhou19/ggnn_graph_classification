package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int n;
		int[] a = new int[100];
		int m;
		int cm;
		int max;
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
		m = 0;

		for (i = 1;i < n;i++)
		{
			if (a[i] > a[m])
			{
				m = i;
			}
		}
		cm = 0;
		max = a[m];
		a[m] = 0;

		for (i = 0;i < n;i++)
		{
			if (a[i] > a[cm])
			{
				cm = i;
			}
		}
		System.out.printf("%d\n%d\n",max,a[cm]);
	}


}

