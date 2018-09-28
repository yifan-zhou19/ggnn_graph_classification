package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int z = 10;
	   int q = 10;
	   int s = 10;
	   int l = 10;
	   int i;
	   int j;
	   int k;
	   int p;
	   for (i = 10;i <= 50;i = i + 10)
	   {
		   j = 10;
		   for (j = 10;j <= 50;j = j + 10)
		   {
			   k = 10;
			   for (k = 10;k <= 50;k = k + 10)
			   {
				   p = 10;
				   for (p = 10;p <= 50;p = p + 10)
				   {
					   z = i,q = j,s = k,l = p;
					   if ((z + q == s + l) + (z + l > s + q) + (z + s < q) == 3)
					   {
						   break;
					   }

				   }
				   if ((z + q == s + l) + (z + l > s + q) + (z + s < q) == 3)
				   {
										  break;
				   }
			   }
			   if ((z + q == s + l) + (z + l > s + q) + (z + s < q) == 3)
			   {
									  break;
			   }
		   }
		   if ((z + q == s + l) + (z + l > s + q) + (z + s < q) == 3)
		   {
								  break;
		   }
	   }

	 int[] a = {z, q, s, l};
	 int t;
	 int J;
	 for (int I = 0;I <= 2;I++)
	 {
		J = 0;
		for (;J <= 2;J++)
		{
			if (a[J] < a[J + 1])
			{
				t = a[J];
				a[J] = a[J + 1];
				a[J + 1] = t;
			}
		}
	 }
	   char[] g = {0, '\0', '\0', '\0'};
	for (int c = 0;c <= 3;c++)
	{
		if (a[c] == z)
		{
		g[c] = 'z';
		}
		else if (a[c] == q)
		{
		g[c] = 'q';
		}
		else if (a[c] == s)
		{
		g[c] = 's';
		}
		else if (a[c] == l)
		{
		g[c] = 'l';
		}
	}
	for (int b = 0;b <= 3;b++)
	{
	System.out.print(g[b]);
	System.out.print(" ");
	System.out.print(a[b]);
	System.out.print("\n");
	}


	   return 0;
	}

}
