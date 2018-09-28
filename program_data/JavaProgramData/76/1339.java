package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[50000];
		int[] b = new int[50000];
		int i;
		int n;
		int k;
		int e;
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
				(b[i]) = Integer.parseInt(tempVar3);
			}
		}
		for (k = 1;k <= n - 1;k++)
		{
			for (i = 1;i <= n - k;i++)
			{
				if (a[i] > a[i + 1])
				{
					e = a[i];
					a[i] = a[i + 1];
					a[i + 1] = e;
					e = b[i];
					b[i] = b[i + 1];
					b[i + 1] = e;
				}
			}
		}
		for (i = 1;i <= n - 1;i++)
		{
			if (b[i] < a[i + 1])
			{
				System.out.print("no");
				return 0;
			}
			else
			{
				if (b[i] >= b[i + 1])
				{
					a[i + 1] = a[i];
					b[i + 1] = b[i];
				}
			else
			{
				a[i + 1] = a[i];
			}
			}
		}
		System.out.printf("%d %d",a[n],b[n]);
		return 0;
	}






}

