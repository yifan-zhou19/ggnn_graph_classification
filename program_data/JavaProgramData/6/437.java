package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t; //???t?????
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int r = 1;r <= t;r++) //?t???
		{
			int m;
			int n;
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			int[][] juzhen = new int[100][100]; //????
			for (int i = 0;i < m;i++)
			{
				for (int j = 0;j < n;j++)
				{
					juzhen[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
			int * p; //????
			int sum = 0; //???
			for (int s = 0;s < m;s++) //s??????0???m-1
			{
				if (s == 0 || s == m - 1) //????????????
				{
					for (p = juzhen[s];p <= juzhen[s][n - 1];p++) //??????????????????
					{
						sum = sum + (*p);
					}
				}
				else //?????????????????
				{
					p = juzhen[s];
					sum = sum + (*p) + *(p + n - 1);
				}
			}
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}

}

