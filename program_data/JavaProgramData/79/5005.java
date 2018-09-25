package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int m;
	 int i;
	 int j;
	 int k;
	 int[] a = new int[350];
	 while (true)
	 {
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
	  if (n == 0 && m == 0)
	  {
		  break;
	  }
	  else
	  {
	   for (i = 0;i < n;i++)
	   {
	   a[i] = 0;
	   }
	   i = 0;
	   k = 0;
	   for (j = 0;j < n;j++)
	   {
		 if (a[j] == 0)
		 {
			 k++;
		 }
		 if (k == m)
		 {
		  a[j] = 1;
		  k = 0;
		  i++;
		 }
		 if (i == n - 1)
		 {
			 break;
		 }
		 if (j == n - 1)
		 {
			 j = -1;
		 }
	   }
	   for (i = 0;i < n;i++)
	   {
		if (a[i] == 0)
		{
		System.out.printf("%d\n",i + 1);
		}
	   }
	  }
	 }
	}
}

