package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String s = new String(new char[501]);
		s = new Scanner(System.in).nextLine();
		int len = s.length();

		int i;
		int j;
		char[][] sub = new char[500][5];
		for (i = 0;i <= len - n;i++)
		{
			for (j = 0;j <= n - 1;j++)
			{
				sub[i][j] = s.charAt(i + j);
			}
			sub[i][n] = 0;
		}

		int[] time = new int[500];
		int t = 0;
		int x = 1;
		for (i = 0;i <= len - n - 1;i++)
		{
			time[i] = 1;

			if (sub[i][0] != 0)
			{
				for (j = i + 1;j <= len - n;j++)
				{
					if (strcmp(sub[i],sub[j]) == 0)
					{
						time[i]++;
						sub[j][0] = 0;
					}
				}

				if (x < time[i])
				{
					x = time[i];
				}
			}
		}

		if (x == 1)
		{
			System.out.print("NO\n");
		}
		else
		{
			System.out.printf("%d\n",x);
			for (i = 0;i <= len - n;i++)
			{
				if (time[i] == x)
				{
					System.out.printf("%s\n",sub[i]);
				}
			}
		}
	}
}

