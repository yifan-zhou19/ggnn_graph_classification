package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[10000];
		int[] b = new int[10000];
		int i;
		int k;
		int e;
		int t;
		int min;
		int max;
		int s = 1;

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
				if (a[i] > a[i + 1])
				{
					e = a[i + 1];
					a[i + 1] = a[i];
					a[i] = e;
				}
				if (b[i] > b[i + 1])
				{
					t = b[i + 1];
					b[i + 1] = b[i];
					b[i] = t;
				}
			}
		}
		min = a[0];
		max = b[n - 1];

		for (i = 0;i < n;i++)
		{
			if (b[i] < a[i + 1])
			{
				s = 0;
				System.out.print("no");
				break;
			}
		}
		if (s != 0)
		{
			System.out.printf("%d %d",min,max);
		}

		return 0;
	}
}

