package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		void reverse(int num,int flag);
		for (int i = 0;i < 6;i++)
		{
			int n;
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (n == 0)
			{
				System.out.print('0');
				System.out.print("\n");
			}
			else
			{
				if (n < 0)
				{
					System.out.print('-');
					n *= -1;
				}
				reverse(n, 0); //?????????
				System.out.print("\n");
			}
		}
		return 0;
	}
	public static void reverse(int num,int flag) //????,flag????????
	{ //flag=0????????????
		int c;
		c = num % 10;
		if (c != 0)
		{
			System.out.print(c);
			flag = 1;
		}
		else if (c == 0 && flag == 1)
		{
			System.out.print(c);
		}
		if ((num / 10) != 0)
		{
			reverse(num / 10, flag);
		}

	}

}

