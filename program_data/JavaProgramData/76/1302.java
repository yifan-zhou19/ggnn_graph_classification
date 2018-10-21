package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int p;
		int tem;
		int max;
		int[] a = new int[100];
		int[] b = new int[100];
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
		for (i = 0;i < n;i++)
		{
			for (p = 0;p < n - 1;p++)
			{
				if (a[p] > a[p + 1])
				{
					tem = a[p];
					a[p] = a[p + 1];
					a[p + 1] = tem;
					tem = b[p];
					b[p] = b[p + 1];
					b[p + 1] = tem;
				}
			}
		}
	max = b[0];
	for (i = 0;i < n;i++)
	{
		if (a[i] > max)
		{
			System.out.print("no");
			return 0;
		}
		else
		{
			if (b[i] > max)
			{
				max = b[i];
			}
		}
	}
	System.out.printf("%d %d",a[0],max);
		return 0;
	}

}

