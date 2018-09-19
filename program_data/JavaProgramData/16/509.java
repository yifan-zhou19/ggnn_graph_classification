package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n <= 9999 && n > 1000)
		{
			i = n / 1000 + n % 1000 / 100 * 10 + n % 100 / 10 * 100 + n % 10 * 1000;
			System.out.print(i);
			System.out.print("\n");
		}
		else if (n == 1000)
		{
			System.out.print("0001");
			System.out.print("\n");
		}
		else if (n <= 999 && n > 100)
		{
			i = n / 100 + n % 100 / 10 * 10 + n % 10 * 100;
			System.out.print(i);
			System.out.print("\n");
		}
		else if (n == 100)
		{
			System.out.print("001");
			System.out.print("\n");
		}
			else if (n <= 99 && n > 10)
			{
				i = n % 10 * 10 + n / 10;
			}
			else if (n == 10)
			{
				System.out.print("01");
				System.out.print("\n");
			}
				else if (n <= 9 && n >= 0)
				{
					System.out.print(n);
					System.out.print("\n");
				}
					else
					{
						System.out.print("00001");
						System.out.print("\n");
					}
		return 0;
	}
}

