package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int j;
		char[][] yjh = new char[1][LEN];
		yjh[0] = new Scanner(System.in).nextLine();
		n = String.valueOf(yjh[0]).length();
		for (i = 0;i < n;i++)
		{
			if (yjh[0][i] == 32 && yjh[0][i + 1] == 32)
			{
				for (j = i;j < n;j++)
				{
					yjh[0][j] = yjh[0][j + 1];
					i--;
				}

			}
		}
		System.out.printf("%s\n",yjh[0]);
		return 0;
	}
}
