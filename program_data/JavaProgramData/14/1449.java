package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[99999];
		int[] b = new int[99999];
		int[] c = new int[99999];
		int[] d = new int[99999];
		int i;
		int n;
		int sum;
		int s;
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
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				c[i] = Integer.parseInt(tempVar4);
			}
			d[i] = c[i] + b[i];
		}
		for (i = 0;i < n;i++)
		{
			if (d[i] >= d[i + 1])
			{
				sum = d[i];
				d[i] = d[i + 1];
				d[i + 1] = sum;
				s = a[i];
				a[i] = a[i + 1];
				a[i + 1] = s;
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			if (d[i] >= d[i + 1])
			{
				sum = d[i];
				d[i] = d[i + 1];
				d[i + 1] = sum;
				s = a[i];
				a[i] = a[i + 1];
				a[i + 1] = s;
			}
		}

		for (i = 0;i < n - 2;i++)
		{
			if (d[i] >= d[i + 1])
			{
				sum = d[i];
				d[i] = d[i + 1];
				d[i + 1] = sum;
				s = a[i];
				a[i] = a[i + 1];
				a[i + 1] = s;
			}
		}
		System.out.printf("%d %d\n%d %d\n%d %d",a[n],d[n],a[n - 1],d[n - 1],a[n - 2],d[n - 2]);
		return 0;
	}

}

