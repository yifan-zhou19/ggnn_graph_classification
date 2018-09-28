package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		int m = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n == 1)
		{
			System.out.print("End");
			System.out.print("\n");
		}
		else
		{
			do //?n???1?
			{
				if (n % 2 == 1) //??n???????????
				{
					m = n;
					n = n * 3 + 1;
					System.out.print(m);
					System.out.print("*");
					System.out.print(3);
					System.out.print("+");
					System.out.print(1);
					System.out.print("=");
					System.out.print(n);
					System.out.print("\n");
				}
				else // ????//??n???????????
				{
					m = n;
					n = m / 2;
					System.out.print(m);
					System.out.print("/");
					System.out.print(2);
					System.out.print("=");
					System.out.print(n);
					System.out.print("\n");
				}

			} while (n != 1);
			System.out.print("End");
			System.out.print("\n");
		}
		return 0;

	}
}

