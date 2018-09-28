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
		int g;
		int h;
		int i;
		int j;
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
						   if (a * b * c * d * e == 120 && a + b + c + d + e == 15)
						   {
								 f = (e == 1);
								 g = (b == 2);
								 h = (a == 5);
								 i = (c != 1);
								 j = (d == 1);
								 if (f + g + h + i + j == 2)
								 {
									   if ((a == f || b == g || c == h || d == i || e == j) && (a == f + 1 || b == g + 1 || c == h + 1 || d == i + 1 || e == j + 1) && e != 2 && e != 3)
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
			}
		}

		return 0;
	}

}
