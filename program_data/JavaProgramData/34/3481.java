package <missing>;

public class GlobalMembers
{
	public static void verify(int n)
	{
		if (n != 1)
		{
			if (n % 2 == 1)
			{
				System.out.print(n);
				System.out.print("*3+1=");
				System.out.print(n * 3 + 1);
				System.out.print("\n");
			}
			else
			{
				System.out.print(n);
				System.out.print("/2=");
				System.out.print(n / 2);
				System.out.print("\n");
			}
			verify((n % 2 == 1? n * 3 + 1:n / 2));
		}
		else
		{
			System.out.print("End");
		}
	}
	public static int Main()
	{
		int m;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		verify(m);
		return 0;
	}

}

