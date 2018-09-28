package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int n;
		 int a;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 int[] sz = new int[N];
		 for (int k = 0;k < n;k++)
		 {
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 sz[k] = Integer.parseInt(tempVar2);
			 }
		 }
		 for (int j = 1;j < n;j++)
		 {
			  for (int i = 0;i < n - j;i++)
			  {
				   if (sz[i] > sz[i + 1])
				   {
					a = sz[i + 1];
					sz[i + 1] = sz[i];
					sz[i] = a;
				   }
			  }
		 }
		 for (int e = 0;e < n;e++)
		 {
			 if (sz[e] % 2 != 0)
			 {
				 if (e == n - 1 || e == n - 2)
				 {
					 System.out.printf("%d",sz[e]);
				 }
				 else
				 {
				   System.out.printf("%d,",sz[e]);
				 }
			 }
		 }
		 return 0;
	}

}

