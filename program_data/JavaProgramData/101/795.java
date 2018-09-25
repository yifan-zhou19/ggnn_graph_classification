package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int a = 0; //a b c???A B C???   a1 b1 c1 ?ABC?????????
	int b = 0;
	int c = 0;
	int a1;
	int b1;
	int c1;
		 for (a = 1;a <= 3;a++)
		 {
						  for (b = 1;b <= 3;b++)
						  {
										   for (c = 1;c <= 3;c++)
										   {
												a1 = (b > a) + (c == a);
												b1 = (a > b) + (a > c);
												c1 = (c > b) + (b > a);
												if ((a + a1 == 3) && (b + b1 == 3) && (c + c1 == 3))
												{
													   if (a == 1)
													   {
													   System.out.print("A");
													   }
													   if (b == 1)
													   {
													   System.out.print("B");
													   }
													   if (c == 1)
													   {
													   System.out.print("C");
													   }
													   if (a == 2)
													   {
													   System.out.print("A");
													   }
													   if (b == 2)
													   {
													   System.out.print("B");
													   }
													   if (c == 2)
													   {
													   System.out.print("C");
													   }
													   if (a == 3)
													   {
													   System.out.print("A");
													   }
													   if (b == 3)
													   {
													   System.out.print("B");
													   }
													   if (c == 3)
													   {
													   System.out.print("C");
													   }

												}
										   }
						  }
		 }
	return 0;
	}
}
