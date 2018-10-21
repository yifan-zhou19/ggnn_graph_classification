package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
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
		int min = a[0];
		int max = b[0];
		for (i = 0;i < n;i++)
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
		int count;
		int legal = 0;
		double k;
		for (k = (double)min;k <= (double)max;k = k + 0.5)
		{
			for (j = 0,count = 0;j < n;j++)
			{
				if (k >= a[j] != 0 && k <= b[j])
				{
					count++;
				}
			}
			if (count == 0)
			{
				System.out.print("no");
				break;
			}
			else
			{
				legal++;
			}
		}
		if (legal == (max - min) * 2 + 1)
		{
			System.out.printf("%d %d",min,max);
		}
		return 0;

	}
}

