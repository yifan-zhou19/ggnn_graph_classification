package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  int[] a = new int[100000];
		  int[] b = new int[100000];
		  int i;
		  int count = 0;
		  for (i = 0;i < 10000000;i++)
		  {
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  a[i] = Integer.parseInt(tempVar2);
			  }
			  String tempVar3 = ConsoleInput.scanfRead(" ");
			  if (tempVar3 != null)
			  {
				  b[i] = Integer.parseInt(tempVar3);
			  }
			  if (a[i] == 0 && b[i] == 0)
			  {
								   break;
			  }
		  }
		  int k;
		  int j;
		  k = i - 1;
		  int count1;
		  int count2;
		  for (i = 0;i <= n - 1;i++)
		  {
			  count1 = 0;
			  count2 = 0;
			  for (j = 0;j <= k;j++)
			  {
				  if (b[j] == i)
				  {
							  count1++;
				  }
			  }
			  for (j = 0;j <= k;j++)
			  {
				  if (a[j] == i)
				  {
							  count2++;
				  }
			  }
			  if ((count1 == n - 1) && (count2 == 0))
			  {
										 System.out.printf("%d\n",i);
										 count++;
			  }
		  }
		  if (count == 0)
		  {
					   System.out.print("NOT FOUND\n");
		  }
	}

}

