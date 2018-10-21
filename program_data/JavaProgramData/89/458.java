package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int i = 0;
	   int j = 0;
	   int k = -1;
	   int m = 0;
	   int n = 0;
	   int[] a = new int[60000];
	   int[] b = new int[60000];
	   int[] sum = new int[60000];
	   int[] num = new int[60000];
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   while (true)
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
			else
			{
				for (j = 0;j < n;j++)
				{
				   if (a[i] == j)
				   {
							  num[j] = -1;
							   break;
				   }
				}

				for (j = 0;j < n;j++)
				{
					if (b[i] == j)
					{
										sum[j]++;
										 break;
					}
				}

			}
			i++;
	   }
	  for (i = 0;i < n;i++)
	  {
	  if (num[i] != -1)
	  {
	 if (sum[i] == n - 1)
	 {
	System.out.printf("%d",i);
	  m = 1;
	 }
	  }
	  }

	  if (m != 1)
	  {
	  System.out.print("NOT FOUND");
	  }
	}

}

