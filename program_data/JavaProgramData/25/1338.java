package <missing>;

public class GlobalMembers
{
	//********************************
	//*???5.cpp   **
	//*?????2?N??    **
	//*?????? 1300012838 **
	//*???2013.11.18  **
	//********************************

	public static int Main()
	{
		int[] a = new int[10000];
		int n;
		int len = 1;
		int up;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[1] = 1;
		for (int i = 1; i <= n; i++)
		{
			up = 0;
			for (int j = 1; j <= len; j++)
			{
				a[j] *= 2;
				a[j] += up;
				if (a[j] >= 10)
				{
					a[j] = a[j] - 10;
					up = 1;
				}
				else
				{
					up = 0;
				}
			}
			if (up == 1)
			{
				a[len + 1] = 1;
				len++;
			}
		}
		for (int i = len; i >= 1; i--)
		{
			System.out.print(a[i]);
		}
		System.out.print("\n");

		return 0;
	}
}

