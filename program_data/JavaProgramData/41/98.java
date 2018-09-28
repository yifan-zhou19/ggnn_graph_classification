package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] rank = new int[6];
		int a;
		int b;
		int c;
		int d;
		int e;
		int i;
		for (e = 1;e <= 5;e++)
		{
		  if (e == 2 || e == 3)
		  {
			  continue;
		  }
		  else
		  {
		   for (a = 1;a <= 5;a++)
		   {
			  if (a == e)
			  {
				  continue;
			  }
			  else
			  {
				  for (b = 1;b <= 5;b++)
				  {
					  if (e == b || a == b)
					  {
						  continue;
					  }
					  else
					  {
						  for (c = 1;c <= 5;c++)
						  {
							  if (e == c || a == c || b == c)
							  {
								  continue;
							  }
								 else
								 {
										 d = 15 - a - b - c - e;
										 rank[a] = (e == 1);
										 rank[b] = (b == 2);
										 rank[c] = (a == 5);
										 rank[d] = (c != 1);
										 rank[e] = (d == 1);
										 if (rank[1] == 1 && rank[2] == 1 && rank[3] == 0 && rank[4] == 0 && rank[5] == 0)
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
		}

		return 0;
	}

}
