package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int m;
		int n;
		int p;
		int i;
		int j;

		for (a = 1;a <= 3;a++)
		{
		  for (b = 1;b <= 3;b++)
		  {
		   if (b == a)
		   {
		   continue;
		   }
		   else
		   {
			 for (c = 1;c <= 3;c++)
			 {
			  if (c == a || c == b)
			  {
				continue;
			  }
			  else
			  {
				 m = (a < b) + (a == c);
			  n = (a > b) + (a > c);
			  p = (c > b) + (b > a);
			  if (((a + m) == 3) && ((b + n) == 3) && ((c + p) == 3))
			  {
				 int[] u = {a, b, c};
				 int x;
			  char[] k = {'A', 'B', 'C'};
			  char y;
			  for (i = 0;i <= 2;i++)
			  {
			   for (j = 0;j <= 1;j++)
			   {
				if (u[j] > u[j + 1])
				{
					 x = u[j + 1],u[j + 1] = u[j],u[j] = x, y = k[j + 1],k[j + 1] = k[j],k[j] = y;
				}
				 else
				 {
					 continue;
				 }
			   }
			  }
			  System.out.print(k[0]);
			  System.out.print(k[1]);
			  System.out.print(k[2]);
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

		 return 0;
	}

}
