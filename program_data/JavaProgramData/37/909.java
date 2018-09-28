package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		char[][] s = new char[10][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (j = 0;j < n;j++)
		{
			int[] num = new int[26];
			int[] m = new int[26];
			int t = 100000;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s[j] = tempVar2.charAt(0);
			}

			for (i = String.valueOf(s[j]).length() - 1;i > -1;i--)
			{
				k = s[j][i] - 97;
				num[k]++;
				if (num[k] == 1)
				{
					m[k] = i;
				}
			}
			for (k = 0;k < 26;k++)
			{
				if (num[k] == 1)
				{
					if (m[k] <= t)
					{
						t = m[k];
					}
				}
			}
			if (t < 100000)
			{
				System.out.printf("%c\n",s[j][t]);
			}
			else
			{
				System.out.print("no\n");
			}
		}
	}
}

