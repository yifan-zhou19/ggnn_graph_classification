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
	  int g;
	  int t;
	  int v = 0;
	  int[] a = new int[555];
	  int[] b = new int[555];
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
	  if (a[i] % 2 != 0)
	  {
	   b[i] = a[i];
	  }
	  else
	  {
	   b[i] = 0;
	  }
	  }
	  for (j = 0;j < n;j++)
	  {
		  t = 0;
	  for (k = n - 1;k > j;k--)
	  {
	  if (b[k] > b[k - 1])
	  {
		  t = b[k - 1];
	  b[k - 1] = b[k];
	  b[k] = t;
	  }
	  }

	  }
	 for (g = n;g >= 0;g--)
	 {
	 if (b[g] > 0)
	 {
		 if (v == 1)
		 {
		 System.out.print(",");
		 }
	   System.out.printf("%d",b[g]);
	   v = 1;

	 }
	 }
	 return 0;
	}

}

