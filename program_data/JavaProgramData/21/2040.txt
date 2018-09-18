package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int min;
		int max;
		int x;
		int n;
		int i;
		int s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			x = Integer.parseInt(tempVar2);
		}
		s = max = min = x;
		for (i = 1;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				x = Integer.parseInt(tempVar3);
			}
			if (min > x)
			{
				min = x;
			}
			if (max < x)
			{
				max = x;
			}
			s = s + x;
		}
		if ((n * max - s) > (s - n * min))
		{
			System.out.printf("%d",max);
		}
		if ((n * max - s) < (s - n * min))
		{
			System.out.printf("%d",min);
		}
		if ((n * max - s) == (s - n * min))
		{
			System.out.printf("%d,%d",min,max);
		}
	}
}

