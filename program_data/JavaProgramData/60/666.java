package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int i;
		  int m;
		  int b;
		  int c;
		  int d;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  if (n == 1 || n == 2 || n == 3 || n == 4)
		  {
	   System.out.print("empty");
		  }
		  else
		  {
		  for (i = 2;i <= n - 2;i++)
		  {
						   m = (int)Math.sqrt(i);
						   c = (int)Math.sqrt(i + 2);
						 for (b = 2;b <= m;b++)
						 {
							 if (i % b == 0)
							 {
						  break;
							 }
						 }
						 for (d = 2;d <= c;d++)
						 {
							 if ((i + 2) % d == 0)
							 {
						  break;
							 }
						 }
						 if (b == m + 1 && d == c + 1)
						 {
						  System.out.printf("%d %d\n",i,i + 2);
						 }
		  }
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

