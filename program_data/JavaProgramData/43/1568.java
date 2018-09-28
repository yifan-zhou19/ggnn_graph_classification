package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int isprime = int x;
		int a;
		int b;
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 3;i <= b / 2;i++)
		{
			if (isprime(i) != 0 && isprime(b - i) != 0)
			{
				System.out.print(i);
				System.out.print(" ");
				System.out.print(b - i);
				System.out.print("\n");
			}
		}
		return 0;

	}
	public static int isprime(int x)
	{
		for (int y = 2;y <= x / 2;y++)
		{
			if (x % y == 0)
			{
				return 0;
			}
		}
		return 1;
	}

}

