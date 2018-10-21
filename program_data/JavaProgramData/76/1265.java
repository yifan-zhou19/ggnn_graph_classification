package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int n;
		int e;
		int max;
		int u = 0;
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
		max = b[0];
		for (i = 0;i < n;i++)
		{
			if (max < a[i])
			{
				u = 1;
				break;
			}
			else
			{
				if (max <= b[i])
				{
					max = b[i];
				}
			}
		}
		if (u == 0)
		{
			System.out.printf("%d %d",a[0],max);
		}
		else
		{
			System.out.print("no");
		}
		return 0;
	}
}

