package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] word = new int[6];
		int a;
		int b;
		int c;
		int d;
		int e;
		word[0] = -1;
		for (a = 1;a <= 5;a++)
		{
		   for (b = 1;b <= 5;b++)
		   {
			  if (a == b || b == 1 || b == 3 || b == 4 || b == 5)
			  {
				  continue;
			  }
			   for (c = 1;c <= 5;c++)
			   {
				   if (a == c || b == c)
				   {
					   continue;
				   }
				 for (d = 1;d <= 5;d++)
				 {
					 if (a == d || b == d || c == d)
					 {
						 continue;
					 }
				   for (e = 1;e <= 5;e++)
				   {
					   if (a == e || b == e || c == e || d == e || e == 2 || e == 3)
					   {
						   continue;
					   }
					word[a] = (e == 1);
					word[b] = 1;
					word[c] = (a == 5);
					word[d] = (c != 1);
					word[e] = (d == 1);
					if (word[1] == 1 && word[2] == 1 && word[3] == 0 && word[4] == 0 && word[5] == 0)
					{
						System.out.print(a);
						System.out.print(" ");
						System.out.print(b);
						System.out.print(" ");
						System.out.print(c);
						System.out.print(" ");
						System.out.print(d);
						System.out.print(" ");
						System.out.print(e);
						System.out.print("\n");
					}
				   }
				 }
			   }
		   }
		}
		return 0;
	}
}
