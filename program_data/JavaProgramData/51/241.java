package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String x = new String(new char[501]);
		char[][] ch = new char[500][5];
		final String y = "";
		int i;
		int j;
		int m = -1;
		int flag;
		int k;
		int n;
		int l;
		int p;
		int q;
		int t;
		int r;
		int max;
		int[] count = new int[500];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		x = new Scanner(System.in).nextLine();
		l = x.length();
		for (i = 0;i < l - n + 1;i++)
		{
			flag = 0;
			for (j = 0;j < n;j++)
			{
				y = tangible.StringFunctions.changeCharacter(y, j, x.charAt(i + j));
			}
			for (k = 0;k <= m;k++)
			{
				if (strcmp(y,ch[k]) == 0)
				{
					count[k]++;
					flag++;
					break;
				}
			}
			if (flag == 0)
			{
				m++;
				ch[m] = y;
				count[m]++;
			}
		}
		for (q = 0;q < m;q++)
		{
			for (p = 0;p < m - q;p++)
			{
				if (count[p] > count[p + 1])
				{
					y = ch[p];
					ch[p] = ch[p + 1];
					ch[p + 1] = y;
					t = count[p];
					count[p] = count[p + 1];
					count[p + 1] = t;
				}
			}
		}
		max = count[m];
		if (max > 1)
		{
			for (i = m;;i--)
			{
				if (count[i] < max)
				{
					break;
				}
			}
			System.out.printf("%d\n",max);
			for (j = i + 1;j <= m;j++)
			{
				for (r = 0;r < n;r++)
				{
					System.out.printf("%c",ch[j][r]);
				}
				System.out.print("\n");
			}
		}
		else
		{
			System.out.print("NO\n");
		}
	}
}

