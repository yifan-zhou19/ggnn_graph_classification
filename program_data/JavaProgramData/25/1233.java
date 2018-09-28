package <missing>;

public class GlobalMembers
{
	//********************************
	//*???2?n??
	//*??? ?? 1300012814  **
	//*???2013.11,14  **
	//********************************
	public static int Main()
	{
		int n;
		int[] a = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1; i <= n;i++)
		{
		for (int j = 0;j < 100;j++)
		{
		a[j] = 2 * a[j];
		}
		for (int j = 0; j < 100;j++)
		{
		if (a[j] >= 10)
		{
		a[j + 1]++;
		a[j] = a[j] % 10;
		}
		}
		}
		int j = 99;
		while (a[j] == 0)
		{
			j--;
		}
		for (;j >= 0;j--)
		{
		System.out.print(a[j]);
		}

		return 0;
	}
}

