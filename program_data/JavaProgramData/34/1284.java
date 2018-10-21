package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int n0;
		int nl;
		n0 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = n0;
		for (;n != 1;)
		{
			nl = n;
			if (n % 2 == 1)
			{
				n = 3 * n + 1;
				System.out.print(nl);
				System.out.print("*3+1=");
				System.out.print(n);
				System.out.print("\n");
			}
			else
			{
				n = n / 2;
				System.out.print(nl);
				System.out.print("/2=");
				System.out.print(n);
				System.out.print("\n");
			}
		}
		System.out.print("End");
		return 0;
	}

}

