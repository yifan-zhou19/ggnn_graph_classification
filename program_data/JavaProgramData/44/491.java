package <missing>;

public class GlobalMembers
{
	public static int reverse(int num)
	{
		int i;
		int a;
			while (true)
			{
				if (num % 10 == 0)
				{
				 num = num / 10;
				}
				else
				{
					break;
				}
			}
			while (num > 0)
			{

				a = num % 10;
				System.out.print(a);
				num = (num - a) / 10;
			}
			System.out.print("\n");
			return 1;
	}
	public static int Main()
	{
		int i;
		int num;
		for (i = 0;i <= 5;i++)
		{
			num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (num == 0)
			{
				System.out.print("0");
				System.out.print("\n");
			}
			else
			{
				if (num > 0)
				{
					reverse(num);
				}
				else
				{
					System.out.print("-");
					reverse(-num);
				}
			}
		}
		return 0;
	}
}

