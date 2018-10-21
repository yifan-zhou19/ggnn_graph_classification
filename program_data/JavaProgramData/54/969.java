package <missing>;

public class GlobalMembers
{
	public static int time;
	public static int k;
	public static int n;

	public static void calc(int fruit)
	{

		if (fruit < 1)
		{
			time = -2;
		}
		if ((time != -2) && (time != -3))
		{
			if ((fruit % n == k))
			{
				time--;
				if ((time == 0) && (fruit - fruit / n - k > 0))
				{
					time = -3;
				}
				else
				{
					calc(fruit - fruit / n - k);
				}
			}
		}
	}
	public static int Main()
	{
		int i;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		for (i = 1;;i++)
		{
			time = n;
			calc(i);
			if ((time == -3))
			{
				System.out.printf("%d",i);
				break;
			}
		}
		return 0;
	}
}

