package <missing>;

public class GlobalMembers
{
	public static void fenjie(int n)
	{
	 if (n == 1)
	 {
		 System.out.print("End");
	 return;
	 }
	 int m = 0;
	 if (n % 2 == 0)
	 {
//C++ TO JAVA CONVERTER WARNING: The right shift operator was not replaced by Java's logical right shift operator since the left operand was not confirmed to be of an unsigned type, but you should review whether the logical right shift operator (>>>) is more appropriate:
		 m = n >> 1;
		 System.out.printf("%d/2=%d\n",n,m);
	 }
	 else
	 {
		 m = 3 * n + 1;
		 System.out.printf("%d*3+1=%d\n",n,m);
	 }
	 fenjie(m);
	}
	public static int Main()
	{
	int n;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	fenjie(n);

	   return 0;

	}
}

