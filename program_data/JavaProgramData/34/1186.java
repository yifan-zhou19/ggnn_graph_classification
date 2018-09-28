package <missing>;

public class GlobalMembers
{
	public static void f(int n)
	{
		if (n == 1) //?????1?????"End";
		{
			System.out.print("End");
			System.out.print("\n");
		}
		else
		{
			if (n % 2 == 1) //????????3?1;
			{
				System.out.print(n);
				System.out.print("*");
				System.out.print(3);
				System.out.print("+");
				System.out.print(1);
				System.out.print("=");
				System.out.print(3 * n + 1);
				System.out.print("\n");
				n = 3 * n + 1;
				f(n);
			}
			else if (n % 2 == 0) //?????????2?????????????????;
			{
				System.out.print(n);
				System.out.print("/");
				System.out.print(2);
				System.out.print("=");
				System.out.print(n / 2);
				System.out.print("\n");
				n = n / 2;
				f(n);
			}
		}
		return;
	}
	public static int Main() //???;
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		f(n);
		return 0;
	}
}

