package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int[] a = new int[300];
	  int n;
	  int m;
	  int x;
	  for (;;)
	  {
	  for (x = 0;x < 300;x++)
	  {
	   a[x] = 1;
	  }
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
	   if (n == 0)
	   {
		   break;
	   }
	   int i;
	   int t = 0;
	   int j = 0;
	   for (i = 0;i <= n - 1;)
	   {
	  if (a[i] != 0)
	  {
		  t++;
	  }
	  if (t == m)
	  {
		a[i] = 0;
	   t = 0;
	   j++;
	  }
	  if (i == n - 1)
	  {
		  i = 0;
	  }
	  else
	  {
		  i++;
	  }
	  if (j == n - 1)
	  {
		  break;
	  }
	   }
	  for (i = 0;i <= n - 1;i++)
	  {
	  if (a[i] != 0)
	  {
		  break;
	  }
	  }
	  System.out.printf("%d\n",i + 1);
	  }
	return 0;
	}
}

