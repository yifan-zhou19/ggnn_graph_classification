package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int n;
		 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 System.out.print(n / 100);
		 System.out.print("\n");
		 System.out.print((n % 100) / 50);
		 System.out.print("\n");
		 System.out.print((n % 50) / 20);
		 System.out.print("\n");
		 System.out.print((n % 50 - (n % 50) / 20 * 20) / 10);
		 System.out.print("\n");
		 System.out.print((n % 10) / 5);
		 System.out.print("\n");
		 System.out.print(n % 5);
		 System.out.print("\n");
		 return 0;
	}

}

