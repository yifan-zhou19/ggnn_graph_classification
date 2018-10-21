package <missing>;

public class GlobalMembers
{
	public static int reverse(int num)
	{
		int i = 0;
		int s = 0;
		int remain = 0;
		if (num == 0)
		{
			System.out.print("0");
		}
		if (num < 0)
		{
			num = -num;
			System.out.print("-");
			do
			{
				remain = num % 10;
				if (remain != 0 || s != 0)
				{
					System.out.print(remain);
					s++;
				}
				num = num / 10;

			}while (num != 0);
		}
		if (num > 0)
		{
			do
			{
				remain = num % 10;
				if (remain != 0 || s != 0)
				{
					System.out.print(remain);
					s++;
				}
				num = num / 10;

			}while (num != 0);
		}
		System.out.print("\n");
		return 0;
	}
	public static int Main()
	{
		int i = 0;
		int num = 0;
		for (i = 0;i < 6;i++)
		{
			num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			reverse(num);
		}
		return 0;
	}
}

