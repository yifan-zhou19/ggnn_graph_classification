package <missing>;

public class GlobalMembers
{
	public static int m;
	public static int n;
	public static int[] a = new int[100];
	public static int[] b = new int[100];
	public static void getarr()
	{
	int i;
	m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 1;i <= m;i++)
	{
	  a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	}
	for (i = 1;i <= n;i++)
	{
	  b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	}
	}
	public static void sortarr()
	{
	int i;
	int j;
	int p;
	for (i = 1;i < m;i++)
	{
	  for (j = 1;j <= m - i;j++)
	  {
		 if (a[j] > a[j + 1])
		 {
			p = a[j];
			a[j] = a[j + 1];
			a[j + 1] = p;
		 }
	  }
	}
	for (i = 1;i < n;i++)
	{
	  for (j = 1;j <= n - i;j++)
	  {
		 if (b[j] > b[j + 1])
		 {
			p = b[j];
			b[j] = b[j + 1];
			b[j + 1] = p;
		 }
	  }
	}
	}
	public static void combarr()
	{
	int i;
	for (i = m + 1;i <= m + n;i++)
	{
		a[i] = b[i - m];
	}
	}
	public static void printarr()
	{
	int i;
	for (i = 1;i <= m + n - 1;i++)
	{
	   System.out.print(a[i]);
	   System.out.print(" ");
	}
	System.out.print(a[i]);
	}
	public static int Main()
	{
	getarr();
	sortarr();
	combarr();
	printarr();
	return 0;
	}
}

