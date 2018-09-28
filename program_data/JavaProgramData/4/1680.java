package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	/*????row?col??????array????array[0][0]????????????????????????? 
	????????????????row?col? 
	???row??????col??????????????? 
	??????row?col??0<row<100, 0<col<100?
	????????????????????
	
	3 4
	1 2  4  7
	3 5  8 10
	6 9 11 12*/
		int n;
		int m;
		int i;
		int j;
		int[][] shu = new int[100][100];
		int hang = 1;
		int lie = 1;
		int count;
		int mark;
		int zddjx;
		int duijiao;
		int jh = 1;
		int jl = 1;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		count = n * m;
		for (i = 1; i <= n; i++)
		{
			for (j = 1; j <= m; j++)
			{
				shu[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		if (n == 1)
		{
			for (j = 1; j <= m; j++)
			{
				System.out.print(shu[1][j]);
				System.out.print("\n");
			}
		}
		if (n == 1)
		{
			return 0;
		}
		if (m == 1)
		{
			for (j = 1; j <= n; j++)
			{
				System.out.print(shu[j][1]);
				System.out.print("\n");
			}
			return 0;
		}
		if (m == 1)
		{
			return 0;
		}
		System.out.print(shu[hang][lie]);
		System.out.print("\n");
		duijiao = hang + lie;
		count--;
		while (count != 0) //?????????
		{
			duijiao++; //?????????
			hang = jh;
			lie = duijiao - hang;
			if (lie == m) //?????????????????+1
			{
				jh++;
			}
			while (lie >= jl)
			{
				System.out.print(shu[hang][lie]);
				System.out.print("\n");
				count--;
				hang++;
				lie--;
			}
			if (hang == n + 1)
			{
				jl++;
			}
		}
		return 0;
	}











}

