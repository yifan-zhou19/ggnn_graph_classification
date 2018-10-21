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
	int worda;
	int wordb;
	int wordc;
	int wordd;
	int worde;
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
					 worda = (e == 1);
					 wordb = (b == 2);
					 wordc = (a == 5);
					 wordd = (c != 1);
					 worde = (d == 1);
					 A = (worda == 1 && (a == 1 || a == 2) || worda == 0 && a != 1 && a != 2);
					 B = (wordb == 1 && (b == 1 || b == 2) || wordb == 0 && b != 1 && b != 2);
					 C = (wordc == 1 && (c == 1 || c == 2) || wordc == 0 && c != 1 && c != 2);
					 D = (wordd == 1 && (d == 1 || d == 2) || wordd == 0 && d != 1 && d != 2);
					 E = (worde == 1 && (e == 1 || e == 2) || worde == 0 && e != 1 && e != 2);
					 if (A == 1 && B == 1 && C == 1 && D == 1 && E == 1 && e != 2 && e != 3 && a != b && a != c && a != d && a != e && b != c && b != d && b != e && c != d && c != e && d != e)
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
						  return 0;
					 }
				}
			 }
		  }
	   }
	}
	   return 0;


	}
}
