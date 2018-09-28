package <missing>;

public class GlobalMembers
{
	public static void f1(int[] a, int[] b, int m, int n)
	{
	int i;
	for (i = 0;i < m;i++)
	{
	a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	}
	for (i = 0;i < n;i++)
	{
	b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	}
	}
	public static void f2(int[] a, int[] b, int m, int n)
	{
	int i;
	int j;
	int t;
		 for (i = 0;i < m;i++)
		 {
			 for (j = 0;j < m - 1;j++)
			 {
			 if (a[j + 1] < a[j])
			 {
			  t = a[j];
		  a[j] = a[j + 1];
		  a[j + 1] = t;
			 }
			 }
		 }
		 for (i = 0;i < n;i++)
		 {
			 for (j = 0;j < n - 1;j++)
			 {
			 if (b[j + 1] < b[j])
			 {
			  t = b[j];
		  b[j] = b[j + 1];
		  b[j + 1] = t;
			 }
			 }
		 }
	}
	public static void f3(int[] a, int[] b, int m, int n)
	{
		int i;
		int j;
	for (i = 0;i < n;i++)
	{
		a[m + i] = b[i];
	}
	}
	public static void f4(int[] a, int m, int n)
	{
		int i;
		 for (i = 0;i < m + n - 1;i++)
		 {
		System.out.print(a[i]);
		System.out.print(" ");
		 }
	System.out.print(a[m + n - 1]);

	}
	public static int Main()
	{
		int m;
		int n;
	m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	int[] a = new int[1000];
	int[] b = new int[1000];

	f1(a, b, m, n);
	f2(a, b, m, n);
	f3(a, b, m, n);
	f4(a, m, n);
	return 0;



	}

}

