package <missing>;

public class GlobalMembers
{
	public static int[] dd = new int[25];
	public static int k;
	public static int maxnum = 0;

	public static void fun(int p, int num,int hight)
	{
		if (p > k)
		{
			if (num > maxnum)
			{
				maxnum = num;
			}
			return;
		}
		if (dd[p] <= hight)
		{
			fun(p + 1, num + 1, dd[p]);
			fun(p + 1, num, hight);
		}
		else
		{
			fun(p + 1, num, hight);
		}
		return;
	}

	public static int Main()
	{
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < k;i++)
		{
			dd[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		fun(0, 0, 65535);
		System.out.print(maxnum - 1);
		System.out.print("\n");
	}
}

