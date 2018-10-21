package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i = 0;
		int k;
		int e;
		int t;
		int[] a = new int[50000];
		int[] b = new int[50000];
		int j = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (i < n)
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
			i++;
		}


		for (k = 1;k <= n;k++)
		{
			for (i = 0;i < n - k;i++)
			{
				if (a[i] > a[i + 1])
				{
					e = a[i];
					a[i] = a[i + 1];
					a[i + 1] = e;
					t = b[i];
					b[i] = b[i + 1];
					b[i + 1] = t;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (b[i] < a[i + 1])
			{
				j++;
			}
			else if (b[i] <= b[i + 1])
			{
				a[i + 1] = a[i];
			}
			else if (b[i] > b[i + 1])
			{
				a[i + 1] = a[i];
				b[i + 1] = b[i];
			}
		}
		if (j == 0)
		{
			System.out.printf("%d %d",a[n - 1],b[n - 1]);
		}
		else
		{
			System.out.print("no");
		}
		return 0;
	}
}

