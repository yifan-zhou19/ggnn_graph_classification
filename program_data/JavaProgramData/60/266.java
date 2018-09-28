package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int m;
		  int i;
		  int j;
		  int k = 0;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  for (i = 3;i <= n - 2;i++)
		  {
						  m = Math.sqrt(i + 2);
						  for (j = 2;j <= m;j++)
						  {
										   if (i % j == 0 || (i + 2) % j == 0)
										   {
										   break;
										   }
						  }
						  if (j > m)
						  {
								 System.out.printf("%d %d\n",i,i + 2);
								 k++;
						  }
		  }
		  if (k == 0)
		  {
		  System.out.print("empty");
		  }
		  System.in.read();
		  System.in.read();
	}
}

