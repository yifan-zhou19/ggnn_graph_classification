package <missing>;

public class GlobalMembers
{
	public static int numcheck(int num,int a) //???????num??????????a??????
	{
		int i = 0;
		int sum = 0;
		if (num == 1) //??1????????
		{
			return 1;
		}
		else if (num < a)
		{
			return 0;
		}
		else
		{
			for (i = a;i <= num;i++) //?????????????????
			{
				if (num % i == 0)
				{
					sum = sum + numcheck(num / i, i);
				}
			}
		}
		return sum;
	}
	public static int Main()
	{
		int n = 0;
		int i = 0;
		int num = 0;
		int sum = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			sum = numcheck(num, 2);
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}
}

