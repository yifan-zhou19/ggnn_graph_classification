package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[50000];
		int[] b = new int[50000];
		int n;
		int i;
		int r;
		int e;
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
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		for (r = n - 1;r > 0;r--)
		{
			for (i = 0;i < r;i++)
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
		for (i = 1;i < n;i++)
		{
			if (a[i] <= b[i - 1] != 0 && b[i - 1]> b[i])
			{
				b[i] = b[i - 1];
			}
			if (a[i] > b[i - 1])
			{
				System.out.print("no");
				break;
			}
			if (i == n - 1)
			{
				System.out.printf("%d %d",a[0],b[n - 1]);
			}
		}
		return 0;
	}

}

