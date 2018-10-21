package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n = 0;
	 int b = 0;
	 int m = 0;
	 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 int[] a = new int[n];
	 for (int p = 0;p < n;++p)
	 {
		 a[p] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 }
	 b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 for (int ii = 0;ii < n;++ii)
	 {
	 if (a[ii] == b)
	 {
		 m++;
	 }
	 }
	 for (int i = 0;i < n;++i)
	 {
		 if (a[i] == b)
		 {
			 for (int b = i;b < n;b++)
			 {
				 a[b] = a[b + 1];
			 }
			 i--;
		 }
	 }
	 for (int o = 0;o < n - m - 1;o++)
	 {
	   System.out.print(a[o]);
	   System.out.print(" ");
	 }
	 System.out.print(a[n - m - 1]);
	 return 0;
	}
}

