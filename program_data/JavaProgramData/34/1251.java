package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0; //????n
		int x = 0; //?????
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int y = 0; //????
		for (;;)
		{
			if (n == 1)
			{
				System.out.print("End");
				break;
			}
			else
			{
				y = n % 2;
				if (y == 1)
				{
					x = n * 3 + 1;
					System.out.print(n);
					System.out.print("*3+1=");
					System.out.print(x);
					System.out.print("\n");
				}
				else
				{
					x = n / 2;
					System.out.print(n);
					System.out.print("/2=");
					System.out.print(x);
					System.out.print("\n");
				}
				n = x;
			}
		}
		return 0;
	}
}

