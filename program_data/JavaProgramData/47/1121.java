package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int m;
	 m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 final int n = m;
	 int[] a = new int[n + 1];
	 for (int i = n;i >= 1;i--)
	 {
		 a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 }
	 for (int i = 1;i < n;i++)
	 {
		 System.out.print(a[i]);
		 System.out.print(' ');
	 }
	 System.out.print(a[n]);
	 return 0;
	}

}

