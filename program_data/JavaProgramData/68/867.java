package <missing>;

public class GlobalMembers
{
	public static int prime(int m)
	{
	 int n;
	 for (n = 2;n <= Math.sqrt(m);n++)
	 {
	 if (m % n == 0)
	 {
	 break;
	 }
	 }
	 if (n > Math.sqrt(m))
	 {
	 return 1;
	 }
	 else
	 {
		 return 0;
	 }
	}
	public static int Main()
	{
	 int n;
	 int m;
	 int a;
	 int b;
	 int c;
	 int count = 0;
	 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 for (m = 6;m <= n;m = m + 2)
	 {
		 for (a = 2;a <= m / 2;a++)
		 {
			 c = 0;
			 b = m - a;
			 if (prime(a) == 1 && prime(b) == 1)
			 {
				 System.out.printf("%d=%d+%d\n",m,a,b);
				 count++;
				 if (count % 5 == 0)
				 {
					 System.out.print("\n");
				 }
				 c = 1;
			 }
			 if (c == 1)
			 {
				 break;
			 }
		 }
	 }
	 return 0;
	}
}

