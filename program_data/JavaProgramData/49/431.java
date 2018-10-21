package <missing>;

public class GlobalMembers
{
	//***********************************************
	//*   ????                                  *
	//*   ??????                              *
	//*   ?????2011?11?13?                  *
	//***********************************************


	public static void huiwen(String a, int k, int n) //??????
	{
		int i;
		int j;
		for (i = 0; i <= n - k; i++) //??????
		{
			for (j = i; j < k / 2 + i; j++) //??????????
			{
				if (!a[j].equals(a[k + i * 2 - 1 - j])) //???????
				{
					break; //?????
				}
			}
			if (j == k / 2 + i) //??????????????
			{
				for (j = i; j <= k - 1 + i; j++)
				{
					System.out.print(a[j]);
				}
				System.out.print("\n");
			}
		}
		return;
	}

	public static int Main()
	{
		String a = new String(new char[501]);
		int k;
		int n;
		cin.get(a, 500); //?????
		n = a.length(); //??????
		for (k = 2; k <= n; k++)
		{
			huiwen(a, k, n); //??????
		}
		return 0;
	}
}
