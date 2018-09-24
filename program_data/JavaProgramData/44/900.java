package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int reverse = int num;
		int[] a = new int[6];
		int i;
		for (i = 0;i < 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
		}
		for (i = 0;i < 6;i++)
		{
			System.out.printf("%d\n",reverse(a[i]));
		}
	}

	public static int reverse(int num)
	{
		int n;
		if (-10 < num && 10> num)
		{
			n = num;
		}
		else if (-100 < num && 100> num)
		{
			n = (num - (num / 10) * 10) * 10 + num / 10;
		}
		else if (-1000 < num && 1000> num)
		{
			n = (num - (num / 10) * 10) * 100 + (num / 10 - (num / 100) * 10) * 10 + num / 100;
		}
		else if (-10000 < num && 10000> num)
		{
			n = (num - (num / 10) * 10) * 1000 + (num / 10 - (num / 100) * 10) * 100 + (num / 100 - (num / 1000) * 10) * 10 + num / 1000;
		}
		else if (-100000 < num && 100000> num)
		{
			n = ((int)num - ((int)num / 10) * 10) * 10000 + (num / 10 - (num / 100) * 10) * 1000 + (num / 100 - (num / 1000) * 10) * 100 + (num / 1000 - (num / 10000) * 10) * 10 + num / 10000;
		}
		return (n);
	}
}

