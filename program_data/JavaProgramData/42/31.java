package <missing>;

public class GlobalMembers
{
	//***************************************************
	//*******      ??5_5???????.cpp      *******
	//*******      ???1000012895               *******
	//*******      ??????                   *******
	//*******      ???2010/10/27               *******
	//***************************************************
	public static int Main()
	{
		int n;
		int[] a = new int[100000];
		int k;
		int i;
		int r;
		int t = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = n - 1; i >= 0; i--)
		{
			if (a[i] == k)
			{
				t++;
				for (r = i; r < n - 1; ++r)
				{
					a[r] = a[r + 1];
				}
			}
		}
			for (i = 0; i < n - t - 1; ++i)
			{
				System.out.print(a[i]);
				System.out.print(' ');
			}
				System.out.print(a[n - t - 1]);
		return 0;
	}

}

