package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] c = new char[100][10000];
		String s = new String(new char[26]);
		int t;
		int i;
		int j;
		int k;
		int len;
		int num;
		int[] n = new int[26];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (i = 0;i < t;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				c[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0;i < t;i++)
		{
			k = 0;
			for (j = 0;j < 26;j++)
			{
				n[j] = 0;
			}
			len = String.valueOf(c[i]).length();
			for (j = 0;j < len;j++)
			{
				num = c[i][j] - 97;
				n[num]++;
			}
			for (j = 0;j < len;j++)
			{
				num = c[i][j] - 97;
				if (n[num] == 1)
				{
					System.out.printf("%c\n",c[i][j]);
					k = 1;
					break;
				}
			}
			if (k == 0)
			{
				System.out.print("no\n");
			}
		}
		return 0;
	}
}

