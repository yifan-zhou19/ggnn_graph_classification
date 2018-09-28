package <missing>;

public class GlobalMembers
{
	public static int[][] day = new int[100][100];
	public static int n;
	public static int Sick(int i,int j,int c)
	{
		int sick = 0;
		if (day[i - 1][j] == 0 && i - 1 >= 0)
		{
			day[i - 1][j] = c + 1;
			sick++;
		}
		if (day[i + 1][j] == 0 && i + 1 < n)
		{
			day[i + 1][j] = c + 1;
			sick++;
		}
		if (day[i][j - 1] == 0 && j - 1 >= 0)
		{
			day[i][j - 1] = c + 1;
			sick++;
		}
		if (day[i][j + 1] == 0 && j + 1 < n)
		{
			day[i][j + 1] = c + 1;
			sick++;
		}
		return sick;
	}


	public static int Main()
	{

		String people = new String(new char[100]);
		int i;
		int j;
		int c;
		int cday;
		int sick = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				people = tempVar2.charAt(0);
			}
			for (j = 0;j < n;j++)
			{
				if (people.charAt(j) == '#')
				{
					day[i][j] = -1;
				}
				if (people.charAt(j) == '@')
				{
					day[i][j] = 1;
					sick++;
				}
			}
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			cday = Integer.parseInt(tempVar3);
		}

		for (c = 1;c < cday;c++)
		{
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					if (day[i][j] == c)
					{
						sick += Sick(i, j, c);
					}
				}
			}
		}
		System.out.printf("%d\n",sick);

		return 0;

	}

}

