package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int z;
		int q;
		int s;
		int l;
		int[] a = new int[51];
		for (i = 10;i <= 50;i = i + 50)
		{
			a[i] = i;
		}
		for (z = 10;z <= 50;z = z + 10)
		{
			for (q = 10;q <= 50;q = q + 10)
			{
				if (z != q)
				{
				   for (s = 10;s <= 50;s = s + 10)
				   {
					 if (z != s && s != q)
					 {
						for (l = 10;l <= 50;l = l + 10)
						{
						   if (l != z && l != q && l != s)
						   {
							 if ((z + q == s + l) && (z + l > s + q) && (z + s < q))
							 {
						   for (i = 50;i >= 10;i = i - 10)
						   {
							   if (a[i] != 0)
							   {
							   if (a[i] = l)
							   {
								   System.out.print("l");
								   System.out.print(" ");
								   System.out.print(l);
								   System.out.print("\n");
							   }
							 if (a[i] = q)
							 {
								 System.out.print("q");
								 System.out.print(" ");
								 System.out.print(q);
								 System.out.print("\n");
							 }
							  if (a[i] = z)
							  {
								  System.out.print("z");
								  System.out.print(" ");
								  System.out.print(z);
								  System.out.print("\n");
							  }
							 if (a[i] = s)
							 {
								 System.out.print("s");
								 System.out.print(" ");
								 System.out.print(s);
								 System.out.print("\n");
							 }





							   }
						   }
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
