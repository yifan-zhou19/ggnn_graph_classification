package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int e = 0;
		int min = 0;
		int max = 0;
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
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] < a[min])
			{
				min = i;
			}
			if (b[i] > b[max])
			{
				max = i;
			}
		}
		for (k = a[min] + 1.0 / 2;k < b[max];k++)
		{
					e = 0;
			for (i = 0;i < n;i++)
			{
				if (k >= a[i] != 0 && k <= b[i])
				{
				e = 1;
				}
			}
			if (e == 0)
			{
				break;
			}
		}
		if (e == 1)
		{
			System.out.printf("%d %d",a[min],b[max]);
		}
		else
		{
			System.out.print("no");
		}
	return 0;
	}
}

