package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int[] a = new int[1000];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
	 int p;
	 int i;
	 int j;
	 int n;
	 int m;
	 int k;
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
	 for (i = 0 ;i < n;i++)
	 {
	 String tempVar3 = ConsoleInput.scanfRead();
	 if (tempVar3 != null)
	 {
		 a[i] = Integer.parseInt(tempVar3);
	 }
	 }
	  p = a[0];
	  k = n - m % n;
	 while (m-- != 0)
	 {
		System.out.printf("%d ",*(p + n - m - 1));
	 }
	 for (j = 0;j < k - 1;j++)
	 {
		System.out.printf("%d ",*(p + j));
	 }
	  System.out.printf("%d",*(p + k - 1));

	}

}

