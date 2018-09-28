package <missing>;

public class GlobalMembers
{
	//============================================================================
	// Name        : shj.cpp
	// Author      : ???
	// time        : 2013.10.21
	// Description :  ???
	//============================================================================


	public static int Main() //???
	{ //?????
	   int z = 50;
	   int q = 50;
	   int s = 50;
	   int l = 50;
	  for (z = 50;z >= 10;z = z - 10) //???????z,q,s,l
	  {
		  for (q = 50;q >= 10;q = q - 10)
		  {
			  if (z == q)
			  {
				  continue;
			  }
			  for (s = 50;s >= 10;s = s - 10)
			  {
				  if (s == z || s == q)
				  {
					  continue;
				  }
				  for (l = 50;l >= 10;l = l - 10)
				  {
					  if (l == z || l == q || l == s)
					  {
						  continue;
					  }
					  if (((z + q) == (s + l)) && ((z + l) > (q + s)) && ((z + s) < q))
					  {
						 for (int i = 50;i >= 10;i = i - 10) //???????
						 {
							 if (z == i)
							 {
								 System.out.print("z ");
								 System.out.print(z);
								 System.out.print("\n");
							 }
							 else if (q == i)
							 {
								 System.out.print("q ");
								 System.out.print(q);
								 System.out.print("\n");
							 }
							 else if (s == i)
							 {
								 System.out.print("s ");
								 System.out.print(s);
								 System.out.print("\n");
							 }
							 else if (l == i)
							 {
								 System.out.print("l ");
								 System.out.print(l);
								 System.out.print("\n");
							 }
						 }

					  }

				  }
			  }
		  }
	  }
	   return 0;
	} //?????

}
