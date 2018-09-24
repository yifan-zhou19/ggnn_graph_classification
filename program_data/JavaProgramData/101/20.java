package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		for (a = 1;a <= 3; a++)
		{
			 for (b = 1;b <= 3; b++)
			 {
				  for (c = 1;c <= 3; c++)
				  {
					  if (((b > a) + (c == a) == 3 - a) && ((a > b) + (a > c) == 3 - b) && ((c > b) + (b > a) == 3 - c))
					  {
						 if (a < b && b < c)
						 {
							 System.out.print('A');
							 System.out.print('B');
							 System.out.print('C');
						 }
						 if (a < c && c < b)
						 {
							 System.out.print('A');
							 System.out.print('C');
							 System.out.print('B');
						 }
						 if (b < a && a < c)
						 {
							 System.out.print('B');
							 System.out.print('A');
							 System.out.print('C');
						 }
						 if (b < c && c < a)
						 {
							 System.out.print('B');
							 System.out.print('C');
							 System.out.print('A');
						 }
						 if (c < a && a < b)
						 {
							 System.out.print('C');
							 System.out.print('A');
							 System.out.print('B');
						 }
						 if (c < b && b < a)
						 {
							 System.out.print('C');
							 System.out.print('B');
							 System.out.print('A');
						 }
					  }
				  }
			 }
		}
				  return 0;
	}
}
