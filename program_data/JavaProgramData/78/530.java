package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int sum = 0;
		int z;
		int q;
		int s;
		int l;
		int zw;
		int qw;
		int sw;
		int lw;
		for (z = 1;z <= 5;z++)
		{
		   for (q = 1;q <= 5;q++)
		   {
			   if (q == z)
			   {
				   continue;
			   }
			  for (s = 1;s <= 5;s++)
			  {
				  if (z == s || q == s)
				  {
					  continue;
				  }
				 for (l = 1;l <= 5;l++)
				 {
					  if (l == z || l == q || l == s)
					  {
						  continue;
					  }
					 sum = (z + q == s + l) + (z + l > s + q) + (z + s < q);
					 if (sum == 3)
					 {
						 zw = z;
						 qw = q;
						 sw = s;
						 lw = l;
					 }
				 }
			  }
		   }
		}
		if (qw > lw && zw > sw)
		{
			System.out.print("q ");
			System.out.print(qw * 10);
			System.out.print("\n");
			System.out.print("l ");
			System.out.print(lw * 10);
			System.out.print("\n");
			System.out.print("z ");
			System.out.print(zw * 10);
			System.out.print("\n");
			System.out.print("s ");
			System.out.print(sw * 10);
			System.out.print("\n");
		}
		if (qw > lw && sw > zw)
		{
		   System.out.print("q ");
		   System.out.print(qw * 10);
		   System.out.print("\n");
		   System.out.print("l ");
		   System.out.print(lw * 10);
		   System.out.print("\n");
		   System.out.print("s ");
		   System.out.print(sw * 10);
		   System.out.print("\n");
		   System.out.print("z ");
		   System.out.print(zw * 10);
		   System.out.print("\n");
		}
		if (lw > qw && sw > zw)
		{
			 System.out.print("l ");
			 System.out.print(lw * 10);
			 System.out.print("\n");
			 System.out.print("q ");
			 System.out.print(qw * 10);
			 System.out.print("\n");
			 System.out.print("s ");
			 System.out.print(sw * 10);
			 System.out.print("\n");
			 System.out.print("z ");
			 System.out.print(zw * 10);
			 System.out.print("\n");
		}
		if (lw > qw && zw > sw)
		{
			 System.out.print("l ");
			 System.out.print(lw * 10);
			 System.out.print("\n");
			 System.out.print("q ");
			 System.out.print(qw * 10);
			 System.out.print("\n");
			 System.out.print("z ");
			 System.out.print(zw * 10);
			 System.out.print("\n");
			 System.out.print("s ");
			 System.out.print(sw * 10);
			 System.out.print("\n");
		}
		   return 0;
	}


}
