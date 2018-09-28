package <missing>;

public class GlobalMembers
{
	 public static int Main()
	 {
		 int n;
		 int t;
		 int m;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 int[] sz = new int[n];
		 for (int i = 1;i <= n;i++)
		 {
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 (sz[i]) = Integer.parseInt(tempVar2);
			 }
		 }
		 for (int i = n;i > 1;i--)
		 {
			 System.out.printf("%d ",sz[i]);
		 }
		 System.out.printf("%d",sz[1]);
		 return 0;
	 }
}

