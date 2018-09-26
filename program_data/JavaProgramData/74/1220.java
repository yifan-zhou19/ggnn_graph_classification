package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int m;
	   int i;
	   int n;
	   int j;
	   int a = 0;
	   int k;
	   int p;
	   int q;
	   int r = 0;
	   int x = 0;
	   int[] b = new int[5000];
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
	   for (i = m;i <= n;i++)
	   {
						if (i >= 0 && i <= 9)
						{
									  r++;
									 if (r == 1)
									 {
										 x++;
									  System.out.printf("%d",i);
									 }
									else
									{
										x++;
									  System.out.printf(",%d",i);
									}
						}
						q = 0;
						for (j = 2;j <= i / 2;j++)
						{
						if (i % j == 0)
						{
						  a = 0;
						  break;
						}
						else
						{
						  a++;
						}
						}
						if (a != 0)
						{
							k = 10;
							for (j = 1;;j++)
							{
							  b[0] = 0;
							  b[j] = (i % k - b[j - 1] * (k / 100)) / (k / 10);
							  if (i % k == i)
							  {
								break;
							  }
							  else
							  {
								k = k * 10;
							  }
							}
							for (p = 1;p <= j / 2;p++)
							{
							  if (b[p] != b[j - p + 1])
							  {
											  q++;
											  break;
							  }
							}
							if (q == 0)
							{
									r++;
									if (r == 1)
									{
										x++;
									  System.out.printf("%d",i);
									}
									else
									{
										x++;
									  System.out.printf(",%d",i);
									}
							}


						}

	   }
	   if (x == 0)
	   {
	   System.out.print("no\n");
	   }

	}

}

