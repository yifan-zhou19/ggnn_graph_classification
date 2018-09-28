package <missing>;

public class GlobalMembers
{
	/**
	* @file 1000012907_2.cpp
	* @author ???
	* @date 2010?12?4
	* @description
	* ??????: ????
	*/
	public static int f(int n)
	{
		if (n == 1)
		{
			System.out.print("End");
		}
		else if (n % 2 == 0)
		{
			System.out.print(n);
			System.out.print("/");
			System.out.print("2");
			System.out.print("=");
			System.out.print(n / 2);
			System.out.print("\n");
			return f(n / 2);
		}
		else
		{
			System.out.print(n);
			System.out.print("*");
			System.out.print("3");
			System.out.print("+");
			System.out.print("1");
			System.out.print("=");
			System.out.print(3 * n + 1);
			System.out.print("\n");
			return f(3 * n + 1);
		}
	}
	public static int Main()
	{
		int num;
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		f(num);
		return 0;
	}

}

