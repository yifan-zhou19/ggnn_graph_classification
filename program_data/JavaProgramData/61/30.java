package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] f = new int[20];
		int[] a = new int[20];
		int i;
		f[0] = 1;
		f[1] = 1;
		for (i = 2;i <= 19;i++)
		{
		  f[i] = f[i - 1] + f[i - 2];
		}
		  n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		  for (i = 0;i <= n - 1;i++)
		  {
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		  }
		  for (i = 0;i <= n - 1;i++)
		  {
		System.out.print(f[a[i] - 1]);
		System.out.print("\n");
		  }
	  return 0;
	}
}

