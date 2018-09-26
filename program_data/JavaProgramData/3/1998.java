package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int[] a = new int[1000];
		  int i;
		  int j;
		  int n;
		  int k;
		  int l = 0;
		  int swap;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  k = Integer.parseInt(tempVar2);
		  }
		  for (i = 0;i < n;i++)
		  {
			  String tempVar3 = ConsoleInput.scanfRead();
			  if (tempVar3 != null)
			  {
				  a[i] = Integer.parseInt(tempVar3);
			  }
		  }
		  for (i = 0;i < n - 1;i++)
		  {
							for (j = i + 1;j < n;j++)
							{
											  if (a[i] + a[j] == k)
											  {
														   System.out.print("yes");
														   return 0;
											  }
							}
		  }
	/*      for(i=0;i<n-1;i++)
	      {
	          for(j=n-1;j>0;j--)
	          {
	              if(a[j]<a[j-1])
	              {
	                  swap = a[j];
	                  a[j] = a[j-1];
	                  a[j-1] = swap;
	              }
	          }                
	      }*/
		  System.out.print("no");

		  return 0;
	}

}

