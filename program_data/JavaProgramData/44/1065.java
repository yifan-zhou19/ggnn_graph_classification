package <missing>;

public class GlobalMembers
{
	public static int reverse(int num)
	{
		char sign = 0;
		int itemp;
		int isFirstzero = 1;
		if (num == 0)
		{
			System.out.print("0\n");
			return 0;
		}
		if (num < 0)
		{
			sign = '-';
			System.out.print("-");
			num = 0 - num;
		}
		while (num > 0)
		{
			itemp = num % 10;
			if (itemp == 0 && isFirstzero == 1)
			{
			}
			else if (itemp == 0 && isFirstzero == 0)
			{
				System.out.printf("%d", itemp);
			}
			else if (itemp != 0)
			{
				isFirstzero = 0;
				System.out.printf("%d", itemp);
			}
			num /= 10;
		}
		System.out.print("\n");

		return 1;
	}
	public static void Main(String[] args)
	{
		int i = 0;
		int n;
		for (i = 0; i < 6; i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			reverse(n);
		}
	}

}

