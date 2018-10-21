package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int i;
	 int j;
	 int n;
	 int[] a = new int[1000];
	 int m;
	 a[1] = 1;
	 a[2] = 1;
	 for (i = 3;i < 30;i++)
	 {
	 a[i] = a[i - 1] + a[i - 2];
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
		 m = Integer.parseInt(tempVar2);
	 }
	 System.out.printf("%d\n",a[m]);
	 }
	}

}

