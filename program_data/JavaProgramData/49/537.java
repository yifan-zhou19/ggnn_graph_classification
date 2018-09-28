package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1000]);
		char[][] b = new char[1000][1000];
		char[][] c = new char[1000][1000];
		int i;
		int j;
		int k;
		int num = 0;
		int[] clen = new int[1000];
		int[] clen0 = new int[1000];
		int p = 0;
		int shorter;
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int len = a.length();
		for (i = 0;i < len;i++)
		{
			for (j = i;j < len;j++)
			{
				p = 0;
				for (k = i;k <= j;k++)
				{
					b[num][p] = a.charAt(k);
					p++;
				}
				num++;
			}
		}
		int judge = 0;
		for (i = 0;i < num;i++)
		{
			clen[i] = String.valueOf(b[i]).length();
			j = 0;
			judge = 0;
			while (true)
			{
				if (b[i][j] == b[i][clen[i] - j - 1])
				{
					judge = 1;
					j++;
					if (j == clen[i])
					{
						break;
					}
					continue;
				}
				else
				{
					judge = 0;
					break;
				}
			}

			if (judge == 1 && clen[i] > 1)
			{
				c[p] = b[i];
				clen0[p] = clen[i];
				p++;
			}
		}
		shorter = 0;
		for (i = 0;i < p;i++)
		{
			for (j = 0;j < p;j++)
			{
				if (clen0[j] < clen0[shorter])
				{
					shorter = j;
				}
			}
			System.out.print(c[shorter]);
			System.out.print("\n");
			clen0[shorter] = 1000;
		}

		return 0;
	}
}

