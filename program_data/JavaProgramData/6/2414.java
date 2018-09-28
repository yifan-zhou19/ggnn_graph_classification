package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int[] a = new int[10000];
	 int i;
	 int j;
	 int m;
	 int n;
	 int k;
	 int max;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	 int * pa;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 k = Integer.parseInt(tempVar);
	 }
	 for (i = 1;i <= k;i++)
	 {
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 m = Integer.parseInt(tempVar2);
	 }
	 String tempVar3 = ConsoleInput.scanfRead(" ");
	 if (tempVar3 != null)
	 {
		 n = Integer.parseInt(tempVar3);
	 }
	 for (j = 1;j <= m * n;j++)
	 {
	 String tempVar4 = ConsoleInput.scanfRead();
	 if (tempVar4 != null)
	 {
		 a[j - 1] = Integer.parseInt(tempVar4);
	 }
	 }
	 pa = a;
	 if ((m >= 2) && (n >= 2))
	 {
		 for (j = 1;j < n;j++)
		 {
			 *pa += a[j];
		 }
	 for (j = m * n - n;j < m * n;j++)
	 {
		 *pa += a[j];
	 }
	 for (j = n;j < m * n - n;j++)
	 {
	 if ((j % n == 0) || (j % n == n - 1))
	 {
		 *pa += a[j];
	 }
	 }
	 }
	 else
	 {
		 for (j = 1;j < m * n;j++)
		 {
			 *pa += a[j];
		 }
	 }
	 System.out.printf("%d\n",*pa);
	 }
	 return 0;
	}
}

