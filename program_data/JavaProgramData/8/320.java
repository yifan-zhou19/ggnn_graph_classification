package <missing>;

public class GlobalMembers
{
	public static void car()
	{
		 int n;
		 int m;
		 int i = 0;
		 int[] a = new int[100];
		 int[] b = new int[100];
		 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 for (i = 0; i < n; i++)
		 {
			   a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 }
		 for (i = 0; i < m; i++)
		 {
			   b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 }
		 sort(a, a + n);
		 sort(b, b + m);
		 for (i = 0; i < n; i++)
		 {
			   System.out.print(a[i]);
			   System.out.print(" ");
		 }
		 for (i = 0; i < m - 1; i++)
		 {
			   System.out.print(b[i]);
			   System.out.print(" ");
		 }
		 System.out.print(b[i]);
		 return;
	}

	public static int Main()
	{
		car();
		return 0;
	}

}

