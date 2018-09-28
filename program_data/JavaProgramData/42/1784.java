package <missing>;

public class GlobalMembers
{
	//********************************
	//*????2.cpp   **
	//*?????? 1300012966 **
	//*???2013.10.30  **
	//*??????????   **
	//********************************
	public static int Main()
	{
		int n;
		int[] a = new int[100001];
		int k;
		int i;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		j = 0;
		for (i = 1; i <= n; i++)
		{
			if (a[i] == k)
			{
			}
			else
			{
				if (j == 1)
				{
					System.out.print(" ");
					System.out.print(a[i]);
				}
				else
				{
					System.out.print(a[i]);
				}
				j = 1;
			}
		}
		return 0;
	}

}

