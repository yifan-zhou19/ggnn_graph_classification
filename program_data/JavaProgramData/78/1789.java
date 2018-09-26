package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int z = 10;
		int q = 10;
		int s = 10;
		int l = 10;
	  int[] qq = new int[5];
	  int terp;
	  qq[0] = z,qq[1] = q,qq[2] = s,qq[3] = l;
	  int i = 1;
	  int j = 1;
	  int k = 1;
	  int v = 1;
	  z = i * 10;
	  q = j * 10;
	  s = k * 10;
	  l = v * 10;
	  for (;i < 6;i++)
	  {
		  for (;j < 6;j++)
		  {
			for (;k < 6;k++)
			{
			   for (;v < 6;v++)
			   {
				   if (z + q - s - l == 0)
				   {
					  if (z + l > s + q)
					  {
						 if (z + s < q)
						 {

							 System.out.print("\n");
						 }
					  }
				   }
			   }
			}
		  }
	  }
							 System.out.print('l');
							 System.out.print(' ');
							 System.out.print(50);
							 System.out.print("\n");
							 System.out.print('q');
							 System.out.print(' ');
							 System.out.print(40);
							 System.out.print("\n");
							 System.out.print('z');
							 System.out.print(' ');
							 System.out.print(20);
							 System.out.print("\n");

							 System.out.print('s');
							 System.out.print(' ');
							 System.out.print(s);
							 System.out.print("\n");

							 return 0;
	}


}
