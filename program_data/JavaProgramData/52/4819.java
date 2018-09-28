package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int n;
		 int m;
		 int i;
		 int j;
		 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 int[] a = new int[n];
		 for (i = 0;i < n;i++)
		 {
			  a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 }
		 int[] p = a;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *q=&a[n-m];
		 int q = a[n - m];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		 int * t = null;
		 for (t = q;t < q + m;t++)
		 {
			 System.out.print(t);
			 System.out.print(' ');
		 }
		 for (t = p;t < p + n - m - 1;t++)
		 {
			 System.out.print(t);
			 System.out.print(' ');
		 }
		 System.out.print(t);
		 System.out.print("\n");
		 return 0;
	}
}

