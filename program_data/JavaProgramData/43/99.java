package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int a;
		  int b;
		  int c;
		  int i;
		  int j;
		  int d;
		  int k;
		  b = 0;

		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  a = Integer.parseInt(tempVar);
		  }
		  if (a == 6)
		  {
		  System.out.print("3 3");
		  }
		  else
		  {
			  d = a / 2;
			  for (i = 3;i <= d;i++)
			  {
							   for (b = 0,j = 2;j < i;j++)
							   {
								   if (i % j == 0)
								   {
							   b = 1;
								   }
							   }

							   if (b == 0)
							   {
								   c = a - i;
									   for (k = 2;k < c;k++)
									   {
							   if (c % k == 0)
							   {
							   b = 1;
							   }
									   }
							   if (b == 0)
							   {
							   System.out.printf("%d %d\n",i,(a - i));
							   }
							   }

			  }
		  }
								 System.in.read();
								 System.in.read();
	}
}

