package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (true)
		{
			if (n == 1)
			{ //?????end

			System.out.print("End");
			System.out.print("\n");
			break;
			}
		else
		{
			while (n != 1)
			{
				if (n % 2 == 1)
				{ //??????
					System.out.print(n);
					System.out.print("*3+1=");
					System.out.print(n * 3 + 1);
					System.out.print("\n");
					n = n * 3 + 1;
				}
				else
				{ //????
					System.out.print(n);
					System.out.print("/2=");
					System.out.print(n / 2);
					System.out.print("\n");
					n /= 2;
				}
			}
		}
		}
	}

}

