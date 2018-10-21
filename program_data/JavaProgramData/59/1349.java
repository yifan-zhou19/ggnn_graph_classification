package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int n;
		int count;
		int time;
		// ?????
		char[][][] a = new char[2][100][101]; //????'\0'???????
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.in.read();
		for (i = 0;i < n;i++)
		{
			a[0][i] = new Scanner(System.in).nextLine();
			a[1][i] = a[0][i];
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			time = Integer.parseInt(tempVar2);
		}
		for (k = 0;k < (time-1);k++)
		{ //???????time?1
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					if (a[0][i][j] == '@')
					{
						if (i + 1 < n)
						{ //???????????????
							if (a[0][i + 1][j] == '.')
							{
								a[1][i + 1][j] = '@'; //????????????????
							}
						}
						if (i - 1 >= 0)
						{
							if (a[0][i - 1][j] == '.')
							{
								a[1][i - 1][j] = '@';
							}
						}
						if (j + 1 < n)
						{
							if (a[0][i][j + 1] == '.')
							{
								a[1][i][j + 1] = '@';
							}
						}
						if (j - 1 >= 0)
						{
							if (a[k % 2][i][j - 1] == '.')
							{
								a[1][i][j - 1] = '@';
							}
						}
					}
				}
			}
			for (i = 0;i < n;i++)
			{
				a[0][i] = a[1][i]; //?????????????????
			}
		}
		// ?????????????????
		count = 0;
		for (i = 0;i < n;i++)
		{
				for (j = 0;j < n;j++)
				{
					if (a[0][i][j] == '@')
					{
						count++;
					}
				}
		}
		System.out.printf("%d",count);
		return 0;
	}
}

