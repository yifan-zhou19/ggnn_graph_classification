package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int flag;
		int min;
		int max;
		int j;
		int[] a = new int[50000];
		int[] b = new int[50000];
		double k;
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
		min = a[0];
		max = b[0];
		for (i = 1;i < n;i++)
		{
			if (a[i] < min)
			{
				min = a[i];
			}
			if (b[i] > max)
			{
				max = b[i];
			}
		}
		flag = 1;
		for (k = min;k <= max;k = k + 0.5)
		{
			for (j = 0;j < n;j++)
			{
				if ((k >= a[j]) && (k <= b[j]))
				{
					flag = 1;
					break;
				}
				else
				{
					flag = 0;
				}
			}
			if (flag == 0)
			{
				System.out.print("no");
				break;
			}
		}
		if (flag == 1)
		{
		System.out.printf("%d %d",min,max);
		}
		return 0;
	}
}

