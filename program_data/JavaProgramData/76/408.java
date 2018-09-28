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
		int e;
		int j;
		int m = 0;
		int h = 0;
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
		for (k = 1;k <= n;k++)
		{
			for (i = 0;i < n - k;i++)
			{
				if (b[i] > b[i + 1])
				{
					e = b[i + 1];
					b[i + 1] = b[i];
					b[i] = e;
					e = a[i + 1];
					a[i + 1] = a[i];
					a[i] = e;
				}
				else if (b[i] == b[i + 1])
				{
					if (a[i] > a[i + 1])
					{
						e = a[i + 1];
						a[i + 1] = a[i];
						a[i] = e;
					}
				}
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (!(b[i] >= a[j]))
				{
					m++;
				}
				if (m == n - 1 - i)
				{
					System.out.print("no");
					h = 1;
				}
				if (j == n - 1)
				{
					m = 0;
				}
			}
			if (i == n - 2 && h != 1)
			{
				System.out.printf("%d %d",a[0],b[n - 1]);
			}
		}
		return 0;
	}
}

