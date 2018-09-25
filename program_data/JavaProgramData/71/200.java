package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int c;
		int i;
		int max = 0;
		int j;
		int[] d = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] e = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (j = 1;j <= n;j++)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			c = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a % 400 == 0 || (a % 4 == 0 && a % 100 != 0))
			{
			   if (b > c)
			   {
				   for (i = c;i < b;i++)
				   {
					   max = max + e[i];
				   }
			   }
			   if (b < c)
			   {
				   for (i = b;i < c;i++)
				   {
						max = max + e[i];
				   }
			   }
				   if (max % 7 == 0)
				   {
					   System.out.print("YES");
					   System.out.print("\n");
				   }
				   else
				   {
					   System.out.print("NO");
					   System.out.print("\n");
				   }
				  max = 0;
			}
			else
			{
				   if (b > c)
				   {
							   for (i = c;i < b;i++)
							   {
								   max = max + d[i];
							   }
				   }
					if (b < c)
					{
							   for (i = b;i < c;i++)
							   {
									max = max + d[i];
							   }
					}
							   if (max % 7 == 0)
							   {
								   System.out.print("YES");
								   System.out.print("\n");
							   }
							   else
							   {
								   System.out.print("NO");
								   System.out.print("\n");
							   }
							  max = 0;
			}
		}



	}


}

