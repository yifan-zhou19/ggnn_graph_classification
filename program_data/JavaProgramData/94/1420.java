package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int i;
	  int n;
	  int[] a = new int[10000];
	  int[] b = new int[1000];
	  int k;
	  int x;
	  int j;
	  j = 0;
	  k = 0;
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
	  for (i = 0;i < n;i++)
	  {
		  if (a[i] % 2 != 0)
		  {
		  b[k] = a[i];
		  k++;
		  }
	  else
	  {
	  k = k;
	  }
	  }
	  n = k;
	  while (j <= n)
	  {
		  for (i = 0;i < n - 1;i++)
		  {
			  if (b[i] <= b[i + 1])
			  {
			  b[i] = b[i];
			  b[i + 1] = b[i + 1];
			  }
			  else
			  {
			  x = b[i];
			  b[i] = b[i + 1];
			  b[i + 1] = x;
			  }
		  }
		  j++;
	  }

	   for (i = 0;i < n - 1;i++)
	   {
		   System.out.printf("%d,",b[i]);
	   }
	System.out.printf("%d",b[n - 1]);



	  return 0;

	}

}

