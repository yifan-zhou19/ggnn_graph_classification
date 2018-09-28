package <missing>;

public class GlobalMembers
{
	//********************************
	//*???2.cpp   **
	//*???????????   **
	//*?????? 1300012838 **
	//*???2013.10.30  **
	//********************************

	public static int Main()
	{
		int[] num = new int[100000];
		int n;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < n; i++)
		{
			num[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int j = 0; j < n; j++)
		{
			if (num[j] == k)
			{
				for (int l = j + 1; l < n; l++)
				{
					num[l - 1] = num[l];
				}
				n--;
				j--;
			}
		}
		System.out.print(num[0]);
		for (int p = 1; p < n; p++)
		{
			System.out.print(" ");
			System.out.print(num[p]);
		}
		System.out.print("\n");

		return 0;
	}
}

