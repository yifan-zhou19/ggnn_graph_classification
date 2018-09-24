package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int[] a = new int[21];
	 int i;
	 int n;
	 int[] b = new int[21];
	 a[1] = 1;
	 a[2] = 1;
	 for (i = 3;i <= 20;i++)
	 {
	  a[i] = a[i - 1] + a[i - 2];
	 }
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 for (i = 1;i <= n;i++)
	 {
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  b[i] = Integer.parseInt(tempVar2);
	  }
	 }
	 for (i = 1;i <= (n - 1);i++)
	 {
	  System.out.printf("%d\n",a[b[i]]);
	 }
	 System.out.printf("%d",a[b[n]]);
	}

}

