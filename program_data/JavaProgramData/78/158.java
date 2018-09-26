package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int z = 10;
	 int s = 20;
	 int l = 30;
	 int q = 40;
	 int t;
		 if (z + l < q + s)
		 {
			  t = z;
		   z = s;
		   s = t;
		   t = l;
		   l = q;
		   q = t;
		 }
		 if (z + s >= q)
		 {
			   q = q + 10;
			l = l + 10;
		 }
		  if (z < s)
		  {
			   System.out.print("q ");
			   System.out.print(q);
			   System.out.print("\n");
			System.out.print("l ");
			System.out.print(l);
			System.out.print("\n");
			System.out.print("s ");
			System.out.print(s);
			System.out.print("\n");
			System.out.print("z ");
			System.out.print(z);
			System.out.print("\n");
		  }
		   else
		   {
			   System.out.print("l ");
			   System.out.print(l);
			   System.out.print("\n");
					System.out.print("q ");
					System.out.print(q);
					System.out.print("\n");
					System.out.print("z ");
					System.out.print(z);
					System.out.print("\n");
					System.out.print("s ");
					System.out.print(s);
					System.out.print("\n");

		   }
	return 0;
	}

}
