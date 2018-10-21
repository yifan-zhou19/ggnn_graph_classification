package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
	 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 for (;n != 1;)
	 {
		 for (;n % 2 == 0;)
		 {
		 System.out.print(n);
		 System.out.print("/2=");
		 System.out.print(n / 2);
		 System.out.print("\n");
	 n = n / 2;
		 }
	 for (;n % 2 == 1 && n != 1;)
	 {
		 System.out.print(n);
		 System.out.print("*3+1=");
		 System.out.print(3 * n + 1);
		 System.out.print("\n");
	 n = 3 * n + 1;
	 }
	 }
	System.out.print("End");
	System.out.print("\n");
	return 0;
	}
}

