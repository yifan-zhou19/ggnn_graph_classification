package <missing>;

public class GlobalMembers
{
	public static void f(int n)
	{
		while (n != 1)
		{
			if ((n % 2) == 1)
			{
				System.out.print(n);
				System.out.print("*3+1=");
				System.out.print((3 * n + 1));
				System.out.print("\n");
			n = n * 3 + 1;
			}
			else
			{
				System.out.print(n);
				System.out.print("/2=");
				System.out.print(n / 2);
				System.out.print("\n");
			n = n / 2;
			}
		}
		System.out.print("End");
		System.out.print("\n");
	}
	public static int Main()
	{
	 int m;
	 m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 f(m);
	 return 0;
	}

}

