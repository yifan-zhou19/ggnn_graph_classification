package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int a;
	 int b;
	 int i;
	 int m;
	 int n;
	 int j;
	 int k = 0;
	 int t;
	 int[] g = new int[100];
	 int l;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 a = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead(" ");
	 if (tempVar2 != null)
	 {
		 b = Integer.parseInt(tempVar2);
	 }
	 for (i = a;i <= b;i++)
	 {
		 t = i;
		 m = 1;
		 n = 0;
	 while (t != 0)
	 {
		 m = t % 10;
		 t = t / 10;
		 n = n * 10 + m;
	 }
	 if (n == i)
	 {
		 for (j = 2;j < i / 2;j++)
		 {
		 if (i % j == 0)
		 {
			 break;
		 }
	 if (j == i / 2 - 1)
	 {
		 g[k] = i;
		 k = k + 1;
	 }
		 }
	 }
	 }
	 if (k == 0)
	 {
		 System.out.print("no");
	 }
	 else
	 {
		 System.out.printf("%d",g[0]);
	 }
	 for (l = 1;l < k;l++)
	 {
		 System.out.printf(",%d",g[l]);
	 }
	}
}

