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
				for (i = 0;;i++)
				{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
				  l1:
				  {
		if (y == k)
		{
	break;
		}
				  }
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
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
							  goto l1;
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

