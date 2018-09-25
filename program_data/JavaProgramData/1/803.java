package <missing>;

public class GlobalMembers
{
	public static int number = 0;
	public static int Main()
	{
		void f(int first,int m);
		int n;
		int i;
		int num;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			f(2, num);
			System.out.print(number / 2);
			System.out.print("\n");
			number = 0;
		}
		return 0;
	}
	public static void f(int first,int m)
	{
		int i;
		for (i = first;i <= m;i++)
		{

			if (m % i == 0)
			{
				m = m / i;
				f(i, m);
				if (m != 1)
				{
				m = m * i;
				}

			}
		}
		if (m == 1)
		{
			number += 1;
		}
	}

}

