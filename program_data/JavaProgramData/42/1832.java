package <missing>;

public class GlobalMembers
{
	//***************************
	//*???????????  **
	//*?????? 1300013007 **
	//*???2013.10.30        **
	//***************************
	public static int Main()
	{
		int n; //n??????????
		int number; //number????????,k?????????
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[100000];
		int i;
		int m;
		int p;
		int q;
		int x = 0;
		for (i = 0; i < n; i++) //??n???????????????
		{
			number = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a[i] = number;
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (m = 0; m < n; m++)
		{
			if (a[m] == k)
			{
				for (p = m + 1; p < n; p++) //??k????????
				{
					a[p - 1] = a[p];
				}
				m--; //????m??????
				n--;
			}
		}
		for (q = 0; q < n; q++)
		{
			System.out.print(a[q]);
			if (q == n - 1)
			{
				System.out.print("\n");
			}
			else
			{
				System.out.print(' ');
			}
		}
		return 0;
	}
}

