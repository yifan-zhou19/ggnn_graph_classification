package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		for (int a = 1;a <= 5;a++)
		{
		  for (int b = 1;b <= 5;b++)
		  {
			for (int c = 1;c <= 5;c++)
			{
			  for (int d = 1;d <= 5;d++)
			  {
				for (int e = 1;e <= 5;e++)
				{
					   if ((a + b + c + d + e) == 15 && a * b * c * d * e == 120 && e != 2 && e != 3)

					   {
							  if ((e == 1) + (b == 2) + (a == 5) + (c != 1) + (d == 1) == 2)
							  {
								 if (a == 1 || a == 2)
								 {
								   if (e != 1)
								   {
									   continue;
								   }
								 }

							if (b == 1 || b == 2)
							{
								if (b != 2)
								{
									continue;
								}
							}
							if (c == 1 || c == 2)
							{
								if (a != 5)
								{
									continue;
								}
							}
							if (d == 1 || d == 2)
							{
								if (c == 1)
								{
									continue;
								}
							}
							if (e == 1 || e == 2)
							{
								if (d != 1)
								{
									continue;
								}
							}
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
							return 0;
	}

}
