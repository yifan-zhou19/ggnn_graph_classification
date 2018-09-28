package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int[] u = new int[500];
	  int[] v = new int[500];
	  int i;
	  int n;
	  int j = 0;
	  int e;
	  int m = 0;
	  int k = 0;
	  int w = 0;
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
			 u[i] = Integer.parseInt(tempVar2);
		 }
		 if (u[i] % 2 != 0)
		 {
			 v[j] = u[i];
			 j++;
			 w = j;
		 }
	  }
	  for (k = w - 1;k >= 0;k--)
	  {
		  for (i = 0;i < k;i++)
		  {
			  if (v[i] > v[i + 1])
			  {
				e = v[i + 1];
				v[i + 1] = v[i];
				v[i] = e;
			  }
		  }
	  }
	  for (i = 0;i < w - 1;i++)
	  {
			  System.out.printf("%d,",v[i]);
	  }
	  System.out.printf("%d",v[w - 1]);
	  return 0;
	}

}

