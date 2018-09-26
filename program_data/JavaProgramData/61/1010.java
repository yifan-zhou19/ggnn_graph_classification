package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[20];
	int n;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	int[] f = new int[21];
	  f[1] = 1;
	  f[2] = 1;

		   for (int j = 3;j <= 20;j++)
		   {
			   f[j] = f[j - 1] + f[j - 2];
		   }
		   for (int i = 0;i < n;i++)
		   {
					  a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   }

		   for (int i = 0;i < n;i++)
		   {
	System.out.print(f[a[i]]);
	System.out.print("\n");
		   }
		return 0;

	}

}

