package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int max;
		int min;
		int n;
		int x;
		int y;
		min = 100;
		max = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n == n)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x = Integer.parseInt(tempVar2);
			}
			max = min = x;
		}
		n = n - 1;
		if (n == n)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				x = Integer.parseInt(tempVar3);
			}
			max = max > x != 0?max:x;
			min = min < x != 0?min:x;
		}
		n = n - 1;
		for (n = n;n > 0;n--)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				x = Integer.parseInt(tempVar4);
			}
			if (max == x)
			{
				max = x;
			}
			min = min;
			if (max != x)
			{
				y = max < x != 0?max:x;
				max = max > x != 0?max:x;
				min = min > y != 0?min:y;
			}
		}
		System.out.printf("%d\n%d",max,min);
	}
}

