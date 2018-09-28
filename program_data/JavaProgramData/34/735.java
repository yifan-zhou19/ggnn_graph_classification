package <missing>;

public class GlobalMembers
{
	/*
	????????
	??????
	?????2010?12?
	???????????????
	**/

	public static void f(int n)
	{
		int m;
		if (n == 1) //?????n?1
		{
			System.out.print("End");
		}
		else
		{
			if (n % 2 == 0)
			{
				m = n / 2;
				System.out.print(n);
				System.out.print("/");
				System.out.print(2);
				System.out.print("=");
				System.out.print(m);
				System.out.print("\n");
			}
			else
			{
				m = 3 * n + 1;
				System.out.print(n);
				System.out.print("*");
				System.out.print(3);
				System.out.print("+");
				System.out.print(1);
				System.out.print("=");
				System.out.print(m);
				System.out.print("\n");
			}
			f(m); //??
		}
		return;
	}
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		f(n); //????f
		return 0;
	}
}

