package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int[] sum = new int[50];
		int[] len = new int[50];
		char[][] s = new char[50][100];
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
				s[i] = tempVar2.charAt(0);
			}
			len[i] = String.valueOf(s[i]).length();
		}
		for (i = 0;i < n;i++)
		{
			if (s[i][len[i] - 1] == 'r' && s[i][len[i] - 2] == 'e')
			{
				sum[i] = 0;

			}
			if (s[i][len[i] - 1] == 'y' && s[i][len[i] - 2] == 'l')
			{
				sum[i] = 1;

			}
			if (s[i][len[i] - 1] == 'g' && s[i][len[i] - 2] == 'n' && s[i][len[i] - 3] == 'i')
			{
				sum[i] = 2;

			}
		}
		for (i = 0;i < n;i++)
		{
			if (sum[i] == 0 || sum[i] == 1)
			{
				for (k = 0;k <= len[i] - 4;k++)
				{
					System.out.printf("%c",s[i][k]);
				}
				System.out.printf("%c\n",s[i][len[i] - 3]);
			}
			if (sum[i] == 2)
			{
				for (k = 0;k <= len[i] - 5;k++)
				{
					System.out.printf("%c",s[i][k]);
				}
				System.out.printf("%c\n",s[i][len[i] - 4]);
			}
		}
		return 0;
	}

}

