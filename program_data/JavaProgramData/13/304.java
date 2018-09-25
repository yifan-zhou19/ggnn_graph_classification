package <missing>;

public class GlobalMembers
{
	/*??????
	 * ??????????? 
	 */
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[20000];
		int i;
		int t;
		int k = 0;
		int h;
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n;i++)
		{
			for (t = i + 1;t < n - k;t++)
			{
			if (a[i] == a[t])
			{
				for (h = t;h < n - k - 1;h++)
				{
				a[h] = a[h + 1];
				}
				k++;
				t--;
			} //??????
			}
		}
			for (i = 0;i < n - k - 1;i++)
			{
			System.out.print(a[i]);
			System.out.print(' ');
			}
			System.out.print(a[n - k - 1]);
		return 0;
	}


}

