package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int[] a = new int[300];
		  int i;
		  int j;
		  int k;
		  int m;
		  int n;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  String tempVar2 = ConsoleInput.scanfRead(" ");
		  if (tempVar2 != null)
		  {
			  m = Integer.parseInt(tempVar2);
		  }
		  while (m + n != 0)
		  {
		   for (i = 1;i <= n;i++)
		   {
			  a[i] = i;
		   }
			  k = 1;
			  while (n > 1)
			  {
				  k = (k + m - 1) % n;
				  if (k == 0)
				  {
					  k = n;
				  }
				  for (i = k;i < n;i++)
				  {
					 a[i] = a[i + 1];
				  }
				  n--;
			  }
			  System.out.printf("%d\n",a[1]);
			  String tempVar3 = ConsoleInput.scanfRead();
			  if (tempVar3 != null)
			  {
				  n = Integer.parseInt(tempVar3);
			  }
			  String tempVar4 = ConsoleInput.scanfRead(" ");
			  if (tempVar4 != null)
			  {
				  m = Integer.parseInt(tempVar4);
			  }
		  }
	}

}

