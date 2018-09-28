package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int i;
	 int j;
	 int k;
	 int t;
	 int n;
	 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 int[] a = new int[n];
	 for (i = 0;i < n;i++)
	 {
		 a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 }
	 k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 for (i = 0;i < n;i++)
	 {
		 if (a[i] == k)
		 {
			 for (j = i;j < n - 1;j++)
			 {
			 a[j] = a[j + 1];
			 }
		 n--;
		 i--;
		 }
	 }
	 System.out.print(a[0]);
	 for (t = 1;t < n;t++)
	 {
		 System.out.print(" ");
		 System.out.print(a[t]);
	 }
	return 0;
	}


}

