package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[50000];
		int[] b = new int[50000];
		int n;
		int i;
		int r = 0;
		int k;
		int x;
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
		for (k = 0;k < n - 1;k++)
		{
			for (i = n - 1;i > k;i--)
			{
				if (a[i] < a[i - 1])
				{
					x = a[i];
					a[i] = a[i - 1];
					a[i - 1] = x;
					x = b[i];
					b[i] = b[i - 1];
					b[i - 1] = x;
				}
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			if (b[i] < a[i + 1])
			{
				r++;
			}
			if (b[i] >= b[i + 1])
			{
				x = b[i];
				b[i] = b[i + 1];
				b[i + 1] = x;
			}
		}
		if (r != 0)
		{
			System.out.print("no");
		}
		else
		{
			System.out.printf("%d %d",a[0],b[n - 1]);
		}
		return 0;
	}

}

