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
		int A;
		int B;
		int C;
		int D;
		int E;
		int a1;
		int b1;
		int c1;
		int d1;
		int e1;
		for (a = 1;a <= 5;a++)
		{
		  for (b = 1;(b <= 5);b++)
		  {
			for (c = 1;(c <= 5) ;c++)
			{
			   for (d = 1;(d <= 5) ;d++)
			   {
					 if ((b != a) && (c != a) && (c != b) && (d != a) && (d != b) && (d != c))
					 {
						e = 15 - a - b - c - d;
					if (e != 2 && e != 3)
					{
						 A = (e == 1);
					 B = (b == 2);
					 C = (a == 5);
					 D = (c != 1);
					 E = (d == 1);
					 a1 = a - A;
					 b1 = b - B;
					 c1 = c - C;
					 d1 = d - D;
					 e1 = e - E;
					 if (b1 + c1 == 1 || a1 + b1 == 1 || a1 + c1 == 1 || a1 + d1 == 1 || a1 + e1 == 1 || b1 + e1 == 1 || d1 + e1 == 1 || c1 + e1 == 1)
					 {
					 System.out.print(a);
					 System.out.print(' ');
					 System.out.print(b);
					 System.out.print(' ');
					 System.out.print(c);
					 System.out.print(' ');
					 System.out.print(d);
					 System.out.print(' ');
					 System.out.print(e);
					 System.out.print("\n");
					 }
					}
					 }
			   }
			}
		  }
		}
			return 0;
	}

}
