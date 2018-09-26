package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[400];
	public static int[] b = new int[200];
	public static int n;
	public static int m;
	public static void run1()
	{
		 int i;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 m = Integer.parseInt(tempVar2);
		 }
		 for (i = 1;i <= n;i++)
		 {
			 String tempVar3 = ConsoleInput.scanfRead();
			 if (tempVar3 != null)
			 {
				 a[i] = Integer.parseInt(tempVar3);
			 }
		 }
		 for (i = 1;i <= m;i++)
		 {
			 String tempVar4 = ConsoleInput.scanfRead();
			 if (tempVar4 != null)
			 {
				 b[i] = Integer.parseInt(tempVar4);
			 }
		 }
	}
	public static void sort(int[] a, int n)
	{
		 int i;
		 int j;
		 int x;
		 for (i = 1;i < n;i++)
		 {
			 for (j = i + 1;j <= n;j++)
			 {
				 if (a[i] > a[j])
				 {
					x = a[i];
					a[i] = a[j];
					a[j] = x;
				 }
			 }
		 }
	}
	public static void run2()
	{
		 sort(a, n);
		 sort(b, m);
	}
	public static void run3()
	{
		 int i;
		 for (i = 1;i <= m;i++)
		 {
			 a[i + n] = b[i];
		 }
	}
	public static void run4()
	{
		 int i;
		 for (i = 1;i < n + m;i++)
		 {
			 System.out.printf("%d ",a[i]);
		 }
		 System.out.printf("%d",a[n + m]);
	}
	public static int Main()
	{
		run1();
		run2();
		run3();
		run4();
	}

}

