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
		int[] k = new int[6];
		int[] p = new int[6];
		for (a = 1;a <= 5;a++)
		{
			for (b = 1;b <= 5;b++)
			{
				if (b == a)
				{
					continue;
				}
			   for (c = 1;c <= 5;c++)
			   {
				  if (c == a || b == c)
				  {
					  continue;
				  }
				  for (d = 1;d <= 5;d++)
				  {
					  if (d == c || d == a || d == b)
					  {
						  continue;
					  }
					  for (e = 1;e <= 5;e++)
					  {
					   if (e == c || e == a || e == b || e == d || e == 2 || e == 3)
					   {
						   continue;
					   }
						  else
						  {
							  p[a] = 1;
							  p[b] = 2;
							  p[c] = 3;
							  p[d] = 4;
							  p[e] = 5;
					   k[1] = e == 1;
					   k[2] = b == 2;
					   k[3] = a == 5;
					   k[4] = c != 1;
					   k[5] = d == 1;
					   if (k[p[1]] == 1 && k[p[2]] == 1 && k[p[3]] == 0 && k[p[4]] == 0 && k[p[5]] == 0)
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
