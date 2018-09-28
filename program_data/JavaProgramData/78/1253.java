package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int z;
		int q;
		int s;
		int l;
		for (z = 1; z <= 5; z++)
		{
			for (q = 1; q <= 5; q++)
			{
			   for (s = 1; s <= 5; s++)
			   {
				  for (l = 1; l <= 5; l++)
				  {
					  if ((z + q == s + l) && (z + l > s + q) && (z + s < q))
					  {
						   int[] a = {z, q, s, l};
						   int[] b = {z, q, s, l};
						   int i;
						   int j;
						   int k;
						   int p;
						   char[] c = {'z', 'q', 's', 'l'};
						   for (j = 1; j <= 3; j++)
						   {
								for (i = 0; i <= 3 - j; i++)
								{
									if (a[i] < a[i + 1])
									{
										p = a[i];
										a[i] = a[i + 1];
										a[i + 1] = p;
									}
								}
						   }

						   for (i = 0; i <= 3; i++)
						   {
								for (k = 0; k <= 3; k++)
								{
									if (a[i] == b[k])
									{
									System.out.print(c[k]);
									System.out.print(" ");
									System.out.print(10 * a[i]);
									System.out.print("\n");
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
