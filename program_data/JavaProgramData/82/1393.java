package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int s = 0;
		int d = 0;
		int[] a = new int[100];
		int[] b = new int[100];
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
		}
		for (i = 0;i < n - 1;i++)
		{
			if (a[i] >= 90 && a[i] <= 140 && b[i] >= 60 && b[i] <= 90)
			{
				s += 1;
			}
			else
			{
				if (s > d)
				{
					d = s;
				}
				s = 0;
			}
		}
		if (a[n - 1] >= 90 && a[n - 1] <= 140 && b[n - 1] >= 60 && b[n - 1] <= 90)
		{
			s += 1;
			if (s > d)
			{
				d = s;
			}
		}
		System.out.printf("%d",d);
		return 0;
	}
}

