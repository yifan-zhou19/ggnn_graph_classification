package <missing>;

public class GlobalMembers
{
	public static int f(int n)
	{
		if (n % 2 == 0)
		{
			return n / 2;
		}
		else
		{
			return n * 3 + 1;
		}
	}
	public static int Main()
	{
		int n;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < 100;i++)
		{
			if (n == 1)
			{
				System.out.print("End");
				System.out.print("\n");
				break;
			}
			else
			{
				if (n % 2 == 0)
				{
					System.out.print(n);
					System.out.print("/2=");
					System.out.print(f(n));
					System.out.print("\n");
				}
				else
				{
					System.out.print(n);
					System.out.print("*3+1=");
					System.out.print(f(n));
					System.out.print("\n");
				}
				n = f(n);
			}
		}
		return 0;
	}
}

