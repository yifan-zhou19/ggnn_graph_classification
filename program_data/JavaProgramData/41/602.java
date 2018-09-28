package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] word = new int[6]; //abcde????abcde????word??abcde???????
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		for (a = 1;a <= 5;a++)
		{
			 for (b = 1;b <= 5;b++)
			 {
				  if (b == a)
				  {
				  continue;
				  }
					  for (c = 1;c <= 5;c++)
					  {
						  if (c == b)
						  {
						  continue;
						  }
							  for (d = 1;d <= 5;d++)
							  {
								  if (d == c)
								  {
								  continue;
								  }
									  for (e = 1;e <= 5;e++)
									  {
									  if (e == d)
									  {
									  continue;
									  }
									  word[a] = (e == 1);
									  word[b] = (b == 2);
									  word[c] = (a == 5);
									  word[d] = (c != 1);
									  word[e] = (d == 1);
									  if ((word[1] == 1) && (word[2] == 1) && (word[3] == 0) && (word[4] == 0) && (word[5] == 0) && (e != 2) && (e != 3))
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
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
										  goto loop;
									  }
									  }
							  }
					  }
			 }
		}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	loop:
	return 0;
	}

}
