package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int n;
		int d;
		int x;
		int e;
		int a1;
		int a2;
		int a3;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			a1 = Math.floor(n / 2);
			 for (i = 6;i <= n;i++)
			 {
			if (i % 2 == 0)
			{
			   for (j = 2;j <= a1;j++)
			   {
				 d = 0;
				 x = 0;
				 a2 = Math.floor(Math.sqrt(j));
				 if ((j > 2) && (j % 2 == 0))
				 {
					 d = 1;
				 }
				 else
				 {
					for (k = 2;k <= a2;k++)
					{
					   if (j % k == 0)
					   {
						   d = 1;
					   }
					}
				 }
							 x = i - j;
							 a3 = Math.floor(Math.sqrt(x));
							 if (d == 0)
							 {
							 if ((x > 2) && (x % 2 == 0))
							 {
								 d = 1;
							 }
							 else
							 {
							 for (k = 2;k <= a3;k++)
							 {
							   if (x % k == 0)
							   {
								   d = 1;
							   }
							 }
							 }
							 }
						   if (d == 0)
						   {
					  System.out.printf("%d=%d+%d\n",i,j,x);
						  break;

						   }
			   }
			}
			 }
			   return 0;
	}




}

