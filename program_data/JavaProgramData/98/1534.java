package <missing>;

public class GlobalMembers
{
	//********************************
	//*???????   **
	//*?????? 1300012713 **
	//*???2013.12.11  **
	//********************************
	public static int Main()
	{
		int n;
		int m = 0;
		int[] b = new int[300];
		char[][] a = new char[300][40];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1; i <= n; i++)
		{
			a[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			b[i] = String.valueOf(a[i]).length();
		}
		for (int j = 1; j <= n; j++)
		{
			m = m + b[j] + 1;
			if (m <= 81)
			{
				System.out.print(a[j]);
				if (j < n && m + b[j + 1] < 81)
				{
					System.out.print(" ");
				}
			}
			else
			{
				m = 0;
				System.out.print("\n");
				j--;
			}
		}
		return 0;
	}
}

