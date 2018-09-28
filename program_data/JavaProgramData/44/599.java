package <missing>;

public class GlobalMembers
{
	public static int reverse(int num)
	{
		int a;
		int i;
		for (i = 0;i < 100;i++) //????????0??
		{
			if (num % 10 != 0)
			{
				break;
			}
			else
			{
				num = num / 10;
			}
		}
		while (num > 0) //????
		{
			a = num % 10;
			System.out.print(a);
			num = num / 10;
		}
		System.out.print("\n");
		return 1;
	}
	public static int Main()
	{
		int num = 0;
		int i = 0;
		for (i = 0;i < 6;i++)
		{
			num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (num == 0) //??0?
			{
				System.out.print("0");
				System.out.print("\n");
			}
			else
			{
				if (num > 0)
				{
					reverse(num); //????
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

