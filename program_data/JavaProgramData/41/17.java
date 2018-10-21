package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		int[] word = new int[6];
		for (a = 1;a < 6;a++)
		{
		  for (b = 1;b < 6;b++)
		  {
		  if (a == b)
		  {
			  continue;
		  }
		  else
		  {
			  for (c = 1;c < 6;c++)
			  {
			   if (a == c || b == c)
			   {
				   continue;
			   }
			   else
			   {
				   for (d = 1;d < 6;d++)
				   {
			   if (a == d || b == d || c == d)
			   {
				   continue;
			   }
			   else
			   {
				   for (e = 1;e < 6;e++)
				   {
			   if (a == e || b == e || c == e || d == e || e == 2 || e == 3)
			   {
				   continue;
			   }
			   else
			   {
					   word[a] = e == 1;
					   word[b] = b == 2;
					   word[c] = a == 5;
					   word[d] = c != 1;
					   word[e] = d == 1;
					   if (word[1] + word[2] == 2 && word[3] + word[4] + word[5] == 0)
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
			  }
		  }
		  }
		}
		return 0;
	}

}
