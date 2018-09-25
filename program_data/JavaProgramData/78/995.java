package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int z;
	   int q;
	   int s;
	   int l;
	   for (z = 1;z <= 5;z++)
	   {
		  for (q = 1;q <= 5;q++)
		  {
			  for (s = 1;s <= 5;s++)
			  {
				   for (l = 1;l <= 5;l++)
				   {
						if ((z + q == s + l) && (z + l > s + q) && z + s < q)
						{
							 System.out.print("l ");
							 System.out.print(10 * l);
							 System.out.print("\n");
							 System.out.print("q ");
							 System.out.print(10 * q);
							 System.out.print("\n");
							 System.out.print("z ");
							 System.out.print(10 * z);
							 System.out.print("\n");
							 System.out.print("s ");
							 System.out.print(10 * s);
						}
				   }
			  }
		  }
	   }
	   return 0;
	}

}
