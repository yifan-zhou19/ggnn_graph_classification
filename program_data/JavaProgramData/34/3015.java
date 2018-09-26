package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a = 0;
		int b = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n == 1)
		{
			System.out.print("End");
			System.out.print("\n");
		}
		else
		{
			while (n != 1)
			{
				if (n % 2 != 0)
				{
					System.out.print(n);
					System.out.print("*3+1=");
					n = n * 3 + 1;
					System.out.print(n);
					System.out.print("\n");
				}
				else
				{
					System.out.print(n);
					System.out.print("/2=");
					n = n / 2;
					System.out.print(n);
					System.out.print("\n");
				}
			}
			System.out.print("End");
			System.out.print("\n");
		}
			return 0;
	}


}

