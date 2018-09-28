package <missing>;

public class GlobalMembers
{
	//*************************
	//*???????????*
	//*??????   * 
	//*???11/10/28* 
	//*******************
	public static int Main()
	{
		int n;
		int k;
		int m = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n < 1 || n > 100000)
		{
			return 0;
		}
		int[] a = new int[n];
		for (int y = 0; y < n; y++)
		{
			a[y] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < n; i++)
		{
			if (a[i] == k)
			{
				for (int j = i; j < n; j++)
				{
					a[j] = a[j + 1];
				}
				i--;
				m++;
			}
		}
		System.out.print(a[0]);
		for (int x = 1; x < n - m; x++)
		{
		System.out.print(" ");
		System.out.print(a[x]);
		}
		System.out.print("\n");
		return 0;
	}
}

