package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
	  for (a = 0;a <= 2;a++)
	  {
	  for (b = 0;b <= 2;b++)
	  {
	  for (c = 0;c <= 2;c++)
	  {
		   d = (b > a) + (c == a);
		 e = (a > b) + (a > c);
		 f = (c > b) + (b > a); //?????????
		 if (a * b * c == 0 && (a + b + c) == 3 && (d + e + f) == 3 && d * e * f == 0) //????abcdef????????0,1,2???
		 {
			  if (a + d == 2 && b + e == 2 && c + f == 2) //????????????????????
			  {
				if (a > b > c)
				{
					System.out.print("C");
					System.out.print("B");
					System.out.print("A");
				}
			 if (a > c > b)
			 {
				 System.out.print("B");
				 System.out.print("C");
				 System.out.print("A");
			 }
			 if (b > a > c)
			 {
				 System.out.print("C");
				 System.out.print("A");
				 System.out.print("B");
			 }
			 if (b > c > a)
			 {
				 System.out.print("A");
				 System.out.print("C");
				 System.out.print("B");
			 }
			 if (c > a > b)
			 {
				 System.out.print("B");
				 System.out.print("A");
				 System.out.print("C");
			 }
			 if (c > b > a)
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
