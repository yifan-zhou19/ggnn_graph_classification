package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int a;
		  int b;
		  int c;
		  int d;
		  int e;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  if (n < 5)
		  {
			  System.out.print("empty");
		  }
		  else
		  {
		   for (a = 5;a <= n;a += 2)
		   {
			  b = (int)Math.sqrt(a);
			  for (c = 3;c <= b;c++)
			  {
				if (a % c == 0)
				{
					break;
				}
			  }
			  if (c > b)
			  {
				  d = (int)Math.sqrt(a - 2);
				  for (e = 2;e <= d;e++)
				  {
					if ((a - 2) % e == 0)
					{
						break;
					}
				  }
				  if (e > d)
				  {
					 System.out.printf("%d %d\n",a - 2,a);
				  }
			  }
		   }
		  }
		  return 0;
	}

}

