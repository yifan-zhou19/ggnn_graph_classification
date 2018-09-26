package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int i;
	 int[] a = new int[10000];
	 int n;
	 int m;
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
	 for (i = 0;i < n;i++)
	 {
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  a[i] = Integer.parseInt(tempVar3);
	  }
	 }
	 for (i = n - m;i < 2 * n - m - 1;i++)
	 {
	  System.out.printf("%d ",a[i % n]);
	 }
	 System.out.printf("%d",a[n - m - 1]);
	 System.in.read();
	 System.in.read();
	 return 0;
	}

}

