package <missing>;

public class GlobalMembers
{
	public static int z;
	public static int q;
	public static int s;
	public static int l;

	public static void check(int num)
	{
		 if (z == num)
		 {
			 System.out.print("z ");
			 System.out.print(num * 10);
			 System.out.print("\n");
		 }
		 if (q == num)
		 {
			 System.out.print("q ");
			 System.out.print(num * 10);
			 System.out.print("\n");
		 }
		 if (s == num)
		 {
			 System.out.print("s ");
			 System.out.print(num * 10);
			 System.out.print("\n");
		 }
		 if (l == num)
		 {
			 System.out.print("l ");
			 System.out.print(num * 10);
			 System.out.print("\n");
		 }
		 return;
	}

	public static int Main()
	{
		for (z = 1; z <= 5; ++z)
		{
		  for (q = 1; q <= 5; ++q)
		  {
			if (z != q)
			{
				  for (s = 1; s <= 5; ++s)
				  {
					if (z != s && q != s)
					{
					  for (l = 1; l <= 5; ++l)
					  {
						if (z != l && q != l && s != l)
						{
							  if ((z + q) == (s + l) && (z + l) > (s + q) && (z + s) < q)
							  {
									   check(5);
									   check(4);
									   check(3);
									   check(2);
									   check(1);
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
