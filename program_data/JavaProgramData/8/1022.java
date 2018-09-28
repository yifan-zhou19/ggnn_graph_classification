package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int i;
	 int j;
	 int k;
	 int m;
	 int n;
	 int t = 0;
	 int[] a;
	 int[] b;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead(" ");
	 if (tempVar2 != null)
	 {
		 m = Integer.parseInt(tempVar2);
	 }
	 a = new int[n];
	 b = new int[m];
	 for (i = 0;i < n;i++)
	 {
	 String tempVar3 = ConsoleInput.scanfRead();
	 if (tempVar3 != null)
	 {
		 a[i] = Integer.parseInt(tempVar3);
	 }
	 }
	 for (i = 0;i < m;i++)
	 {
	 String tempVar4 = ConsoleInput.scanfRead();
	 if (tempVar4 != null)
	 {
		 b[i] = Integer.parseInt(tempVar4);
	 }
	 }
	 for (i = 0;i < n;i++)
	 {
	 for (j = 0;j < n - i - 1;j++)
	 {
	 if (a[j] > a[j + 1])
	 {
					 t = a[j + 1];
					 a[j + 1] = a[j];
					 a[j] = t;
	 }
	 }
	 }
					 System.out.printf("%d",a[0]);
					 for (i = 1;i < n;i++)
					 {
					 System.out.printf(" %d",a[i]);
					 }
					 for (i = 0;i < m;i++)
					 {
					 for (j = 0;j < m - i - 1;j++)
					 {
					 if (b[j] > b[j + 1])
					 {
					 t = b[j + 1];
					 b[j + 1] = b[j];
					 b[j] = t;
					 }
					 }
					 }
					 for (i = 0;i < m;i++)
					 {
					 System.out.printf(" %d",b[i]);
					 }
	}
}

