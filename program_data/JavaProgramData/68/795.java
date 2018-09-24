package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int k;
		  int i;
		  int j;
		  int t;
		  int s;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  for (k = 6;k <= n;k++)
		  {
			 if (k % 2 == 0)
			 {
				 for (i = 3;i < k;i++)
				 {
					 t = 1;
					 if (i % 2 == 0)
					 {
						 t = 0;
					 }
					 else
					 {
					 for (j = 3;j <= Math.sqrt(i);j = j + 2)
					 {
						 if (i % j == 0)
						 {
							 t = 0;
							 break;
						 }
					 }
					 }
					 if (t != 0)
					 {
						  s = k - i;
						  if (s % 2 == 0)
						  {
							  t = 0;
						  }
						  else
						  {
						  for (j = 3;j <= Math.sqrt(s);j = j + 2)
						  {
							  if (s % j == 0)
							  {
								  t = 0;
								  break;
							  }
						  }
						  }
					 if (t != 0)
					 {
						 System.out.printf("%ld=%ld+%ld\n",k,i,s);
						 break;
					 }
					 }
				 }
			 }
		  }

	}

}

