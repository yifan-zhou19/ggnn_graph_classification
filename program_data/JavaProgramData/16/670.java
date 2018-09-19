package <missing>;

public class GlobalMembers
{
	 public static int invert(int m)
	 {
		 System.out.printf("%ld", m % 10);
		 m = m / 10;
		 if (m > 0)
		 {
			 invert(m);
		 }
	 }
	public static int Main()
	{
		 int n;

		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 invert(n);
		 System.out.print("\n");
	}

}

