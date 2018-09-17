package <missing>;

public class GlobalMembers
{
	//**********?????????*********************
	//**********???????*************************
	//**********?????2012?11?27?***************
	//**********???1200062701**********************


	public static int ifsushu(int n) //????????????1???
	{
		if (n == 1)
		{
			return 1;
		}
		else
		{
			for (int f = n - 1;f >= 2; f--) //??n?????
			{
				if (n % f == 0)
				{
					break;
				}
				if (f == 2)
				{
					return 1;
				}
			}
		}
		return 0;
	}
	public static int sum = 0;
	public static int zhaoyinshu(int x, int max)
	{
		if (x == 1)
		{
			sum++;
			return 0;
		}
		for (int i = max; i >= 2; i--)
		{
			if (x % i == 0) // ??i?????
			{
				zhaoyinshu(x / i, i);
			}
		}
	}
	public static int Main()
	{
		int time;
		int number;
		int t;
		time = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int j = 0; j < time; j++)
		{
			number = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (ifsushu(number) == 1)
			{
				System.out.print("1");
				System.out.print("\n");
			}
			else
			{
				zhaoyinshu(number, number / 2);
				System.out.print(sum + 1);
				System.out.print("\n");
				sum = 0;
			}
		}
		return 0;
	}


}

