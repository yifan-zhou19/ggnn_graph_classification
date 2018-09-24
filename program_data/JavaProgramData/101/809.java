package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int a;
	   int b;
	   int c;
	   int x;
	   int y;
	   int z;
	   a = 3;
	   b = 2;
	   c = 1;
	   {
		x = ((b > a) + (a = c));
	 y = ((a > b) + (a > c));
	 z = ((c > b) + (b > a));
	   if ((x <= y) & (y <= z) && (x <= z))
	   {
	   System.out.print("ABC");
	   }

	   }
	   a = 3;
	   b = 1;
	   c = 2;
	   {
	 x = ((b > a) + (a = c));
	 y = ((a > b) + (a > c));
	 z = ((c > b) + (b > a));


		   if ((x <= z) && (z <= y) && (x <= y))
		   {
	   System.out.print("ACB");
		   }
	   }
		 a = 2;
		 b = 1;
		 c = 3;
		 {
	 x = ((b > a) + (a = c));
	 y = ((a > b) + (a > c));
	 z = ((c > b) + (b > a));


		   if ((x <= y) && (z <= y) && (z <= x))
		   {
	   System.out.print("CAB");
		   }
		 }

		a = 2;
		b = 3;
		c = 1;
		{
	 x = ((b > a) + (a = c));
	 y = ((a > b) + (a > c));
	 z = ((c > b) + (b > a));


		   if ((x <= z) && (y <= z) && (y <= x))
		   {
	   System.out.print("BAC");
		   }
		}
		a = 1;
		b = 2;
		c = 3;
		{
	 x = ((b > a) + (a = c));
	 y = ((a > b) + (a > c));
	 z = ((c > b) + (b > a));


		   if ((y < x) && (z < x) && (z < y))
		   {
	   System.out.print("CBA");
		   }
		}

	   a = 1;
	   b = 3;
	   c = 2;
	   {
	 x = ((b > a) + (a = c));
	 y = ((a > b) + (a > c));
	 z = ((c > b) + (b > a));


		   if ((z < x) && (y < x) && (z < x))
		   {
	   System.out.print("BCA");
		   }
	   }

	   return 0;

	}
}
