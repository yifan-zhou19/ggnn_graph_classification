package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int sum = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n != 1)
		{
			System.out.print(n);
			if (n % 2 != 0)
			{
				System.out.print("*3+1=");
				n = n * 3 + 1;
			}
			else
			{
				System.out.print("/2=");
				n = n / 2;
			}
			System.out.print(n);
			System.out.print("\n");

		}
		System.out.print("End");
		return 0;
	}
}

