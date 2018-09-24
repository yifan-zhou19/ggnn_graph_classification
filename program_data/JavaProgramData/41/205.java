package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int[] mingci = new int[6];
	  int a;
	  int b;
	  int c;
	  int d;
	  int e;
	  int a1;
	  int a2;
	  int a3;
	  int a4;
	  int a5;
	  int zong;
	  for (a = 1;a <= 5;a++)
	  {
		  for (b = 1;b <= 5;b++)
		  {
			  if (a == b)
			  {
				  continue;
			  }
			  else
			  {
				  for (c = 1;c <= 5;c++)
				  {
				  if (a == c || b == c)
				  {
					  continue;
				  }
				  else
				  {
					  for (d = 1;d <= 5;d++)
					  {
					  if (a == d || b == d || c == d)
					  {
						  continue;
					  }
					  else
					  {
						  e = 15 - a - b - c - d;
					  }
					  if ((e == 1) && (d == 1) && (a != 1) && (a != 2) && (c != 1) && (a != 5))
					  {
					   mingci[a] = a;
					   mingci[b] = b;
					   mingci[c] = c;
					   mingci[d] = d;
					   mingci[e] = e;
					   System.out.print(15 - mingci[b] - mingci[c] - mingci[d] - mingci[e]);
					   System.out.print(" ");
					   System.out.print(mingci[b]);
					   System.out.print(" ");
					   System.out.print(mingci[c]);
					   System.out.print(" ");
					   System.out.print(mingci[d]);
					   System.out.print(" ");
					   System.out.print(mingci[e]);
					   System.out.print("\n");
					  }
					  else if ((e != 2) && (e != 3) && (d != 1))
					  {
						  if ((d == 2) && (c != 1))
						  {
						   a1 = ((a == 1) && (e == 1) && (b != 2) && (a != 5));
						   a2 = ((b == 1) && (b == 2) && (e != 1) && (a != 5));
						   zong = a1 + a2;
						   if (zong == 1)
						   {
							   mingci[a] = a;
						   mingci[b] = b;
						   mingci[c] = c;
						   mingci[d] = d;
						   mingci[e] = e;
						   System.out.print(15 - mingci[b] - mingci[c] - mingci[d] - mingci[e]);
						   System.out.print(" ");
						   System.out.print(mingci[b]);
						   System.out.print(" ");
						   System.out.print(mingci[c]);
						   System.out.print(" ");
						   System.out.print(mingci[d]);
						   System.out.print(" ");
						   System.out.print(mingci[e]);
						   System.out.print("\n");
						   }
						  }
						  if ((d != 2) && (c == 1) && (a == 5))
						  {
							a2 = ((b == 2) && (b == 2) && (e != 1));
							if (a2 == 1)
							{
								mingci[a] = a;
							}
						   mingci[b] = b;
						   mingci[c] = c;
						   mingci[d] = d;
						   mingci[e] = e;
						   System.out.print(mingci[a]);
						   System.out.print(" ");
						   System.out.print(mingci[b]);
						   System.out.print(" ");
						   System.out.print(mingci[c]);
						   System.out.print(" ");
						   System.out.print(mingci[d]);
						   System.out.print(" ");
						   System.out.print(mingci[e]);
						   System.out.print("\n");
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
