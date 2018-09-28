package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  int n;
	  int i;
	  int j;
	  int k;
	  int m;
	  int sum = 0;
	  int[] a = new int[100000];
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 0;i < n;i++)
	  {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  a[i] = Integer.parseInt(tempVar2);
		  }
	  }
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  j = Integer.parseInt(tempVar3);
	  }
	  m = a[n - 1];
	  a[n - 1] += (a[n - 1] == j);
	  for (i = 0;i < n - sum;i++)
	  {
	   k = i;
	   if (a[i] == j)
	   {
		for (;i < n - sum - 1;i++)
		{
			a[i] = a[i + 1];
		}
		sum += 1;
		i = k - 1;
	   }
	  }
	  if (m == j)
	  {
	   for (i = 0;i < n - sum - 2;i++)
	   {
		   System.out.printf("%d ",a[i]);
	   }
	   System.out.printf("%d\n",a[n - sum - 2]);
	  }
	  else
	  {
	   for (i = 0;i < n - sum - 1;i++)
	   {
		   System.out.printf("%d ",a[i]);
	   }
	   System.out.printf("%d\n",a[n - sum - 1]);
	  }
	}

}

