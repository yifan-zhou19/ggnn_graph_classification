package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int n;
		 int decade;
		 int hundred;
		 int thousand;
		 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 System.out.print(n - n / 10 * 10);
		 if (n >= 10)
		 {
			 decade = n / 10;
			 System.out.print(decade - decade / 10 * 10);
		 }
		 if (n >= 100)
		 {
			 hundred = decade / 10;
			 System.out.print(hundred - hundred / 10 * 10);
		 }
		 if (n >= 1000)
		 {
			  thousand = hundred / 10;
			 System.out.print(thousand - thousand / 10 * 10);
		 }
		 if (n == 10000)
		 {
		 System.out.print("1");
		 System.out.print("\n");
		 }
		 return 0;
	}

}

