package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[200];
	 int n;
	 int m;
	 int i;
	 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 for (i = 0;i < n;i++)
	 {
		 a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 }
	 for (i = n - 1;i >= 0;i--)
	 {
		 a[i + m] = a[i];
	 }
	 for (i = n + m - 1;i > n - 1;i--)
	 {
		 a[i - n] = a[i];
	 }
	 System.out.print(a[0]);
	 for (i = 1;i < n;i++)
	 {
		 System.out.print(' ');
		 System.out.print(a[i]);
	 }
	  return 0;
	}
}

