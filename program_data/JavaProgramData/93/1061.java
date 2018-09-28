package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int n0;
		int flag = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n0 = n;
		if (n % 3 == 0)
		{
			n /= 3;
			System.out.print("3");
			flag = 1;
		}
		if (n % 5 == 0)
		{
		if (n != n0)
		{
			System.out.print(" ");
		}
		n /= 5;
		System.out.print(5);
		flag = 1;
		}
		if (n % 7 == 0)
		{
		if (n != n0)
		{
			System.out.print(" ");
		}
		n /= 7;
		System.out.print(7);
		flag = 1;
		}
		if (flag == 0)
		{
			System.out.print('n');
		}
		System.out.print("\n");
		return 0;
	}

}

