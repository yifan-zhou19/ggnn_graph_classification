package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] b = new int[max];
		int x;
		int n;
		int i;
		int j;
		int[] a = new int[max];
		int sum = 0;
		int r = 0;
		int tem;
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
			sum = sum + a[i];
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n - 1 - i;j++)
			{
				if (a[j] > a[j + 1])
				{
					tem = a[j];
					a[j] = a[j + 1];
					a[j + 1] = tem;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			b[i] = Math.abs(a[i] * n - sum);
		}
		x = b[0];
		for (i = 0;i < n;i++)
		{
			if (b[i] > x)
			{
				x = b[i];
			}
		}
		for (i = 0;i < n;i++)
		{
			if (b[i] == x)
			{
				if (r == 0)
				{
					System.out.printf("%d",a[i]);
				}
				else
				{
					System.out.printf(",%d",a[i]);
				}
				r++;
			}
		}
		return 0;
	}


}

