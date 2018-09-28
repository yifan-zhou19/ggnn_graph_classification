package <missing>;

public class GlobalMembers
{
	//********************************
	//*????????    **
	//*?????? 1300012855 **
	//*???2013.11.13  **
	//********************************

	public static int Main()
	{
		int n; // ???
		String ac = new String(new char[101]); // ??????
		String bc = new String(new char[101]);
		int[] a = new int[101]; // ??????
		int[] b = new int[101];
		int al; // ???????
		int bl;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1; i <= n ; i++)
		{
			ac = ConsoleInput.readToWhiteSpace(true).charAt(0);
			bc = ConsoleInput.readToWhiteSpace(true).charAt(0);
			al = ac.length();
			bl = bc.length();
			for (int j = al - 1; j >= 0; j--) // ????
			{
				a[j] = ac.charAt(al - j - 1) - '0';
			}
			for (int j = bl - 1; j >= 0; j--) // ????
			{
				b[j] = bc.charAt(bl - j - 1) - '0';
			}
			for (int j = 0; j < bl; j++) // ???
			{
				a[j] -= b[j]; // ??
				if (a[j] < 0) // ?????????
				{
					a[j] += 10;
					a[j + 1]--;
				}
			}
			int x;
			for (x = al - 1; a[x] == 0; x--)
			{
				; // ???????
			}
			for (; x >= 0; x--)
			{
				System.out.print(a[x]);
			}
			System.out.print("\n");
		}
		return 0;
	}

}

