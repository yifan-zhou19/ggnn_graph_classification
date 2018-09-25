package <missing>;

public class GlobalMembers
{
	public static int y;
	public static int m;
	public static int d;
	public static int[] a = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public static int[] b = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public static void cal(int x)
	{
		int sum = 0;
		int i;
		if (x != 0)
		{
			for (i = 0;i < m - 1;i++)
			{
				sum += b[i];
			}
			sum += d;
		}
		else
		{
			for (i = 0;i < m - 1;i++)
			{
				sum += a[i];
			}
			sum += d;
		}
		System.out.printf("%d\n",sum);

	}
	public static int Main()
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			y = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			d = Integer.parseInt(tempVar3);
		}
		if (y % 100 == 0)
		{
			if (y % 400 == 0)
			{
				cal(1);
			}
			else
			{
				cal(0);
			}
		}
			else
			{
				if (y % 4 == 0)
				{
					cal(1);
				}
				else
				{
					cal(0);
				}
			}
		return 0;

	}
}

