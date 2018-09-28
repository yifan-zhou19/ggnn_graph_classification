package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n; //????
		int a;
		int b;
		int c;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n == 1)
		{
			System.out.print("End");
		}
		else
		{
			do
			{
			if (n % 2 == 1)
			{
					System.out.print(n);
					System.out.print("*3+1=");
					System.out.print((n * 3 + 1));
					System.out.print("\n");
					 n = n * 3 + 1;
			}
			else
			{
				System.out.print(n);
				System.out.print("/2=");
				System.out.print((n / 2));
				System.out.print("\n");
					 n = n / 2;
			}
			} while (n != 1);
		System.out.print("End");
		}

	return 0;
	}
}

