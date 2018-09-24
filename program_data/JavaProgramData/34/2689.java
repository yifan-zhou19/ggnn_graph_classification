package <missing>;

public class GlobalMembers
{
	public static void a(int n)
	{
		if (n == 1)
		{
			System.out.print("End");
			System.out.print("\n");
			return;
		}
		switch (n % 2)
		{
		case 1:
		{
				System.out.print(n);
				System.out.print("*3+1=");
				System.out.print(n * 3 + 1);
				System.out.print("\n");
				a(n * 3 + 1);
				break;
		}
		case 0:
		{
				System.out.print(n);
				System.out.print("/2=");
				System.out.print(n / 2);
				System.out.print("\n");
				a(n / 2);
				break;
		}
		}
	}
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a(n);
	}
}

