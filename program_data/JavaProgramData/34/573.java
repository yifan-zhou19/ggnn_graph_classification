package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int ji(int n)
	{
		n = n * 3 + 1;
		System.out.print((n - 1) / 3);
		System.out.print("*3+1=");
		System.out.print(n);
		System.out.print("\n");
		return n;
	}

	public static int ou(int n)
	{
		n = n / 2;
		//cout << 'x' << n << endl;
		System.out.print(n * 2);
		System.out.print("/2=");
		System.out.print(n);
		System.out.print("\n");
		//cout << 'y' << n << endl;
		return n;
	}

	public static int Main()
	{
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n != 1)
		{
			if (n % 2 == 0)
			{
				n = ou(n);
			}
			if (n == 1)
			{
				break;
			}
			if (n % 2 == 1)
			{
				n = ji(n);
			}
		}
		System.out.print("End");
		System.out.print("\n");
		return 0;
	}
}

