package <missing>;

public class GlobalMembers
{
	public static int Main()
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
		return 0;
	}
	public static int reverse(int num)
	{
		int i = 0;
		if (num == 0)
		{
			i = 0;
		}
		while (num != 0)
		{
			i = i * 10 + num % 10;
			num = num / 10;
		}
		return i;
	}
}

