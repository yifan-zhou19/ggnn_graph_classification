package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int l;
		int max = 0;
		int t;
		String s = new String(new char[501]);
		char[][] son = new char[500][5];
		int[] cnt = new int[500];
		int[] rd = new int[500];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s = tempVar2.charAt(0);
		}
		l = s.length();
		for (i = 0;i + n - 1 <= l - 1;i++)
		{
			for (j = i;j <= i + n - 1;j++)
			{
				son[i][j - i] = s.charAt(j);
			}
			son[i][j - i] = '\0';
		}
		for (i = 0;i <= l - n + 1;i++)
		{
			for (j = i;j <= l - n + 1;j++)
			{
				if (strcmp(son[i],son[j]) == 0)
				{
					cnt[i]++;
				}
			}
			if (cnt[i] > max)
			{
				max = cnt[i];
				t = i;
			}
		}
		if (max == 1)
		{
			System.out.print("NO\n");
		}
		else
		{
			System.out.printf("%d\n",max);
			for (i = 0;i <= l - n + 1;i++)
			{
				if (cnt[i] == cnt[t])
				{
					System.out.printf("%s\n",son[i]);
				}
			}
		}
		return 0;
	}
}

