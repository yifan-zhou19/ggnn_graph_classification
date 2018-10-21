package <missing>;

public class GlobalMembers
{
	//********************************
	//*???2.cpp   **
	//*?????? 1200012768 **
	//*???2012.10.30 **
	//*???????????  **
	//********************************
	public static int Main()
	{
		int n;
		int m;
		int p;
		int count = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		p = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int j = 0; j < n;)
		{
			if (a[j] == p)
			{
				for (int k = j; k < n - 1; k++)
				{
					a[k] = a[k + 1];
				}
				count++;
				n--;
			}
			else
			{
				j++;
			}
		}
		for (int i = 0; i < n; i++)
		{
			System.out.print(a[i]);
			if (i < n - 1)
			{
				System.out.print(" ");
			}
			else
			{
				System.out.print("\n");
			}
		}
		return 0;
	}
}

