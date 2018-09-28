package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int i;
		int j;
		int exict = 0;
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
	 int[] a = new int[n];
	 for (i = 1;i <= n;i++)
	 {
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a[i - 1] = Integer.parseInt(tempVar3);
		}
	 }
	 for (i = 1;i <= n;i++)
	 {
		 for (j = 1;j <= i - 1;j++)
		 {
			 if (a[i - 1] + a[j - 1] == k)
			 {
				 System.out.printf("%s","yes");
			  exict = 1;
			  break;
			 }
		 }
		 if (exict == 1)
		 {
			 break;
		 }
	 }
	 if (exict == 0)
	 {
		 System.out.printf("%s","no");
	 }
	}
}

