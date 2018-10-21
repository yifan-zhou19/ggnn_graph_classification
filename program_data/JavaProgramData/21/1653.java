package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int max;
		int min;
		int x;
		int i;
		int n;
		int s = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			max = Integer.parseInt(tempVar2);
		}
		min = max;
		s = max;
		for (i = 1;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				x = Integer.parseInt(tempVar3);
			}
		if (x > max)
		{
			max = x;
		}
		else
		{
			if (x < min)
			{
				min = x;
			}
		}
		s = s + x;
		}
		if (Math.abs(min * n - s) == Math.abs(max * n - s))
		{
			System.out.printf("%d,%d",min,max);
		}
		else
		{
			if (Math.abs(min * n - s) < Math.abs(max * n - s))
			{
				System.out.printf("%d",max);
			}
			else
			{
				System.out.printf("%d",min);
			}
		}
	}
}

