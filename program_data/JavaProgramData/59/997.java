package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String ch = ""; //#???????.?????@??????????
		int[][] a = new int[103][103]; //0???????1?????2??????????3????????
		int n;
		int i;
		int j;
		int k;
		int day;
		int num = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 0;i < n + 2;i++)
		{
			for (j = 0;j < n + 2;j++)
			{
				ch.charAt(i)[j] = '#'; //????????1?n???
			}
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				ch.charAt(i)[j] = ConsoleInput.readToWhiteSpace(true);
			}
			System.in.read();
		}
		day = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n + 2;i++)
		{
			for (j = 0;j < n + 2;j++)
			{
				if (ch.charAt(i)[j] == '#')
				{
					a[i][j] = 0;
				}
				else if (ch.charAt(i)[j] == '.')
				{
					a[i][j] = 1;
				}
				else if (ch.charAt(i)[j] == '@')
				{
					a[i][j] = 2;
				}
			} //?????????????
		}
			for (k = 1;k < day;k++) //day????day-1?
			{
				for (i = 1;i <= n;i++)
				{
					for (j = 1;j <= n;j++)
					{
						if (a[i][j] == 2)
						{
							a[i][j]++; //????????????????????
						}
					}
				}
				for (i = 1;i <= n;i++)
				{
					for (j = 1;j <= n;j++)
					{
						if ((a[i][j] == 3) && (a[i][j - 1] == 1)) //????
						{
							a[i][j - 1] = 2;
						}
						if ((a[i][j] == 3) && (a[i][j + 1] == 1)) //????
						{
							a[i][j + 1] = 2;
						}
						if ((a[i][j] == 3) && (a[i - 1][j] == 1)) //????
						{
							a[i - 1][j] = 2;
						}
						if ((a[i][j] == 3) && (a[i + 1][j] == 1)) //????
						{
							a[i + 1][j] = 2;
						}
					}
				}
			}
			for (i = 1;i <= n;i++)
			{
				for (j = 1;j <= n;j++)
				{
					if ((a[i][j] != 0) && (a[i][j] != 1))
					{
						num++;
					}
				}
			}
			System.out.print(num);
			System.out.print("\n");
			return 0;
	}
}

