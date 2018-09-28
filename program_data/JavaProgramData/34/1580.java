package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n != 1)
		{
			if (n % 2 != 0)
			{
				int t = n * 3 + 1;
				System.out.print(n);
				System.out.print("*3+1=");
				System.out.print(t);
				System.out.print("\n");
				n = n * 3 + 1;
			}
			else
			{
				int t = n / 2;
				System.out.print(n);
				System.out.print("/2=");
				System.out.print(t);
				System.out.print("\n");
				n = n / 2;
			}

		}
		System.out.print("End");
		System.out.print("\n");
		return 0;
	}

}

