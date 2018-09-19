package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 int n;
	 int i;
	 int[] a = new int[20000];
	 int j;
	 int m = 0;
	 int k;
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
	 }
	 for (i = n - 1;i >= 0;i--)
	 {
		 for (k = i - 1;k >= 0;k--)
		 {
			 if (a[i] == a[k])
			 {
				 m++;
			  for (j = i;j <= n - m;j++)
			  {
			  a[j] = a[j + 1];
			  }
			 }
		 }
	 }
	System.out.printf("%d",a[0]);
			 for (i = 1;i < n - m;i++)
			 {
			 System.out.printf(" %d",a[i]);
			 }

	}
}

