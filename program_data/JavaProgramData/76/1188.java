package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[50000];
		int[] b = new int[50000];
		int i;
		int k;
		int e;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		for (k = 1;k <= n;k++)
		{
			for (i = 0;i < n - k;i++)
			{
				if (a[i] > a[i + 1])
				{
					e = a[i + 1];
					a[i + 1] = a[i];
					a[i] = e;
					e = b[i + 1];
					b[i + 1] = b[i];
					b[i] = e;
				}
			}
		}
		int hb1 = a[0];
		int hb2 = b[0];
		for (i = 0;i < n;i++)
		{
			for (k = 0;k <= i;k++)
			{
				if (b[i] > hb2)
				{
					hb2 = b[i];
				}
			}
			if (a[i + 1] > hb2)
			{
				break;
			}
		}
		if (i != n)
		{
			System.out.print("no");
		}
		if (i == n)
		{
			for (k = 0;k < i;k++)
			{
				if (b[i] > hb2)
				{
					hb2 = b[i];
				}
			}
			System.out.printf("%d %d",hb1,hb2);
		}
		return 0;
	}

}

