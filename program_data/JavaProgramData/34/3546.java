package <missing>;

public class GlobalMembers
{
	public static void jiaogu(int n)
	{
		if (n == 1)
		{
			System.out.print("End");
			System.out.print("\n");
		}
		else
		{
			if (n % 2 == 1)
			{
				System.out.print(n);
				System.out.print("*");
				System.out.print(3);
				System.out.print("+");
				System.out.print(1);
				System.out.print("=");
				System.out.print(n * 3 + 1);
				System.out.print("\n");
				jiaogu(n * 3 + 1);
			}
			else
			{
				System.out.print(n);
				System.out.print("/");
				System.out.print(2);
				System.out.print("=");
				System.out.print(n / 2);
				System.out.print("\n");
				jiaogu(n / 2);
			}
		}
	}

	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		jiaogu(n);
		return 0;
	}

}

