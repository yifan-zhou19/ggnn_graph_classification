package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int z;
	  int q;
	  int s;
	  int l;
	  int i;
	  int j;
	  char[] name = {'z', 'q', 's', 'l'};
	  int t;
	  char tname;
	  for (z = 10;z <= 50;z = z + 10)
	  {
		for (q = 10;q <= 50;q = q + 10)
		{
			if (z == q)
			{
				continue;
			}
			for (s = 10;s <= 50;s = s + 10)
			{
			  if (z == s || q == s)
			  {
				  continue;
			  }
					for (l = 10;l <= 50;l = l + 10)
					{
			  if (z == l || q == l || s == l)
			  {
				  continue;
			  }
			  else if ((z + q) == (s + l) && (z + l) > (s + q) && (z + s) < q)
			  {
				  int[] result = {z, q, s, l};
			   for (i = 3;i > 0;i--)
			   {
					for (j = i - 1;j >= 0;j--)
					{
					   if (result[i] > result[j])
					   {
						 t = result[i];
						 result[i] = result[j];
						 result[j] = t;
						 tname = name[i];
						 name[i] = name[j];
						 name[j] = tname;
					   }
					}
			   }
			   for (i = 0;i < 4;i++)
			   {
				System.out.print(name[i]);
				System.out.print(" ");
				System.out.print(result[i]);
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
