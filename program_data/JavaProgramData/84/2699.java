package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int t;
		int x;
		int max;
		int secondmax;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			t = Integer.parseInt(tempVar2);
		}
		max = secondmax = t;
		for (i = 1;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				x = Integer.parseInt(tempVar3);
			}

			if (x > max)
			{
				secondmax = max;
				max = x;
			}
			else if (x > secondmax)
			{
				secondmax = x;

			}
		}
		System.out.printf("%d\n%d\n", max, secondmax);
	}
}

