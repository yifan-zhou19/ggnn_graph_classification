package <missing>;

public class GlobalMembers
{
	//********************************
	//*????????             **
	//*????? 1300012848        **
	//*???2013.10.30             **
	//********************************
	public static int Main()
	{
		int n;
		int i = 0;
		int j = 0;
		int k;
		int m = 0;
		int p = 0;
		int l;
		int cnt = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] b = new int[100000];
		for (; i < n; i++)
		{
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (; j < n; j++)
		{
			if (b[j] == k)
			{
				cnt++; //?k??????cnt? ??n?????cnt???
			}
		}
		for (l = 0; l < n - cnt; l++) //???????n-cnt??
		{
			for (m = p; m < n; m++) //????????k??????????
			{
				if (b[m] != k)
				{
					b[l] = b[m];
					p = m + 1;
					break; //???b[l]??????????
				}
			}
		}
		for (l = 0; l < n - cnt; l++)
		{
			System.out.print(b[l]);
			if (l < n - cnt - 1)
			{
				System.out.print(" ");
			}
		}
		return 0;
	}
}

