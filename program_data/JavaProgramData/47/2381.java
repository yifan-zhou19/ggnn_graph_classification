package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			int x;
			x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a[i] = x;
		}
	   for (int i = n - 1;i > 0;i--)
	   {
	   System.out.print(a[i]);
	   System.out.print(" ");
	   }
	   System.out.print(a[0]);
	   return 0;
	}


}

