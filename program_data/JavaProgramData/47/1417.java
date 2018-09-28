package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int[] x = new int[100];
	  int[] y = new int[100];
	  int i;
	  int n;
	  int j;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 0,j = n - 1;i < n;i++,j--)
	  {
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   x[i] = Integer.parseInt(tempVar2);
		   }
		y[j] = x[i];
	  }
	  for (j = 0;j < n - 1;j++)
	  {
		   System.out.printf("%d ",y[j]);
	  }
	   System.out.printf("%d",y[n - 1]);
	   return 0;
	}

}

