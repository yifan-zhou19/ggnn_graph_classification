package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] extent = new int[10001];
		int n;
		int i;
		int min;
		int max;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			int a;
			int b;
			int j;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b = Integer.parseInt(tempVar3);
			}
			if (i == 0)
			{
				min = a;
				max = b;
			}
			else
			{
				if (min > a)
				{
					min = a;
				}
				if (max < b)
				{
					max = b;
				}
			}
			for (j = 2 * a - 1;j <= 2 * b - 1;j++)
			{
				extent[j] = 1;
			}
		}
		for (i = 2 * min - 1;i <= 2 * max - 1;i++)
		{
			if (extent[i] == 0)
			{
				break;
			}
		}
		if (i == 2 * max)
		{
			System.out.printf("%d %d\n",min,max);
		}
		else
		{
			System.out.print("no");
		}
	}
}

