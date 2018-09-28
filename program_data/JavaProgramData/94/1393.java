package <missing>;

public class GlobalMembers
{
	public static void bubble_sort(int[] a, int n)
	{
	 int i;
	 int k;
	 int t;
	 for (k = n - 1;k > 0;k--)
	 {
	  for (i = 0;i < k;i++)
	  {
	   if (a[i] > a[i + 1])
	   {
		t = a[i];
		a[i] = a[i + 1];
		a[i + 1] = t;
	   }
	  }
	 }
	}
	public static int Main()
	{
	 int Num;
	 int i;
	 int N = 0;
	 int j = 0;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 Num = Integer.parseInt(tempVar);
	 }
	 int[] a = new int[Num];
	 for (i = 0;i < Num;i++)
	 {
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  (a[i]) = Integer.parseInt(tempVar2);
	  }
	  if (a[i] % 2 == 1)
	  {
	   N++;
	  }
	 }
	 int[] b = new int[N];
	 for (i = 0;i < Num;i++)
	 {
	  if (a[i] % 2 == 1)
	  {
	   b[j] = a[i];
	   j++;
	  }
	 }
	 bubble_sort(b, N);
	 for (j = 0;j < N - 1;j++)
	 {
	  System.out.printf("%d,",b[j]);
	 }
	 j = N - 1;
	 System.out.printf("%d",b[j]);
	 return 0;
	}

}

