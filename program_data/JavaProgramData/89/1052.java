package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int i;
		  int t;
		  int j;
		  int sum;
		  int Flag1;
		  int Flag2;
		  Flag2 = 0;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  int[] a = new int[100000];
		  if (n == 1)
		  {
		  System.out.print("0");
		  }
		  else
		  {
			  for (i = 0;;i = i + 2)
			  {
				 String tempVar2 = ConsoleInput.scanfRead();
				 if (tempVar2 != null)
				 {
					 a[i] = Integer.parseInt(tempVar2);
				 }
				 String tempVar3 = ConsoleInput.scanfRead(" ");
				 if (tempVar3 != null)
				 {
					 a[i + 1] = Integer.parseInt(tempVar3);
				 }
				 if (a[i] == 0 && a[i + 1] == 0)
				 {
									 t = i + 1;
									 break;

				 }
			  }
			  //for(i=0;i<=t;i++)
		//  printf("%d",a[i]);
			for (i = 0;i < n;i++)
			{
							Flag1 = 0;

						  for (j = 0;j <= t - 2;j = j + 2)
						  {
											   if (a[j] == i)
											   {
											 //printf("%d %d\n",a[j],i);  
											 Flag1 = 1;
											   }



						  }
							   //printf("%d",Flag1);
						  if (Flag1 == 1)
						  {
							   continue;
						  }
						  sum = 0;
						  for (j = 1;j <= t - 2;j = j + 2)
						  {
											   if (a[j] == i)
											   {
											   sum++;
											   }
						  }
										  if (sum >= n - 1)
										  {
										  System.out.printf("%d",i);
										  Flag2 = 1;
										  break;
										  }
			}
							  if (Flag2 == 0)
							  {
							  System.out.print("Not Found");
							  }

		  }
	}

}

