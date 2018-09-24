package <missing>;

public class GlobalMembers
{
	public static int reverse(int num)
	{
		int x = 0;
		int flag = 0;
		if (num < 0)
		{
			flag = 1;
			num = 0 - num;
		}
		while (num != 0)
		{
			x = num % 10 + x * 10;
			num = num / 10;
		}
		if (flag == 1)
		{
			x = 0 - x;
		}
		return (x);
	}
	public static void Main()
	{
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
}

