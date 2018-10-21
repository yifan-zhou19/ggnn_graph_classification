package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int min;
		int max;
		int[] a = new int[50000];
		int[] b = new int[50000];
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
		for (m = n - 1;m > 0;m--)
		{
			for (i = 0;i < m;i++)
			{
				if (a[i] > a[i + 1])
				{
					min = a[i + 1];
					a[i + 1] = a[i];
					a[i] = min;
					min = b[i + 1];
					b[i + 1] = b[i];
					b[i] = min;
				}
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			if (a[i + 1] > b[i])
			{
				System.out.print("no\n");
				break;
			}
			else
			{
				if (b[i] >= b[i + 1])
				{
					max = b[i];
					b[i] = b[i + 1];
					b[i + 1] = max;
				}
			}
		}
		if (i == n - 1)
		{
			System.out.printf("%d %d\n",a[0],max);
		}
		return 0;
	}
}

