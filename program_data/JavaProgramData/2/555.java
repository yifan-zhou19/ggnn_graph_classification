package <missing>;

public class GlobalMembers
{
	//********************************
	//*???? ??(13.8) ????
	//********************************

	public static int Main()
	{
		int n;
		int i;
		int nu;
		int au;
		int M;
		int m;
		int[] num = new int[26];
		int[][] no = new int[26][999];
		char aut;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			nu = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.in.read();
			aut = System.in.read();
			while (aut != 10)
			{
				au = (int)(aut - 'A');
				no[au][num[au]] = nu;
				num[au]++;
				aut = System.in.read();
			}
		}
		M = 0;
		for (i = 0; i < 26; i++)
		{
			if (M < num[i])
			{
				M = num[i];
				m = i;
			}
		}
		System.out.print((char)(m + 'A'));
		System.out.print("\n");
		System.out.print(M);
		System.out.print("\n");
		for (i = 0; i < M; i++)
		{
			System.out.print(no[m][i]);
			System.out.print("\n");
		}
		System.in.read();
		System.in.read(); //????
		return 0;
	}

}

