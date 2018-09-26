package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int a = 0;
		int[] begin = new int[50000];
		int[] end = new int[50000];
		int min;
		int max;
		double b;
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
				begin[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				end[i] = Integer.parseInt(tempVar3);
			}
		}
		min = begin[0];
		max = end[0];
		for (i = 0;i < n;i++)
		{
			if (begin[i] <= min)
			{
				min = begin[i];
			}
			if (end[i] >= max)
			{
				max = end[i];
			}
		}
		for (b = min * 1.0 + 0.1;b < max;b += 1.0)
		{
			for (i = 0;i < n;i++)
			{
				if (b > begin[i] && b < end[i])
				{
					a++;
					break;
				}
			}
		}
		if (a == max - min)
		{
			System.out.printf("%d %d\n",min,max);
		}
		else
		{
			System.out.print("no");
		}
		return 0;
	}

}

