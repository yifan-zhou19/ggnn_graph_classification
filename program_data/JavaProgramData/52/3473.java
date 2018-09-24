package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int m;
		int[] a = new int[101];
	 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 for (i = 1;i <= n;i++)
	 {
	  a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 }
	 for (int i = 1;i <= m;i++)
	 {
		 int temp = a[n];
	  for (int k = n;k >= 2;k--)
	  {
		a[k] = a[k - 1];
	  }
	  a[1] = temp;
	 }
	 for (i = 1;i < n;i++)
	 {
	 System.out.print(a[i]);
	 System.out.print(' ');
	 }
	 System.out.print(a[i]);
	 return 0;
	}

}

