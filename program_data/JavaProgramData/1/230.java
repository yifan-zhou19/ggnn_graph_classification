package <missing>;

public class GlobalMembers
{
	//???? 
	public static int divide(int n, int i)
	{
		int num = 0;
		if (n % i == 0)
		{
			if (n == i) //?????????????????1
			{
				return 1;
			}
			for (int j = 2;j <= i;j++)
			{
				 num = num + divide(n / i, j); //??
			}
			   return num;
		}

		else
		{
			return 0;
		}
	}
	public static int Main()
	{
		int n = 0; //?????
		int t = 0; //????
		int sum; //???????
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < t;i++)
		{
			sum = 0;
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (int j = 2;j <= n / 2;j++) //???????????1*n???
			{
				sum = sum + divide(n, j);
			}
			System.out.print(sum + 1);
			System.out.print("\n");
		}
		return 0;
	}
}

