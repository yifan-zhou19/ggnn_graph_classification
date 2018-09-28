package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (;;)
		{
			if (n == 1)
			{
				System.out.print("End");
				break;
			}
			else if (n % 2 == 0)
			{
				System.out.print(n);
				System.out.print("/");
				System.out.print("2=");
				n = n / 2;
				System.out.print(n);
				System.out.print("\n");
				continue;
			}
			else
			{
				System.out.print(n);
				System.out.print("*3+1=");
				n = n * 3 + 1;
				System.out.print(n);
				System.out.print("\n");
			}
		}
	}


}

