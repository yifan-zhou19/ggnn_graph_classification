package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[50000];
		int[] b = new int[50000];
		int i;
		int k;
		int d;
		int e;
		int f;
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
				(a[i]) = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		for (k = 1;k < n;k++)
		{
			for (i = 1;i <= n - k;i++)
			{
				if (a[i] > a[i + 1])
				{
					d = a[i];
					a[i] = a[i + 1];
					a[i + 1] = d;
					d = b[i];
					b[i] = b[i + 1];
					b[i + 1] = d;

				}
			}
		}
		d = a[1];
		e = b[1];
		f = 1;
		for (i = 2;i <= n;i++)
		{
			if (a[i] <= e)
			{
				if (b[i] > e)
				{
					e = b[i];
				}
			}
			else
			{
				System.out.print("no");
				f = 0;
				break;
			}
		}
		if (f == 1)
		{
			System.out.printf("%d %d",d,e);
		}
		return 0;
	}
}

