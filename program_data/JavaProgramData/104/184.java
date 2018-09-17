package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int m;
		  int n;
		  int i;
		  int j;
		  int y;
		  int k;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  m = Integer.parseInt(tempVar);
		  }
		  String tempVar2 = ConsoleInput.scanfRead(" ");
		  if (tempVar2 != null)
		  {
			  n = Integer.parseInt(tempVar2);
		  }
		  if (m == n)
		  {
			System.out.printf("%d",m);
		  }
		  else
		  {
			   if (m < n)
			   {
				 i = m;
				 m = n;
				 n = i;
			   }
			   y = m;
			   k = n;
				for (i = 0;i < 100;i++)
				{
					   y /= 2;
						if (y == k)
						{
						   System.out.printf("%d",y);
						   break;
						}
						else
						{
						 for (j = 0;k > 1;j++)
						 {
							k /= 2;
							  if (y == k)
							  {
					  System.out.printf("%d",y);
				 i = 100;
								  break;
							  }
						 }
						}
						  if (k == 1)
						  {
							  k = n;
						  }

				}
		  }
	}
}

