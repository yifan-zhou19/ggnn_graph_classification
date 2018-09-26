package <missing>;

public class GlobalMembers
{
	public static int m;
	public static int n;
	public static int[] a = new int[20];
	public static int[] b = new int[20];
	public static int[] c = new int[40];
	public static int i;
	public static int j;
	public static int k;
	public static int Main()
	{
		void qushu();
		void paixu();
		void hebing();
		void xianshi();
		qushu();
		paixu();
		hebing();
		xianshi();
	}
	public static void qushu()
	{
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 m = Integer.parseInt(tempVar);
		 }
		 String tempVar2 = ConsoleInput.scanfRead(" ");
		 if (tempVar2 != null)
		 {
			 n = Integer.parseInt(tempVar2);
		 }
		 for (i = 0;i < m;i++)
		 {
		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 a[i] = Integer.parseInt(tempVar3);
		 }
		 }
		 for (i = 0;i < n;i++)
		 {
		 String tempVar4 = ConsoleInput.scanfRead();
		 if (tempVar4 != null)
		 {
			 b[i] = Integer.parseInt(tempVar4);
		 }
		 }
	}
	public static void paixu()
	{
		 for (i = 0;i < m - 1;i++)
		 {
		 for (j = 0;j < m - 1;j++)
		 {
		  if (a[j] > a[j + 1])
		  {
		   k = a[j];
		   a[j] = a[j + 1];
		   a[j + 1] = k;
		  }
		 }
		 }
		 for (i = 0;i < n - 1;i++)
		 {
		 for (j = 0;j < n - 1;j++)
		 {
		  if (b[j] > b[j + 1])
		  {
		   k = b[j];
		   b[j] = b[j + 1];
		   b[j + 1] = k;
		  }
		 }
		 }
	}
	public static void hebing()
	{
		 for (i = 0;i < m;i++)
		 {
		 c[i] = a[i];
		 }
		 for (i = m;i < m + n;i++)
		 {
		 c[i] = b[i - m];
		 }
	}
	public static void xianshi()
	{
		 System.out.printf("%d",c[0]);
		 for (i = 1;i < m + n;i++)
		 {
		 System.out.printf(" %d",c[i]);
		 }
		 System.out.print("\n");
	}
}

