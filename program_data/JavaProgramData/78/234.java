package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int z;
		int q;
		int s;
		int l;
		int a1;
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
			 if ((s == q) || (s == z))
			 {
				 continue;
			 }
		 for (l = 1;l <= 5;l++)
		 {
			  if ((l == q) || (l == z) || (l == s))
			  {
				 continue;
			  }
		   a1 = ((z + q) == (s + l)) + ((z + l) > (s + q)) + ((z + s) < (q));
		   if (a1 == 3)
		   {
		   System.out.print("l ");
		   System.out.print(l * 10);
		   System.out.print("\n");
		   System.out.print("q ");
		   System.out.print(q * 10);
		   System.out.print("\n");
		   System.out.print("z ");
		   System.out.print(z * 10);
		   System.out.print("\n");
		   System.out.print("s ");
		   System.out.print(s * 10);
		   System.out.print("\n");
		   }
		 }
		 }
		 }
		}
					return 0;
	}


}
