package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
	  int[] a = new int[20000];
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 0;i <= (n - 1);i++)
	  {
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  a[i] = Integer.parseInt(tempVar2);
	  }
	  }
	  for (i = (n - 1);i >= 0;i--)
	  {
			 for (k = i - 1;k >= 0;k--)
			 {
		   if ((a[i] - a[k]) == 0)
		   {
		   a[i] = 0;
		   break;
		   }
			 }
	  }
	  if (a[0] > 9)
	  {
		  System.out.printf("%d",a[0]);
	  }
	   for (i = 1;i <= (n - 1);i++)
	   {
		  if (a[i] > 9)
		  {
	   System.out.printf(" %d",a[i]);
		  }
	   }
	}
}

