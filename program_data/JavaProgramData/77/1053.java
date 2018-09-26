package <missing>;

public class GlobalMembers
{
	public static int i = 0;
	public static int[][] a2 = new int[2][101];

	public static int f(String s, char a, char b, int n)
	{
		int j;
		int k;
		int e;
		int flag2 = 0;
		for (j = 0;j < n;j++)
		{
			if (!s[j].equals(' '))
			{
			flag2 = 1;
			break;
			} //??????????
		}
		if (flag2 == 0)
		{
			return 0; //?????????????
		}

		for (j = 0;j < n - 1;j++)
		{
			if (s[j].equals(a))
			{
			for (k = j + 1;k < n;k++)
			{
			if (s[k].equals(b))
			{
				if (k == j + 1)
				{
					a2[0][i] = j;
					a2[1][i] = k;
					s[j] = ' ';
					s[k] = ' ';
					i++;
					break;
				}
				else
				{
				int flag = 0;
				for (e = j + 1;e < k;e++)
				{
					if (!s[e].equals(' '))
					{
						flag = 1;
						break;
					}
				}
				if (flag == 0)
				{
					a2[0][i] = j;
					a2[1][i] = k;
					s[j] = ' ';
					s[k] = ' ';
					i++;
					break;
				}
				}
			}
			}
			}
		}
		f(s, a, b, n);
	}

	public static void Main()
	{
		String s1 = new String(new char[101]);
		char a1;
		char b1;
		int l;
		int t;
		int qqq;
		int l1;
		int x;
		int y;
		int temp;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s1 = tempVar.charAt(0);
		}
		l = s1.length(); //???????
		a1 = s1.charAt(0); //?a1????
		for (t = 0;t < l;t++)
		{
			if (s1.charAt(t) != a1)
			{
			b1 = s1.charAt(t);
			break;
			} //?b1????
		}
		qqq = f(s1, a1, b1, l);
		l1 = l / 2;
		for (x = 1;x <= l1 - 1;x++)
		{
			for (y = 0;y < l1 - x;y++)
			{
				if (a2[1][y] > a2[1][y + 1])
				{
					temp = a2[1][y];
					a2[1][y] = a2[1][y + 1];
					a2[1][y + 1] = temp;
					temp = a2[0][y];
					a2[0][y] = a2[0][y + 1];
					a2[0][y + 1] = temp;
				}
			}
		}
		for (t = 0;2 * t < l;t++)
		{
			System.out.printf("%d %d\n",a2[0][t],a2[1][t]);
		}
	}
}

