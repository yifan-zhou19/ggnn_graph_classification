package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int jiaogu = int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n == 1)
		{
			System.out.print("End");
			System.out.print("\n");
		}
		else
		{
			jiaogu(n);
		}

		return 0;
	}
	public static void jiaogu(int n)
	{
		do
		{
			if (n % 2 == 0)
			{
				n = n / 2;
			System.out.print(2 * n);
			System.out.print("/");
			System.out.print("2=");
			System.out.print(n);
			System.out.print("\n");
			}
			else
			{
				n = 3 * n + 1;
			System.out.print((n - 1) / 3);
			System.out.print("*3+1=");
			System.out.print(n);
			System.out.print("\n");
			}
		}while (n != 1);
		System.out.print("End");
		System.out.print("\n");
	}

}

