package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		  int i;
		  int j;
		  int h;
		  int n;
		  int[] a = new int[100];
		  int[] b = new int[100];
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
		  for (j = 0;j < n;j++)
		  {
		   b[j] = a[n - 1 - j];
		  }
		  for (h = 0;h < n - 1;h++)
		  {
		   System.out.printf("%d ",b[h]);
		  }
		  System.out.printf("%d",b[n - 1]);
	}

}

