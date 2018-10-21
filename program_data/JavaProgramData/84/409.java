package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int[] a = new int[32767];
		int max = 0;
		int secondmax = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

	 for (i = 1;i <= n;i++)
	 {
	  a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 }
	 for (i = 1;i <= n;i++)
	 {
	  if (a[i] > max)
	  {
	   max = a[i];
	  }
	 }
	 for (i = 1;i <= n;i++)
	 {
		 if (a[i] < max && a[i]> secondmax)
		 {
			 secondmax = a[i];
		 }
	 }

		System.out.print(max);
		System.out.print("\n");
		System.out.print(secondmax);
		System.out.print("\n");
		return 0;
	}
}

