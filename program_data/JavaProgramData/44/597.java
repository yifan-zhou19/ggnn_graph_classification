package <missing>;

public class GlobalMembers
{
	public static void reverse(int num)
	{
		int x;
		if (num < 0)
		{
			num = 0 - num;
			System.out.print('-');
		}
		if (num != 0)
		{
			if (num % 10 == 0)
			{
				for (;num % 10 == 0;)
				{
					num /= 10;
				}
				for (;num != 0;num /= 10)
				{
					x = num % 10;
					System.out.print(x);
				}
				System.out.print("\n");
			}
			else
			{
				for (;num != 0;num /= 10)
				{
					x = num % 10;
					System.out.print(x);
				}
				System.out.print("\n");
			}
		}

	}
	public static int Main()
	{


		int num;
		for (int i = 0;i < 6;i++)
		{
			num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (num == 0 || num == -0)
			{
				System.out.print("0");
			}
			else
			{
				reverse(num);
			}
		}
		return 0;
	}
}

