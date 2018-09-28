package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[][] a = new int[10][10];
		int i;
		int j;
		int s;
		int p;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			p = 0;
				a[i][0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				for (j = 1;j <= a[i][0];j++)
				{
				   a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
				if (a[i][0] != 0)
				{
					for (j = 1;j <= a[i][0];j++)
					{
				   p = a[i][j] + 3 * j;
				   if (p > 63)
				   {
						   p = a[i][j - 1] + 3 * j - 3;
						   if (p >= 60)
						   {
							   s = 3 - (p - 60) + 3 * (j - 2);
						   }
						   else
						   {
							   s = 3 * (j - 1);
						   }
					   break;
				   }
				   else
				   {
					   if (p >= 60)
					   {
						   s = 3 - (p - 60) + 3 * (j - 1);
					   }
					   else
					   {
					   s = 3 * j;
					   }
				   }
					}
				   m = 60 - s;
				   System.out.print(m);
				   System.out.print("\n");
				}
			   else
			   {
				  System.out.print("60");
				  System.out.print("\n");
			   }
		}
		return 0;
	}

}

