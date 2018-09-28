package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int d;
		int e;
		int i;
		int[] rank = new int[6];
		int[] word = new int[1000];
		 for (a = 1;a <= 5;a++)
		 {
		  for (b = 1;b <= 5;b++)
		  {
		   if (b == a)
		   {
			   continue;
		   }
		   else
		   {
			  for (c = 1;c <= 5;c++)
			  {
				 if (c == a || c == b)
				 {
					 continue;
				 }
				 else
				 {
					for (d = 1;d <= 5;d++)
					{
					   if (d == a || d == b || d == c)
					   {
						   continue;
					   }
					   else
					   {
							e = 15 - a - b - c - d;
						   if (e == 2 || e == 3)
						   {
							   continue;
						   }
						   else
						   {
							   word['a'] = (e == 1);
							 word['b'] = (b == 2);
							 word['c'] = (a == 5);
							 word['d'] = (c != 1);
							 word['e'] = (d == 1);
							 rank[a] = 'a';
							 rank[b] = 'b';
							 rank[c] = 'c';
							 rank[d] = 'd';
							 rank[e] = 'e';
							 if (word[rank[1]] == 1 && word[rank[2]] == 1 && word[rank[3]] == 0 && word[rank[4]] == 0 && word[rank[5]] == 0)
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
