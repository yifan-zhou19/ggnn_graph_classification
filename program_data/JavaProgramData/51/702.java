package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] cnt = new int[505];
		int len;
		int j;
		int k;
		int num = 0;
		int flag;
		int max = 0;
		String a = new String(new char[506]);
		char[][] b = new char[508][6];
		String c = new String(new char[6]);
		String p = a;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		len = a.length();
		for (i = 0; i <= 500; i++)
		{
			cnt[i] = 0;
		}
		for (i = 0;i <= len - n; i++)
		{
			for (j = 0; j < n; j++)
			{
				c = tangible.StringFunctions.changeCharacter(c, j, *(p.Substring(i) + j));
			}
			c [n] = '\0';
			if (num == 0)
			{
				for (j = 0; j < n; j++)
				{
				b[0][j] = c.charAt(j);
				}
				b [0][n] = '\0';
				num++;
			}
			else
			{
				flag = 1;
				for (j = 0; j < num; j++)
				{
					if (strcmp(b[j], c) == 0)
					{
						flag = 0;
					}
				}
				if (flag == 1)
				{
					num++;
					for (j = 0; j < n; j++)
					{
						b[num - 1][j] = c.charAt(j);
					}
					b[num - 1][n] = '\0';
				}
			}
		}
		for (i = 0; i < num ; i++)
		{
			for (j = 0;j <= len - n; j++)
			{
				for (k = 0; k < n; k++)
				{
					c [k] = *(p.Substring(j) + k);
				}
				c = tangible.StringFunctions.changeCharacter(c, n, '\0');
				if (strcmp(b[i],c) == 0)
				{
					cnt [i]++;
				}
			}
		}
		for (i = 0; i < num; i++)
		{
			if (cnt [i] > max)
			{
				max = cnt[i];
			}
		}
		if (max > 1)
		{
			System.out.print(max);
			System.out.print("\n");
			for (i = 0; i < num; i++)
			{
				if (cnt[i] == max)
				{
					System.out.print(b[i]);
					System.out.print("\n");
				}
			}
		}
		else
		{
			System.out.print("NO");
		}
			return 0;
	}

}

