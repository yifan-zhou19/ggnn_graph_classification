package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[1000];
		int[] b = new int[1000];
		int i;
		int max = 0;
		int res = 0;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 1;i <= n;i++)
	{
		  a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		  b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   if (a[i] <= 140 && a[i] >= 90 && b[i] <= 90 && b[i] >= 60)
	   {
	   max = max + 1;
	   }
	   else
	   {
		   max = 0;
	   }
	   if (max > res)
	   {
		   res = max;
	   }
	}
	System.out.print(res);
	System.out.print("\n");
	return 0;
	}
}

