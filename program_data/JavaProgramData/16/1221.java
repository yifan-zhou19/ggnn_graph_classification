package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int a;
		 int b;
		 int c;
		 int d;
		 a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 if (a >= 1000)
		 {
			   b = a % 1000;
			   c = b % 100;
			   d = c % 10;
			   System.out.print(d);
			   System.out.print((c - d) / 10);
			   System.out.print((b - c) / 100);
			   System.out.print((a - b) / 1000);
			   System.out.print("\n");
		 }
		 else if (a < 1000 && a >= 100)
		 {
		   b = a % 100;
				c = b % 10;
		   System.out.print(c);
		   System.out.print((b - c) / 10);
		   System.out.print((a - b) / 100);
		   System.out.print("\n");
		 }
		 else if (a < 100 && a >= 10)
		 {
			b = a & 10;
				 System.out.print(b);
				 System.out.print((a - b) / 10);
				 System.out.print("\n");
		 }
		 else if (a >= 0 && a <= 9)
		 {
				 System.out.print(a);
				 System.out.print("\n");
		 }
			  return 0;
	}
}

