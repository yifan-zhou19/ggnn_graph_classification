package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int A;
		int B;
		int C;
		int D;
		int E;
	  for (int a = 1;a < 6;a++)
	  {
	   for (int b = 1;b < 6;b++)
	   {
		if (a == b)
		{
		continue;
		}
		else
		{
		 for (int c = 1;c < 6;c++)
		 {
		   if ((c == a) || (c == b))
		   {
		   continue;
		   }
		   else
		   {
			for (int d = 1;d < 6;d++)
			{
			 if ((d == a) || (d == b) || (d == c))
			 {
			 continue;
			 }
			 else
			 {
			   for (int e = 1;e < 6;e++)
			   {
				 if ((e == a) || (e == b) || (e == c) || (e == d))
				 {
				 continue;
				 }
				 else
				 {
					 A = (e == 1);
					 B = (b == 2);
					 C = (a == 5);
					 D = (c != 1);
					 E = (d == 1);
					 if ((A + B + C + D + E == 2) && (e != 2) && (e != 3))
					 {
						if ((A != 0 && (a == 1 || a == 2)) + (B != 0 && (b == 1 || b == 2)) + (C != 0 && (c == 1 || c == 2)) + (D != 0 && (d == 1 || d == 2)) + (E != 0 && (e == 1 || e == 2)) == 2)
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
																System.out.print("\n");
						}
					 }
				 }
			   }
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
