package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] c = new char[1][33];
		char[][] e =
		{
			{1, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		int i = 0;
		int j = 0;
		int t = 0;
	   int f;
	   int k;
	   int m = 1;
	   int a;
	   int b;
		 int s = 0;
		 int[] d = new int[1000];

	a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		c[0] = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (c[0][0] == 48)
		{
			System.out.print(s);
		}
	   else
	   {
			 while (c[0][i] != '\0')
			 {
				 i++;
			 }
				  i = i - 1;
					   for (j = 0;j <= i;j++)
					   {
						   if (i > j)
						   {
							   for (f = 0;f < i - j;f++)
							   {
								   m = m * a;
							   }
						   }
					  if (c[0][j] < 65)
					  {
						  k = (c[0][j] - 48) * m;
					  }
					  if (c[0][j] >= 65 && c[0][j] < 97)
					  {
						  k = (c[0][j] - 55) * m;
					  }
					  if (c[0][j] >= 97)
					  {
						  k = (c[0][j] - 87) * m;
					  }

							s = s + k;
							m = 1;
					   }
			   while (s > 0)
			   {
				   d[t] = s % b;
				   if (d[t] > 9)
				   {
					   e[0][t] = d[t] + 55;
				   }
						   s /= b;
						   t++;
			   }
			   for (j = t - 1;j >= 0;j--)
			   {
				   if (e[0][j] != '\0' && e[0][j] != 1)
				   {
					   System.out.print(e[0][j]);
				   }
						else
						{
							System.out.print(d[j]);
						}
			   }
	   }
	return 0;
	}
}

