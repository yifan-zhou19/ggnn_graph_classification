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
	 for (a = 1; a <= 3; a++)
	 {
	   for (b = 1; b <= 3; b++)
	   {
		if (b == a)
		{
		continue;
		}
		for (c = 1; c <= 3; c++)
		{
		  if ((c == b) || (c == a))
		  {
		  continue;
		  }
		  x = (b >= a) + (c == a);
		  y = (a >= b) + (a >= c);
		  z = (c >= b) + (b >= a);
		  if (((x + a) == (y + b)) && ((y + b) == (z + c)))
		  {
		   if (a > b)
		   {
			  if (b > c)
			  {
				System.out.print("C");
				System.out.print("B");
				System.out.print("A");
			  }
			  else if (a > c)
			  {
				System.out.print("B");
				System.out.print("C");
				System.out.print("A");
			  }
			  else
			  {
				System.out.print("B");
				System.out.print("A");
				System.out.print("C");
			  }
		   }
		   else
		   {
			  if (a > c)
			  {
				System.out.print("C");
				System.out.print("A");
				System.out.print("B");
			  }
			  else if (b > c)
			  {
				System.out.print("A");
				System.out.print("C");
				System.out.print("B");
			  }
			  else
			  {
				System.out.print("A");
				System.out.print("B");
				System.out.print("C");
			  }
		   }
		  }
		}
	   }
	 }
	   return 0;
	}
}
