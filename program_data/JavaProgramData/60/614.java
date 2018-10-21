package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int i;
		  int j;
		  int a;
		  int b;
		  a = 1;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  for (i = 2;i <= n;i++)
		  {

						   int m = (int)Math.sqrt(i);
						   for (j = 2;j <= m;j++)
						   {
											  if (i % j == 0)
											  {
												  break;
											  }
						   }
						   if (j == m + 1)
						   {
									 if (i == a + 2)
									 {
											   System.out.printf("%d %d\n",a,i);
									 }
									 a = i;
						   }
		  }
		  if (a < 5)
		  {
				  System.out.print("empty");
		  }
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();


	}
}

