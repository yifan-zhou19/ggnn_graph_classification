package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int j;
		int[] sum = new int[10001];
		int l = 0;
		int[] be = new int[50000];
		int[] fi = new int[50000];
		int o;
		int p;
		int d;
		int e;
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
					 be[i] = Integer.parseInt(tempVar2);
				 }
				 String tempVar3 = ConsoleInput.scanfRead();
				 if (tempVar3 != null)
				 {
					 fi[i] = Integer.parseInt(tempVar3);
				 }
			}
			 o = be[0];
			 p = fi[0];
		   for (i = 0;i < n;i++)
		   {
				 d = be[i];
				 e = fi[i];
				 for (;d < e;d++)
				 {
					sum[d] = 1;
				 }
				 if (be[i] < o)
				 {
					 o = be[i];
				 }
				 if (fi[i] > p)
				 {
					 p = fi[i];
				 }
		   }
		  for (i = o;i < p;i++)
		  {
			  if (sum[i] == 0)
			  {
				  System.out.print("no");
				  return 0;
			  }
		  }
		  System.out.printf("%d %d",o,p);
		return 0;
	}
}

