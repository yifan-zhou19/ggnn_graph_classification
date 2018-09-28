package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int m;
		int s;
		int t;
	 int[] a = new int[100];
	 int[] b = new int[100];
	 int[] c = new int[100];
	 for (i = 0;i < 100;i++)
	 {
	 c[i] = 0;
	 }
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
		 a[i] = Integer.parseInt(tempVar2);
	 }
	 String tempVar3 = ConsoleInput.scanfRead();
	 if (tempVar3 != null)
	 {
		 b[i] = Integer.parseInt(tempVar3);
	 }
	 if (a[i] >= 90 && a[i] <= 140 && b[i] >= 60 && b[i] <= 90)
	 {
	 a[i] = 1;
	 }
	 else
	 {
	 a[i] = 0;
	 }
	 }
	 m = 0;
	 s = 0;
	 for (i = 0;i < n;i++)
	 {
	 if (a[i] == 1)
	 {
	 s = s + 1;
	 c[m] = s;
	 }
	 if (a[i] == 0)
	 {
	 m = m + 1;
	 s = 0;
	 }
	 }
	 t = c[0];
	 for (i = 0;i < n;i++)
	 {
	 if (c[i] > t)
	 {
	 t = c[i];
	 }
	 }
	 System.out.printf("%d",t);
	 return 0;
	}

}

