package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int z = 1;
	  int q = 1;
	  int s = 1;
	  int l = 1;
	  int i = 1;
	   for (z = 1;z <= 5;z++)
	   {
		for (q = 1;q <= 5;q++)
		{
		 for (s = 1;s <= 5;s++)
		 {
		  for (l = 1;l <= 5;l++)
		  {
		   if (((z + q) == (s + l)) + ((z + l) > (s + q)) + (q > (z + s)) == 3)
		   {
			if ((z != q) && (q != s) && (s != l) && (q != s) && (s != l) && (q != l))
			{


			 for (i = 5;i >= 1;i--)

			 {
				 if (s == i)
				 {
					 System.out.print("s");
					 System.out.print(' ');
					 System.out.print(10 * s);
					 System.out.print("\n");
				 }
			  if (z == i)
			  {
				  System.out.print("z");
				  System.out.print(' ');
				  System.out.print(10 * z);
				  System.out.print("\n");
			  }
			  if (q == i)
			  {
				  System.out.print("q");
				  System.out.print(' ');
				  System.out.print(10 * q);
				  System.out.print("\n");
			  }
			  if (l == i)
			  {
				  System.out.print("l");
				  System.out.print(' ');
				  System.out.print(10 * l);
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
