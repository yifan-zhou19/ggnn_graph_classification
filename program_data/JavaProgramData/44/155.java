package <missing>;

public class GlobalMembers
{
	public static int reverse(int num,int a)
	{
		a = 10 * a + num % 10;
		if (num > 9 || num < -9)
		{
			return (reverse(num / 10, a));
		}
		return a;
	}

	public static int Main()
	{
		int num;
		int i;
		for (i = 1;i <= 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				num = Integer.parseInt(tempVar);
			}
			System.out.printf("%d\n",reverse(num, 0));
		}
			return 0;
	}

}

