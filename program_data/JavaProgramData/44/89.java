package <missing>;

public class GlobalMembers
{
	public static int reverse(int num)
	{
		int fnum = 0;
		int k = 0;
		if (num < 0)
		{
			num = -num;
			k = 1;
		}
		for (;num != 0;)
		{
			fnum = fnum * 10 + num % 10;
			num = num / 10;
		}
		if (k == 0)
		{
		return fnum;
		}
		else
		{
			return -fnum;
		}
	}
	public static int Main()
	{
		int[] num = new int[6];
		for (int i = 0;i < 6;i++)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num[i] = Integer.parseInt(tempVar);
		}
		}
		for (int i = 0;i < 6;i++)
		{
		System.out.printf("%d\n",reverse(num[i]));
		}
	}
}

