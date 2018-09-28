package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[110];
	public static int Main()
	{
	 int n;
	 int i;
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
		   a[n - i] = Integer.parseInt(tempVar2);
	   }
	 }
	 for (i = 0;i < n - 1;i++)
	 {
	   System.out.printf("%d ",a[i]);
	 }
	 System.out.printf("%d",a[n - 1]);

	return 0;
	}
}

