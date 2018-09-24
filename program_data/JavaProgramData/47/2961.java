package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int[] a = new int[100];
		 int[] b = new int[100];
		 int i;
		 int n;
		 int k;
		 int t;
		 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 for (i = 0;i <= n - 1;i++)
		 {
			 a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 }
		 k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 System.out.print(a[n - 1]);
		 for (i = 1;i <= n - 1;i++)
		 {
			 b[i] = a[n - i - 1];
			 System.out.print(" ");
			 System.out.print(b[i]);
		 }
		 return 0;
	}
}

