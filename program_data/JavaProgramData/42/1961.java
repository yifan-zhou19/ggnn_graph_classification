package <missing>;

public class GlobalMembers
{
	//********************************
	//*???????????       **
	//*?????? 1300012773      **
	//*???2013.10.30             **
	//********************************
	public static int Main()
	{
		int[] a = new int[100000]; //???????�???100000???
		int n; //??i?j??????n??????????k????????
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		//???n????????
		for (int i = 0; i < n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}

		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (int j = 0; j < n;)
		{
			if (a[j] == k)
			{
				for (int l = j; l <= n - 1; l++)
				{
					a[l] = a[l + 1];

				}
				n--;
			}
			else
			{
				j++;
			}

		}

		System.out.print(a[0]);
		for (int i = 1; i < n; i++)
		{
			System.out.print(' ');
			System.out.print(a[i]);
		}

		return 0;
	}

}

