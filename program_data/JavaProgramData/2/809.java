package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int[] no = new int[1000];
		int[] shu = new int[26];
		int max = 0;
		char[][] s = new char[1000][20];
		char c;
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
				no[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				s[i] = tempVar3.charAt(0);
			}
			for (j = 0;j < String.valueOf(s[i]).length();j++)
			{
				shu[s[i][j] - 'A']++;
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (shu[i] > max)
			{
				max = shu[i];
				c = 'A' + i;
			}
		}
		System.out.printf("%c\n%d\n",c,max);
		for (i = 0;i < n;i++)
		{
			if (tangible.StringFunctions.strChr(s[i],c))
			{
				System.out.printf("%d\n",no[i]);
			}
		}
	}
}

