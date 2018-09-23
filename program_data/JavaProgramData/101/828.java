package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int a;
	int b;
	int c;
	int judgea;
	int judgeb;
	int judgec;
	int ta;
	int tb;
	int tc;
	for (a = 1;a <= 3;a++)
	{
	   for (b = 1;b <= 3;b++)
	   {
		  for (c = 1;c <= 3;c++)
		  {
			  ta = (b > a) + (c == a);
			  tb = (a > b) + (a > c);
			  tc = (c > b) + (b > a);
			  if ((a - b) * (ta - tb) < 0 || a == b && ta == tb)
			  {
				 judgea = 1;
			  }
			  if ((a - c) * (ta - tc) < 0 || a == c && ta == tc)
			  {
				 judgeb = 1;
			  }
			  if ((b - c) * (tb - tc) < 0 || b == c && tb == tc)
			  {
				 judgec = 1;
			  }
			  if (judgea == judgeb && judgeb == judgec)
			  {
			  if (a <= c != 0 && a <= b)
			  {
				  if (b <= c)
				  {
					  System.out.print('A');
					  System.out.print('B');
					  System.out.print('C');
				  }
					  else
					  {
						  System.out.print('A');
						  System.out.print('C');
						  System.out.print('B');
					  }
			  }
			  if (b <= c != 0 && b <= a)
			  {
				  if (c <= a)
				  {
					   System.out.print('B');
					   System.out.print('C');
					   System.out.print('A');
				  }
					   else
					   {
						   System.out.print('B');
						   System.out.print('A');
						   System.out.print('C');
					   }
			  }
			  if (c <= b != 0 && c <= a)
			  {
				   if (b <= a)
				   {
						 System.out.print('C');
						 System.out.print('B');
						 System.out.print('A');
				   }
						 else
						 {
							System.out.print('C');
							System.out.print('A');
							System.out.print('B');
						 }
			  }
			a = b = c = 9;
			  }
		  }
	   }
	}
	return 0;


	}
}
