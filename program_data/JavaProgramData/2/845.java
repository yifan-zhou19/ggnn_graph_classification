package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int len;
		int i;
		int j;
		int[] book = new int[1000];
		int[] num = new int[26];
		int k = 0;
		int t;
		int m = 0;
		char[][] w = new char[1000][27];
		char c = 'A';
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
				book[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				w[i] = tempVar3.charAt(0);
			}
			len = String.valueOf(w[i]).length();
			for (j = 0;j < len;j++)
			{
				for (c = 'A',t = 0;c <= 'Z';c++)
				{
					if (w[i][j] == c)
					{
						num[t]++;
						break;
					}
					t++;
				}
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (num[i] > m)
			{
				m = num[i];
				k = i;
			}
		}
		c = 'A' + k;
		System.out.printf("%c\n",c);
		System.out.printf("%d\n",num[k]);
		for (i = 0;i < n;i++)
		{
			len = String.valueOf(w[i]).length();
			for (j = 0;j < len;j++)
			{
				if (w[i][j] == c)
				{
					System.out.printf("%d\n",book[i]);
					break;
				}
			}
		}
		return 0;
	}

}

