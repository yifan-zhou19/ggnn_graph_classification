package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] a = new int[100][100];
		int[] p = a[0];
		for (p = a[0];p < a[0] + n * m;p++)
		{
			p[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		if (n == 1 || m == 1)
		{
		   for (int k = 0;k < n * m - 1;k++) //????????????????????n+m-1
		   {
				   for (int i = 0;i < n;i++) //??????????
				   {
				for (p = a[0] + m * i;p < a[0] + m * (i + 1);p++)
				{
					   if (((i + p - a[0] - m * i) == k) && (p != a[0] + n * m - 1))
					   {
							   System.out.print(p);
							   System.out.print("\n");
					   }
				}
				   }
		   }
		   System.out.print((a[0] + n * m - 1));
		}
		else
		{
		for (int k = 0;k < n * m - 2;k++) //???????????????????n+m-2
		{
		  for (int i = 0;i < n;i++)
		  {
				for (p = a[0] + m * i;p < a[0] + m * (i + 1);p++)
				{
					   if (((i + p - a[0] - m * i) == k) && (p != a[0] + n * m - 1))
					   {
							   System.out.print(p);
							   System.out.print("\n");
					   }
				}
		  }
		}
		//for(p=a[0]+m*(n-1);p<a[0]+m*n-1;p++) cout<<*p<<endl;
		System.out.print((a[0] + m * n - 1));
		}

		return 0;
	}

}

