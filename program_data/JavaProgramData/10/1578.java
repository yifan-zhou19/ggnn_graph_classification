package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int n;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 int[] p = new int[n];
		 int[] q = new int[n];
		 q[n - 1] = 1;
		 int best = q[n - 1];
		 for (int i = 0;i < n;i++)
		 {
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 p[i] = Integer.parseInt(tempVar2);
			 }
		 }
		 for (int i = n - 2;i >= 0;i--)
		 {
			  int a = 0;
			  for (int k = n - 1;k > i;k--)
			  {
				   if (p[i] >= p[k] != 0 && q[k] >= a)
				   {
					   a = q[k];
				   }
			  }
			  q[i] = a + 1;
			  if (q[i] > best)
			  {
				  best = q[i];
			  }
		 }
		 System.out.printf("%d\n",best);
	}

}

