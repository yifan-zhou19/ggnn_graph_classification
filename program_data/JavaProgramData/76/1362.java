package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[10001];
		int[] b = new int[10001];

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(a[i]) = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				(b[i]) = Integer.parseInt(tempVar3);
			}
		}
		for (int k = 1;k <= n;k++)
		{
		for (int i = 0;i < n - k;i++)
		{
			if (a[i] > a[i + 1])
			{
				int e = 0;
				int f = 0;
				e = a[i];
				a[i] = a[i + 1];
				a[i + 1] = e;
				f = b[i];
				b[i] = b[i + 1];
				b[i + 1] = f;
			}
		}
		}
		int c = 0;
		int d;
		d = b[0];
		for (int i = 1;i < n;i++)
		{
			if (d >= a[i])
			{
				c++;
			}
			if (d < b[i])
			{
				d = b[i];
			}
		}
		if (c == n - 1)
		{
			System.out.printf("%d %d",a[0],d);
		}
		else
		{
			System.out.print("no");
		}
		return 0;
	}
}

