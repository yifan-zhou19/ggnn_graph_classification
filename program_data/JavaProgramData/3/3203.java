package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int[] sz = new int[N];
	 int n;
	 int k;
	 int i;
	 int p;
	 int sum;
	 int isbreak = 0;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 k = Integer.parseInt(tempVar2);
	 }
	 for (i = 0;i < n;i++)
	 {
		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 (sz[i]) = Integer.parseInt(tempVar3);
		 }
	 }
	 for (i = 0;i < n - 1;i++)
	 {
	   for (p = i + 1;p < n;p++)
	   {
		sum = sz[i] + sz[p];
		if (sum == k)
		{
		 isbreak = 1;
		 break;
		}
	   }
	   if (isbreak == 1)
	   {
		 break;
	   }
	 }
	 if (isbreak == 0)
	 {
	   System.out.print("no");
	 }
	 if (isbreak == 1)
	 {
	   System.out.print("yes");
	 }
	  return 0;
	}
}

