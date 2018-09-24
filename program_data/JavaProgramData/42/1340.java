package <missing>;

public class GlobalMembers
{
	//********************************
	//*???????k?     **
	//*?????? 1200012839 **
	//*???2012.10.30   **
	//********************************

	public static int Main()
	{
		int n;
		int k;
		int c = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < n; i++)
		{
			while (a[i] == k)
			{
				for (int j = i; j < n; j++)
				{
					a[j] = a[j + 1];
				}
				c++;
			}
		}
		System.out.print(a[0]);
		for (int i = 1; i < n - c; i++)
		{
			System.out.print(" ");
			System.out.print(a[i]);
		}
		return 0;
	}
}

