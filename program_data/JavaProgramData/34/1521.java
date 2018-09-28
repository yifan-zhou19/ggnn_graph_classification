package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		int a = 0;
		int b = 0;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	while (true)
	{
		if (n == 1)
		{
			break;
		}
		if (n % 2 == 0)
		{
			a = n / 2;
		System.out.print(n);
		System.out.print("/2=");
		System.out.print(a);
		System.out.print("\n");
		n = n / 2;
		}
	else
	{
		b = 3 * n + 1;
		System.out.print(n);
		System.out.print("*3+1=");
		System.out.print(b);
		System.out.print("\n");
		n = 3 * n + 1;
	}
	}
	System.out.print("End");
	System.out.print("\n");
	return 0;
	}
}

