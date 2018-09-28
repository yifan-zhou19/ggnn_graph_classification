package <missing>;

public class GlobalMembers
{
	public static int Main(int argc)
	{
		int a;
		int b;
		int c;
		int d;
		int e;
		int t;
		 for (a = 1;a <= 5;a++)
		 {
			for (b = 1;b <= 5;b++)
			{
		 for (c = 1;c <= 5;c++)
		 {
		 for (d = 1;d <= 5;d++)
		 {
		 for (e = 1;e <= 5;e++)
		 {
			 t = 0;
		 if (b == a)
		 {
			 t++;
		 }
		 if (d == a || d == b || d == c)
		 {
			 t++;
		 }
		 if (c == a || c == b)
		 {
			 t++;
		 }
		 if (e == a || e == b || e == c || e == d)
		 {
			 t++;
		 }
		 if (e == 2 || e == 3)
		 {
			 t++;
		 }
		 if ((a == 1 || a == 2) && (e != 1))
		 {
			 t++;
		 }
		 if ((a != 1 && a != 2) && (e == 1))
		 {
			 t++;
		 }
		 if ((b == 1 || b == 2) && (b != 2))
		 {
			 t++;
		 }
		 if ((b != 1 && b != 2) && (b == 2))
		 {
			 t++;
		 }
		 if ((c == 1 || c == 2) && (a != 5))
		 {
			 t++;
		 }
		 if ((c != 1 && c != 2) && (a == 5))
		 {
			 t++;
		 }
		 if ((d == 1 || d == 2) && (c == 1))
		 {
			 t++;
		 }
		 if ((d != 1 && d != 2) && (c != 1))
		 {
			 t++;
		 }
		 if ((e == 1 || e == 2) && (d != 1))
		 {
			 t++;
		 }
		 if ((e != 1 && e != 2) && (d == 1))
		 {
			 t++;
		 }
		 if (t == 0)
		 {
			 System.out.print(a);
			 System.out.print(" ");
			 System.out.print(b);
			 System.out.print(" ");
			 System.out.print(c);
			 System.out.print(" ");
			 System.out.print(d);
			 System.out.print(" ");
			 System.out.print(e);
		 }
		 }
		 }
		 }
			}
		 }
		  return 0;
	}
}
