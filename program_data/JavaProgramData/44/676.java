package <missing>;

public class GlobalMembers
{
	public static int f = 0;
	public static void reserve(int num)
	{
			num = Math.abs(num);
			if ((num % 10) != 0)
			{
				System.out.print(num % 10);
				f = 1;
			}
			if (num % 10 == 0 && f == 1)
			{
				System.out.print("0");
			}
			if (num / 10 > 0)
			{
			reserve(num / 10);
			}


	}
	public static int Main()
	{
		int i;
		int num;
		for (i = 0;i < 6;i++)
		{
	f = 0;
	num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (num < 0)
			{
			num = 0 - num;
			System.out.print("-");
			}
			reserve(num);
			System.out.print("\n");
		}
		return 0;
	}


}

