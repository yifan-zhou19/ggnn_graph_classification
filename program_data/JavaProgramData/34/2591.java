package <missing>;

public class GlobalMembers
{
	public static void calcu(int k)
	{
		if (k % 2 == 0)
		{
			System.out.print(k);
			System.out.print("/2=");
			System.out.print((k / 2));
			System.out.print("\n");
			if (k / 2 == 1)
			{
				System.out.print("End");
				System.out.print("\n");
			}
			else
			{
				calcu(k / 2);
			}
		}
		else
		{
			System.out.print(k);
			System.out.print("*3+1=");
			System.out.print((3 * k + 1));
			System.out.print("\n");
			if (3 * k + 1 == 1)
			{
				System.out.print("End");
				System.out.print("\n");
			}
			else
			{
				calcu(3 * k + 1);
			}
		}

	}
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n == 1)
		{
			System.out.print("End");
			System.out.print("\n");
		}
		else
		{
			calcu(n);
		}
		return 0;
	}
}

