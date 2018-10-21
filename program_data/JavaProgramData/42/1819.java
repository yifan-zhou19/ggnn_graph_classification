package <missing>;

public class GlobalMembers
{
	//********************************
	//*???2.???????? **
	//*?????? 1300017623 **
	//*???2013.10.30  **
	//********************************
	public static int Main()
	{
		int[] a = new int[100000];
		int n;
		int k;
		int e = 0;
		int d = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int j = 0; j < n; j++)
		{
			if (a[j] == k)
			{
				for (int p = j; p < (n - 1); p++)
				{
					a[p] = a[p + 1];
				}
				n--;
				j--;
			}
		}
			System.out.print(a[0]);
		for (int q = 1; q < n; q++)
		{
			System.out.print(" ");
			System.out.print(a[q]);
		}

		return 0;
	}
}

