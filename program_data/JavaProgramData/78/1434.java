package <missing>;

public class GlobalMembers
{
	public static int Main(int argc)
	{
		int i;
		int a;
		int b;
		int c;
		int d;
	   for (a = 10;a <= 50;a = a + 10)
	   {
		   for (b = 10;b <= 50;b = b + 10)
		   {
		   for (c = 10;c <= 50;c = c + 10)
		   {
		   for (d = 10;d <= 50;d = d + 10)
		   {
		   if (a != b && b != c && c != d && a != c && a != d && b != d && (a + b) == (c + d) && (a + d) > (b + c) && (a + c) < b)
		   {
		   System.out.print("l");
		   System.out.print(" ");
		   System.out.print(d);
		   System.out.print("\n");
	   System.out.print("q");
	   System.out.print(" ");
	   System.out.print(b);
	   System.out.print("\n");
	   System.out.print("z");
	   System.out.print(" ");
	   System.out.print(a);
	   System.out.print("\n");
		System.out.print("s");
		System.out.print(" ");
		System.out.print(c);
		System.out.print("\n");
		   }
		   }
		   }
		   }
	   }
		return 0;
	}
}
