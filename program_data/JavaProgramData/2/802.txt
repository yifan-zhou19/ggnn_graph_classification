package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] book = new char[1000][30];
		int n;
		int i;
		int j;
		int k;
		int r;
		int[] len = new int[1000];
		int[][] a = new int[26][1000];
		int[] b = new int[26];
		int max;
		int s;
		int[] c = new int[26];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n;i++)
		{
			book[i] = new Scanner(System.in).nextLine();
			scanf("\n");
		}
		for (i = 0;i <= n;i++)
		{
			for (j = 0;book[i][j] != ' ';j++)
			{
				len[i] = j;
			}
		}
		for (k = 0;k < 26;k++)
		{
			r = 0;
			for (i = 0;i <= n;i++)
			{
				for (j = len[i] + 1;j < String.valueOf(book[i]).length();j++)
				{
					if (book[i][j] == k + 65)
					{
						b[k]++;
						a[k][r] = i;
						r++;
					}
				}
			}
			c[k] = r;
		}
		max = b[0];
		for (i = 1;i < 26;i++)
		{
			if (b[i] >= max)
			{
				max = b[i];
				s = i;
			}
		}
		System.out.printf("%c\n",s + 65);
		System.out.printf("%d\n",max);
		for (i = 0;i < c[s];i++)
		{
			for (j = 0;j <= len[a[s][i]];j++)
			{
				System.out.printf("%c",book[a[s][i]][j]);
			}
			System.out.print("\n");
		}
	}





}

