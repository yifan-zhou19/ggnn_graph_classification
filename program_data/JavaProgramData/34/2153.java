package <missing>;

public class GlobalMembers
{
	public static int odd(int n)
	{
		System.out.print(n);
		System.out.print("*3+1=");
		System.out.print(n * 3 + 1);
		System.out.print("\n");
		n = n * 3 + 1;
		return n;
	}

	public static int even(int n)
	{
		System.out.print(n);
		System.out.print("/2=");
		System.out.print(n / 2);
		System.out.print("\n");
		n = n / 2;
		return n;
	}

	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		do
		{
			if (n == 1)
			{
				System.out.print("End");
				System.out.print("\n");
				break;
			}
			if (n % 2 == 0)
			{
				n = even(n);
			}
			else
			{
				n = odd(n);
			}
		}while (1 != 0);
		return 0;
	}
}

