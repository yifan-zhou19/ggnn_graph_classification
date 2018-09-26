package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int number = 0; //judge??????????0,number?????
		int judge = 0;
		int i;
		void reverse(int num,int judge); //????
		for (i = 0;i < 6;i++)
		{
			number = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (number == 0) //?????????0
			{
				System.out.print('0');
			}
			else
			{
				if (number < 0)
				{
					System.out.print('-');
					number = -number;
				}
				reverse(number, 0);
			}
		System.out.print("\n");
		}
		return 0;
	}
	public static void reverse(int num,int judge)
	{
		if (num % 10 != 0 || judge != 0)
		{
			System.out.print(num % 10);
			judge = 1;
		}
		if (num / 10 != 0)
		{
			reverse(num / 10, judge);
		}
	}
}

