package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n != 1)
		{ //????
			if (n % 2 == 0)
			{ //?????2
				a = n / 2;
				System.out.print(n);
				System.out.print("/");
				System.out.print("2");
				System.out.print("=");
				System.out.print(a);
				System.out.print("\n");
				n = a;
			}
			else
			{ //????3?1
				b = n * 3 + 1;
				System.out.print(n);
				System.out.print("*");
				System.out.print("3");
				System.out.print("+");
				System.out.print("1");
				System.out.print("=");
				System.out.print(b);
				System.out.print("\n");
				n = b;
			}
		}
		System.out.print("End");
		System.out.print("\n");
		return 0;
	}

}

