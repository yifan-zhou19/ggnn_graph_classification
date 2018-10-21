package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		char[][] name = new char[1000][26];
		int[] num = new int[1000];
		int i;
		int j;
		char[] b = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
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
				num[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				name[i] = tempVar3.charAt(0);
			}
		}
		int[] a = new int[26];
		char k;
		for (i = 0;i < n;i++)
		{
			for (j = 0;(k = name[i][j] != '\0');j++)
			{
				if (name[i][j] == 'A')
				{
					a[0]++;
				}
				if (name[i][j] == 'B')
				{
					a[1]++;
				}
				if (name[i][j] == 'C')
				{
					a[2]++;
				}
				if (name[i][j] == 'D')
				{
					a[3]++;
				}
				if (name[i][j] == 'E')
				{
					a[4]++;
				}
				if (name[i][j] == 'F')
				{
					a[5]++;
				}
				if (name[i][j] == 'G')
				{
					a[6]++;
				}
				if (name[i][j] == 'H')
				{
					a[7]++;
				}
				if (name[i][j] == 'I')
				{
					a[8]++;
				}
				if (name[i][j] == 'J')
				{
					a[9]++;
				}
				if (name[i][j] == 'K')
				{
					a[10]++;
				}
				if (name[i][j] == 'L')
				{
					a[11]++;
				}
				if (name[i][j] == 'M')
				{
					a[12]++;
				}
				if (name[i][j] == 'N')
				{
					a[13]++;
				}
				if (name[i][j] == 'O')
				{
					a[14]++;
				}
				if (name[i][j] == 'P')
				{
					a[15]++;
				}
				if (name[i][j] == 'Q')
				{
					a[16]++;
				}
				if (name[i][j] == 'R')
				{
					a[17]++;
				}
				if (name[i][j] == 'S')
				{
					a[18]++;
				}
				if (name[i][j] == 'T')
				{
					a[19]++;
				}
				if (name[i][j] == 'U')
				{
					a[20]++;
				}
				if (name[i][j] == 'V')
				{
					a[21]++;
				}
				if (name[i][j] == 'W')
				{
					a[22]++;
				}
				if (name[i][j] == 'X')
				{
					a[23]++;
				}
				if (name[i][j] == 'Y')
				{
					a[24]++;
				}
				if (name[i][j] == 'Z')
				{
					a[25]++;
				}
			}
		}
		int max = a[0];
		int o = 0;
		for (i = 0;i < 26;i++)
		{
			if (a[i] > max)
			{
				max = a[i];
				o = i;
			}
		}
		System.out.printf("%c\n%d\n",b[o],a[o]);
		for (i = 0;i < n;i++)
		{
			for (j = 0;(k = name[i][j] != '\0');j++)
			{
				if (name[i][j] == b[o])
				{
					System.out.printf("%d\n",num[i]);
				}
			}

		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			i = Integer.parseInt(tempVar4);
		}


		return 0;
	}
}

