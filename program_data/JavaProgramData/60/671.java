package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int a;
		  int b;
		  int i;
		  int k;
		  int c;
		  int d;
		  d = 0;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  if (n > 4)
		  {
				  d = d + 1;
				  System.out.print("3 5\n");
		  }

		  for (a = 2;a <= n - 2;a++)
		  {
			  b = a / 2;
			  i = 2;
			  c = 0;
			  while (i <= b)
			  {
				   k = a % i;
				   if (k == 0)
				   {
							c++;
				   }
				   i++;
			  }
			  if (c == 0)
			  {
					   a = a + 2;
					   b = a / 2;
					   i = 2;
					   c = 0;
					   while (i <= b)
					   {
							k = a % i;
						  if (k == 0)
						  {
							c++;
						  }
						  i++;
					   }
						 if (c == 0)
						 {
								  d = d + 1;
								  System.out.printf("%d %d\n",a - 2,a);
						 }

			  }
		  }
		  if (d == 0)
		  {
				   System.out.print("empty");
		  }
		 System.in.read();
		 System.in.read();
		 System.in.read();
		 System.in.read();
		 System.in.read();
		 System.in.read();
		 System.in.read();
		 System.in.read();
	}




}

