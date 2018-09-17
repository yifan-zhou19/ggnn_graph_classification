package <missing>;

public class GlobalMembers
{
	public static int divmet(int n, int i)
	{
		int num = 0;
		if (n % i == 0)
		{
			if (n == i)
			{
				return 1;
			}
			for (int j = 2;j <= i;j++)
			{
				 num = num + divmet(n / i, j); //??
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
			for (int j = 2;j <= n;j++)
			{
				sum = sum + divmet(n, j);
			}
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}

}

