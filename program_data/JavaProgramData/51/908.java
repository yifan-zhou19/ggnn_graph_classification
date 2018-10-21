package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int l;
		int i;
		int j;
		int m;
		int t;
		int[] count = new int[600];
		String str = new String(new char[600]);
		char[][] gram = new char[600][6];
		String c = new String(new char[10]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		c = new Scanner(System.in).nextLine();
		str = new Scanner(System.in).nextLine();
		l = str.length();
		for (i = 0;i + n <= l;i++)
		{
			for (j = 0;j < n;j++)
			{
				gram[i][j] = str.charAt(i + j);
			}
			gram[i][n] = '\0';
		}
		m = i;
		for (i = 0;i < m - 1;i++)
		{
			for (j = i + 1;j < m;j++)
			{
				if (gram[i][0] != '\0' && strcmp(gram[i],gram[j]) == 0)
				{
					gram[j][0] = '\0';
					count[i] += 1;
				}
			}
		}
		for (i = 0;i < m - 1;i++)
		{
			for (j = 0;j < m - 1 - i;j++)
			{
				if (count[j] < count[j + 1])
				{
					t = count[j];
					count[j] = count[j + 1];
					count[j + 1] = t;
					gram[500 + i] = gram[j];
					gram[j] = gram[j + 1];
					gram[j + 1] = gram[500 + i];
				}
			}
		}
		if (count[0] == 0)
		{
			System.out.print("NO\n");
		}
		else
		{
			i = 0;
			System.out.printf("%d\n",count[0] + 1);
			while (count[i] == count[0])
			{
				System.out.printf("%s\n",gram[i]);
				i++;
			}
		}
		return 0;
	}

}

