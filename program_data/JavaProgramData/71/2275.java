package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int y;
		int m1;
		int m2;
		int i;
		int j;
		int t;
		int s1;
		int s2;
		int[] a = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] b = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 if (m1 < m2)
		 {
			 if (y % 4 != 0 || (y % 100 == 0 && y % 400 != 0))
			 {
				for (s1 = 1,j = 0;j <= m1 - 1;j++)
				{
					s1 = s1 + b[j];
				}
			  for (s2 = 1,j = 0;j <= m2 - 1;j++)
			  {
				  s2 = s2 + b[j];
			  }
			 }
		   else
		   {
			   for (s1 = 1,j = 0;j <= m1 - 1;j++)
			   {
				   s1 = s1 + a[j];
			   }
			 for (s2 = 1,j = 0;j <= m2 - 1;j++)
			 {
				 s2 = s2 + a[j];
			 }
		   }
		 }
		 else
		 {
			 if (y % 4 != 0 || (y % 100 == 0 && y % 400 != 0))
			 {
				for (s1 = 1,j = 0;j <= m2 - 1;j++)
				{
					s1 = s1 + b[j];
				}
			  for (s2 = 1,j = 0;j <= m1 - 1;j++)
			  {
				  s2 = s2 + b[j];
			  }
			 }
		   else
		   {
			   for (s1 = 1,j = 0;j <= m2 - 1;j++)
			   {
				   s1 = s1 + a[j];
			   }
			 for (s2 = 1,j = 0;j <= m1 - 1;j++)
			 {
				 s2 = s2 + a[j];
			 }
		   }
		 }
		 if ((s2 - s1) % 7 == 0)
		 {
			 System.out.print("YES");
			 System.out.print('\n');
		 }
		 else
		 {
			 System.out.print("NO");
			 System.out.print('\n');
		 }
		}
		return 0;
	}
}

