package <missing>;

public class GlobalMembers
{
	//********************************
	//*???????????   **
	//*?????? 1200012988 **
	//*???2012.10.30  **
	//********************************


	public static int Main()
	{
		int n;
		int k;
		int j = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (j < n)
		{
			if (a[j] == k)
			{

				for (int m = j; m < n; m++)
				{
					a[m] = a[m + 1];
				}
				n--;
			}
			if (a[j] == k)
			{
				j--;
			}
			j++;
		}
		for (int l = 0; l < n; l++)
		{
			if (l < n - 1)
			{
				System.out.print(a[l]);
				System.out.print(" ");
			}
			else
			{
				System.out.print(a[l]);
			}
		}

		return 0;
	}

}

