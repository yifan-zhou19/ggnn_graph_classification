package <missing>;

public class GlobalMembers
{
	//********************************
	//*???????????   **
	//*????? 1300012707 **
	//*???2013.10.30  **
	//********************************
	public static int Main()
	{
		int[] a = new int[100001];
		int n;
		int num;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1; i <= n; i = i + 1)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1; i <= n; i = i + 1)
		{
			if (a[i] == num)
			{
				n = n - 1;
				for (int j = i; j <= n; j = j + 1)
				{
					a[j] = a[j + 1];
				}
				i = i - 1;
			}
		}
		for (int i = 1; i <= n - 1; i = i + 1)
		{
			System.out.print(a[i]);
			System.out.print(" ");
		}
		System.out.print(a[n]);
		System.out.print("\n");
		return 0;
	}
}

