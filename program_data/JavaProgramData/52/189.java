package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int m;
	  int s;
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
	  int[] a = new int[n];
	  int i;
	  int j;
	  int k;
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  a[0] = Integer.parseInt(tempVar3);
	  }
	  for (i = 1;i < n;i++)
	  {
	   String tempVar4 = ConsoleInput.scanfRead(" ");
	   if (tempVar4 != null)
	   {
		   a[i] = Integer.parseInt(tempVar4);
	   }
	  }
	  scanf("\n");
	  for (j = 1;j <= m;j++)
	  {
		s = a[n - 1];
		for (k = n - 2;k >= 0;k--)
		{
		  a[k + 1] = a[k];
		}
		a[0] = s;
	  }
	  System.out.printf("%d",a[0]);
	  for (i = 1;i < n;i++)
	  {
		  System.out.printf(" %d",a[i]);
	  }
	return 0;
	}
}

