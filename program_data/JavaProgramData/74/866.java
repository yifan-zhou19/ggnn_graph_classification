package <missing>;

public class GlobalMembers
{
	// 2_4.cpp : Defines the entry point for the console application.
	//


	public static int prime(int i)
	{
		int sign = 0;
		for (int j = 2 ; j < i ; j++)
		{
			if (i % j == 0 && j != i)
			{
				sign = 1;
				break;
			}
		}
		if (sign == 1)
		{
			return 0;
		}
		else
		{
			return 1;
		}
	}
	public static int huiwen(int i)
	{
		int temp = i;
		int b = 0;
		while (temp > 0)
		{
			int a = temp % 10;
			b = b * 10 + a;
			temp = temp / 10;
		}
		if (i == b)
		{
			return 1;
		}
		else
		{
			return 0;
		}

	}

	public static void Main(String[] args)
	{
		int m;
		int n;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int count = 0;
		for (int i = m ; i <= n ; i++)
		{
			if (prime(i) != 0 && huiwen(i) != 0)
			{
				count++;
				if (count == 1)
				{
					System.out.print(i);
				}
				else
				{
					System.out.print(",");
					System.out.print(i);
				}
			}
		}
		if (count == 0)
		{
			System.out.print("no");
			System.out.print("\n");
		}
	}

}

