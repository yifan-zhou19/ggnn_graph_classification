package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int min;
	  int max;
	  int i;
	  int m;
	  int e;
	  int r;
	  int k;
	  int n;
	  int y;
	  int[] a = new int[10000];
	  int[] b = new int[10000];
	  min = 10000;
	  max = 0;
	  y = 0;
	  m = 0;
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
		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 b[i] = Integer.parseInt(tempVar3);
		 }

	  }
	  for (i = 0;i < n;i++)
	  {
		 if (a[i] < min)
		 {
		   min = a[i];
		 }
		 if (b[i] > max)
		 {
		   max = b[i];
		 }
	  }
	  for (k = 1;k <= n;k++)
	  {
	   for (i = 0;i < n - k;i++)
	   {
		 if (a[i] > a[i + 1])
		 {
		   e = a[i];
		   a[i] = a[i + 1];
		   a[i + 1] = e;
		   r = b[i];
		   b[i] = b[i + 1];
		   b[i + 1] = r;
		 }

	   }

	  }
	  for (i = 0;i < n - 1;i++)
	  {
		if (b[i] > m)
		{
			m = b[i];
		}
		if (a[i + 1] > m)
		{
		  System.out.print("no");
		  y = 1;
		  break;
		}
	  }
	  if (y == 0)
	  {
		System.out.printf("%d %d",min,max);
	  }







	  return 0;




	}

}

