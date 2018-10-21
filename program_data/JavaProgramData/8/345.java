package <missing>;

public class GlobalMembers
{
	public static void shuru(int[] a, int m)
	{
		int i;
	 for (i = 0;i < m;i++)
	 {
	  a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 }
	}
	public static void paixu(int[] b, int m)
	{
		int i;
		int j;
		int t;
	 for (i = 0;i < m - 1;i++)
	 {
		   for (j = 0;j < m - i - 1;j++)
		   {
			 if (b[j] > b[j + 1])
			 {
			   t = b[j];
			b[j] = b[j + 1];
			b[j + 1] = t;
			 }
		   }
	 }
	}
	public static void hebing(int[] a, int[] b, int m, int n)
	{
		 int i;
	   for (i = 0;i < m;i++)
	   {
		System.out.print(a[i]);
		System.out.print(" ");
	   }
	   for (i = 0;i < n - 1;i++)
	   {
		System.out.print(b[i]);
		System.out.print(" ");
	   }
	   System.out.print(b[n - 1]);
	}
	public static int Main()
	{
		int m;
		int n;
	 m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 int[] a = new int[m];
	 int[] b = new int[n];
	 shuru(a, m);
	 shuru(b, n);
	 paixu(a, m);
	 paixu(b, n);
	 hebing(a, b, m, n);
	 return 0;
	}

}

