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
	   int[] word = new int[3];
	   for (z = 1;z <= 5;z++)
	   {
		   for (q = 1;q <= 5;q++)
		   {
			   if (z == q)
			   {
				   continue;
			   }
				for (s = 1;s <= 5;s++)
				{
					if ((s == z) || (s == q))
					{
						continue;
					}
					for (l = 1;l <= 5;l++)
					{
					if ((l == s) || (l == q) || (l == z))
					{
						continue;
					}
						 word[0] = (z + q) == (s + l);
						 word[1] = (z + l) > (s + q);
						 word[2] = (z + s) < q;
						 if (word[0] != 0 && word[1] != 0 && word[2] != 0)
						 {
						 for (i = 5;i >= 1;i--)
						 {
						   if (z == i)
						   {
							   System.out.print('z');
							   System.out.print(' ');
							   System.out.print(z * 10);
							   System.out.print("\n");
						   }
						   else if (q == i)
						   {
							   System.out.print('q');
							   System.out.print(' ');
							   System.out.print(q * 10);
							   System.out.print("\n");
						   }
						   else if (s == i)
						   {
							   System.out.print('s');
							   System.out.print(' ');
							   System.out.print(s * 10);
							   System.out.print("\n");
						   }
						   else if (l == i)
						   {
							   System.out.print('l');
							   System.out.print(' ');
							   System.out.print(l * 10);
							   System.out.print("\n");
						   }
						   else
						   {
							   continue;
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
