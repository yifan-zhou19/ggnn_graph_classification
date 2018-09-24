package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int[] a = new int[200];
	 int n;
	 int m;
	 int i;
	 int j;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 m = Integer.parseInt(tempVar2);
	 }
	 for (i = 0;i < n;i++)
	 {
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  a[i] = Integer.parseInt(tempVar3);
	  }
	 }
	  for (i = 0;i < n - m;i++)
	  {
	 a[n + m + i] = a[i];
	  }
	for (i = n - m,j = 0;i < n;i++,j++)
	{

	  a[n + j] = a[i];

	}
	  for (i = n;i < (2 * n - 1);i++)
	  {
	  System.out.printf("%d ",a[i]);
	  }
	 System.out.printf("%d",a[2 * n - 1]);
	 return 0;
	}


}

