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
		int[] a = new int[4];
		int temp;
		for (z = 10;z <= 50;z = z + 10)
		{
		  for (q = 10;q <= 50;q = q + 10)
		  {
			for (s = 10;s <= 50;s = s + 10)
			{
			  for (l = 10;l <= 50;l = l + 10)
			  {
					 if (z + q == s + l)
					 {
					   if (z + l > s + q)
					   {
						 if (z + s < q) //?????????????
						 {
						   if (z != q && z != s && z != l)
						   {
							 if (q != s && q != l)
							 {
							   if (s != l) //?????????????????????????????
							   {
									a[0] = z;
									a[1] = q;
									a[2] = s;
									a[3] = l; //??????????
								for (j = 0;j < 3;j++)
								{
									for (i = j + 1;i < 4;i++)
									{
										  if (a[j] < a[i])
										  {
											  temp = a[j];
											  a[j] = a[i];
											  a[i] = temp; //???????
										  }
									}
								}
									for (i = 0;i < 4;i++)
									{
										  if (z == a[i])
										  {
											  System.out.print("z");
											  System.out.print(" ");
											  System.out.print(a[i]);
											  System.out.print("\n");
										  }
										  if (q == a[i])
										  {
											  System.out.print("q");
											  System.out.print(" ");
											  System.out.print(a[i]);
											  System.out.print("\n");
										  }
										  if (s == a[i])
										  {
											  System.out.print("s");
											  System.out.print(" ");
											  System.out.print(a[i]);
											  System.out.print("\n");
										  }
										  if (l == a[i])
										  {
											  System.out.print("l");
											  System.out.print(" ");
											  System.out.print(a[i]);
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
		}
								 return 0;
	}




}
