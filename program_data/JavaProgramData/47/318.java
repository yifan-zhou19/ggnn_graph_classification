package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int[] a = new int[100];
	 int[] b = new int[100];
	 int n;
	 int i;
	 int j;
	 int f = 0;
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
		 b[n - i - 1] = a[i];
	 }
	 for (i = 0;i < n;i++)
	 {
		 if (f == 0)
		 {
			 System.out.printf("%d",b[i]);
			 f = 1;
		 }
		 else
		 {
			 System.out.printf(" %d",b[i]);
		 }
	 }
	 System.out.print("\n");
	 return 0;
	}

}

