package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[50000];
		int[] b = new int[50000];
		int i;
		int count = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int min = 10000;
		int max = 0;
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
			if (a[i] < min)
			{
				min = a[i];
			}
			if (b[i] > max)
			{
				max = b[i];
			}
		}
		double k;
		if (min == max)
		{
			System.out.printf("%d %d",min,max);
		}
		else
		{
			for (k = min + 0.5;k < max;k++)
			{
				int mark = 0;
				for (i = 0;i < n;i++)
				{
					if (k > a[i] && k < b[i])
					{
						mark = 1;
						break;
					}
				}
				if (mark == 1)
				{
					count++;
				}
			}
			if (count == (max - min))
			{
				System.out.printf("%d %d",min,max);
			}
			else
			{
				System.out.print("no");
			}
		}
		return 0;
	}
}

