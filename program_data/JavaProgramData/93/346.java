package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 if ((n % 3 == 0) && (n % 5 == 0) && (n % 7 == 0))
	 {
		System.out.print("3 5 7");
	 }
	 else if ((n % 3 != 0) && (n % 5 == 0) && (n % 7 == 0))
	 {
		System.out.print("5 7");
	 }
	 else if ((n % 3 == 0) && (n % 5 != 0) && (n % 7 == 0))
	 {
		System.out.print("3 7");
	 }
	 else if ((n % 3 == 0) && (n % 5 == 0) && (n % 7 != 0))
	 {
		System.out.print("3 5");
	 }
	 else if ((n % 3 == 0) && (n % 5 != 0) && (n % 7 != 0))
	 {
		System.out.print("3");
	 }
	 else if ((n % 3 != 0) && (n % 5 != 0) && (n % 7 == 0))
	 {
		 System.out.print("7");
	 }
	 else if ((n % 3 != 0) && (n % 7 != 0) && (n % 5 == 0))
	 {
		System.out.print("5");
	 }
	 else
	 {
		System.out.print("n");
	 }
	 System.in.read();
	 System.in.read();
	 System.in.read();
	 return 0;
	}
}

