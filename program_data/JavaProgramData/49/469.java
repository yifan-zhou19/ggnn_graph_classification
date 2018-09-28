package <missing>;

public class GlobalMembers
{
	//*******************************************************
	//*11.11??  ????                                  *
	//*?????  ?? 1100012844                          *
	//*???2011?11?11?                                 *
	//*******************************************************
	public static void huiwen(String a) // ???huiwei??
	{
		int i; // n????????
		int j;
		int n;
		int sum;
		for (n = 2; n <= a.length(); n++) // n???2
		{

			// j????n????????????
			for (j = 0; j <= a.length() - n; j++)
			{
				sum = n + 2 * j - 1; // ??????????
				for (i = j; i <= j + n / 2; i++) // ???????
				{
					if (!a[i].equals(a[sum - i])) // ??????
					{
						break;
					}
				}

				// ???????????????n???????
				if (i == j + n / 2 + 1)
				{

					// ?????????
					for (i = j; i <= n + j - 1; i++)
					{
						System.out.print(a[i]);
					}
					System.out.print("\n");
				}
			}
		}
	}
	public static int Main()
	{
		String str = new String(new char[501]);
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		huiwen(str); // ????
		return 0;
	}
}

