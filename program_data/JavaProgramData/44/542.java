package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		void reverse(int num,int o1);
		int number;
		int k;
		for (k = 0;k < 6;k++)
		{
			number = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (number != 0)
			{
				reverse(number, 0); //?????0
			}
			else
			{
				System.out.print(0);
			}
			System.out.print("\n");
		}
		return 0;
	}
	public static void reverse(int num,int o1) //?????
	{
		int rev = 0;
		int fuhao = 1;
		int num1;
		int dig;
		int i;
		int ot = o1;
		num1 = num;
		if (num != 0)
		{
			if (num1 < 0) //???????
			{
				System.out.print('-');
				num1 = -num1; //?????????
				reverse(num1, 0);
			}
			else
			{

				dig = num1 % 10; //????????
				num1 = num1 / 10; //????10
				if (ot != 0 || dig != 0) //???????????0
				{
					System.out.print(dig);
					ot = 1; //??????,???????????
				}
				reverse(num1, ot); //?????
			}
		}
	}

}

