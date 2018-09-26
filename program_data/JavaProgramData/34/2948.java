package <missing>;

public class GlobalMembers
{
	public static void jg(int n)
	{
		int i = 0;
		int j = 0;
		int k = 0;
		int tp = 0;
		while (n >= 1)
		{
		if (n == 1)
		{
			System.out.print("End");
		break;
		}
		else if (n % 2 == 1)
		{
			System.out.print(n);
			System.out.print("*3+1=");
			System.out.print(n * 3 + 1);
			System.out.print("\n");
		n = n * 3 + 1;
		}
		else
		{
			System.out.print(n);
			System.out.print("/2=");
			System.out.print(n / 2);
			System.out.print("\n");
		n = n / 2;
		}
		}
	}

	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		jg(n);
	return 0;
	}
}

