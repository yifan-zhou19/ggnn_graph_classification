package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int m;
		int n;
		int p;
		k = 0;
		p = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 3;i < n - 1;i++)
		{
						  k = 0;
						  m = 0;
						  for (j = 2;j < i;j++)
						  {
										  if (i % j == 0)
										  {
													k++;
													//printf("%d-%d\n",i,j);
										  }
										  if ((i + 2) % j == 0)
										  {
														m++;
														//printf("%d->%d\n",i+2,j);
										  }
						  }
						  //printf("%d-%d",k,m);
						  if ((m == 0) && (k == 0))
						  {
										  p++;
										  //printf("[%d] ",p);
										  if (p == 1)
										  {
												  System.out.printf("%d %d",i,i + 2);
										  }
										  else
										  {
											  System.out.printf("\n%d %d",i,i + 2);
										  }
						  }
						  //printf(" [%d]\n",p);
		}
		if (p == 0)
		{
				System.out.print("empty");
		}
			return 0;
	}
}

