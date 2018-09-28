package <missing>;

public class GlobalMembers
{
	//********************************
	//*n-gram????               **
	//*????? 1300012848        **
	//*???2013.12.11             **
	//********************************
	public static int Main()
	{
		int n;
		int k;
		int i;
		int j;
		int l;
		int maxc = 0;
		int x = 0;
		String c = new String(new char[501]);
		char[][] strout = new char[501][5];
		int[] a = new int[501]; //???????????
		for (i = 0; i < 501; i++)
		{
			a[i] = 1; //???????????? ??????1
		}
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		c = ConsoleInput.readToWhiteSpace(true).charAt(0);
		k = c.length(); //??????????
		String p = c; //??????? ?????????
		for (j = 0; j <= k - n; j++)
		{
			for (l = j + 1; l <= k - n; l++)
			{
				for (i = 0; i < n; i++) //???????
				{
					if (*(p.Substring(j) + i) == *(p.Substring(l) + i)) //??i+1?????????????
					{
						continue;
					}
					else
					{
						break;
					}
				}
				if (i >= n) //????break??? ??????????
				{
					a[j]++;
				}
			}
		}
		for (i = 0;i < k - n; i++)
		{
			if (a[i] >= maxc)
			{
				maxc = a[i];
			}
		}
		for (i = 0;i < k - n; i++)
		{
			if (a[i] >= maxc) //???????????? ???? ??????????????
			{
				for (j = 0;j < n; j++)
				{
					strout[x][j] = (p.Substring(i) + j);
				}
				x++;
			}
		}
		if (maxc == 1) //??????? ??NO
		{
			System.out.print("NO");
			System.out.print("\n");
		}
		else
		{
			System.out.print(maxc);
			System.out.print("\n");
			for (i = 0; i < x; i++)
			{
				for (j = 0;j < n; j++)
				{
					System.out.print(strout[i][j]);
				}
				System.out.print("\n");
			}
		}
		return 0;
	}
}

