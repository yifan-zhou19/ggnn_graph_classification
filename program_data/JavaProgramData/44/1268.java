package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int num;
		int i;
		int reverse = int num;
		for (i = 1;i <= 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				num = Integer.parseInt(tempVar);
			}
			System.out.printf("%d\n",reverse(num));
		}
		return 0;
	}
	public static int reverse(int num)
	{
		int t = 0;
		int i;
		int zf = 1;
		if (num < 0)
		{
			num = -num;
			zf = -1;
		}
		for (i = 1;;i++)
		{
			t = t * 10 + num % 10;
			if (num < 10)
			{
				break;
			}
			num = num / 10;
		}
		t = t * zf;
		return (t);
	}
}

