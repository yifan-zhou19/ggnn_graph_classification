package <missing>;

public class GlobalMembers
{
	public static int[] num = new int[1000];
	public static char[][] auth = new char[1000][26];

	public static int Main()
	{
		int m;
		int i;
		int l;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		char c = 'A';
		int k = 0;
		int[] a = new int[26];
		for (i = 0;i < 26;i++)
		{
			a[i] = 0;
		}
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				num[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				auth[i] = tempVar3.charAt(0);
			}
			int j = 0;
			while (auth[i][j] != '\0')
			{
				a[auth[i][j] - 64]++;
				j++;
			}
		}
		for (i = 0;i < 25;i++)
		{
			if (a[i] > k)
			{
				k = a[i];
				c = i + 64;
			}
		}
		System.out.printf("%c\n%d\n",c,k);

		for (i = 0;i < m;i++)
		{
			for (l = 0;l < 26;l++)
			{
				if (auth[i][l] == c)
				{
					System.out.printf("%d\n",num[i]);
				}
			}
		}
		return 0;
	}
}

