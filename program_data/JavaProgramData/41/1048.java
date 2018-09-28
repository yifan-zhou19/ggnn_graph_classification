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
		for (a = 1;a < 6;++a)
		{
			for (b = 1;b < 6;++b)
			{
			if (a == b)
			{
				continue;
			}
			   for (c = 1;c < 6;++c)
			   {
				   if (a == c || b == c)
				   {
					   continue;
				   }
				  for (d = 1;d < 6;++d)
				  {
					  if (a == d || b == d || c == d)
					  {
						  continue;
					  }
					 for (e = 4;e < 6;++e)
					 {
						 if (a == e || b == e || c == e || d == e)
						 {
							 continue;
						 }
						if ((e == 1) == 0 && (d != 1) && (b == 2) == 1 && a != 1 && (a == 5) + (c != 1) == 1)
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
		return 0;
	}

}
