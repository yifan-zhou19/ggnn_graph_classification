package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[10000];
		int[] b = new int[10000];
		int num = 0;
		int i;
		int k = 0;
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
				(a[i]) = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] % 2 != 0)
			{
				b[k] = a[i];
				num++;
				k++;
			}
		}
		for (int p = 1;p <= num;p++)
		{
			int min;
			int e;
			min = 0;
			for (k = 0;k <= num - p;k++)
			{
				if (b[min] > b[k])
				{
					min = k;
				}
			}
			if (min != num - p)
			{
				e = b[min];
				b[min] = b[num - p];
				b[num - p] = e;
			}
			if (p != num)
			{
				System.out.printf("%d,",b[num - p]);
			}
			if (p == num)
			{
				System.out.printf("%d",b[num - p]);
			}
		}
		return 0;
	}
}

