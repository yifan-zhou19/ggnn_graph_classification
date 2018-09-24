package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] v = new int[20000];
		int m = 0;
		int[] s = new int[20000];
		int p = 0;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 for (int i = 0;i <= n - 1;i++)
	 {
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   v[i] = Integer.parseInt(tempVar2);
	   }
	 }
	for (int j = 1;j <= n - 1;j++)
	{
	  for (int k = 0;k <= j - 1;k++)
	  {
		 if (v[j] != v[k])
		 {
			 p++;
		 }
	  }
	   if (p == j)
	   {
		   s[m] = v[j];
		   m++;
	   }
	   p = 0;
	}
	if (m == 0)
	{
		 System.out.printf("%d",v[0]);
	}
	else
	{
		System.out.printf("%d ",v[0]);
	}
	for (int k = 0;k <= m - 1;k++)
	{
	   if (k == m - 1)
	   {
		   System.out.printf("%d",s[k]);
	   }
	   else
	   {
		   System.out.printf("%d ",s[k]);
	   }
	}

	}

}

