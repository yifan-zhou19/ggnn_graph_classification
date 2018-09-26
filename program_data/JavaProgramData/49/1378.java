package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[500]);
		s = new Scanner(System.in).nextLine();
		int[][] a = new int[500][500];
		int[] b = new int[500];
		int l;
		int i;
		int j;
		int k;
		int p = 0;
		l = s.length();
		for (i = 0;i < l - 1;i = i + 1)
		{
			for (j = 1;(i + j < l) && (i - j >= 0);j = j + 1)
			{
				if (s.charAt(i + j) == s.charAt(i - j))
				{
					a[2 * j + 1][b[2 * j + 1]] = i;
					b[2 * j + 1]++;
				}
				else
				{
					break;
				}
			}
			for (j = 0;((i - j) >= 0) && (i + 1 + j < l);j = j + 1)
			{
				if (s.charAt(i - j) == s.charAt(i + 1 + j))
				{
					a[2 * j + 2][b[2 * j + 2]] = i;
					b[2 * j + 2]++;
				}
				else
				{
					break;
				}
			}
		}
		p = 0;
		for (i = 2;i <= l;i = i + 1)
		{
			if (i % 2 == 0)
			{
				for (j = 0;j < b[i];j = j + 1)
				{
					if (p != 0)
					{
						System.out.print("\n");
					}
					p = p + 1;
					for (k = a[i][j] - i / 2 + 1;k <= a[i][j] + i / 2;k = k + 1)
					{
						System.out.printf("%c",s.charAt(k));
					}
				}
			}
			else
			{
				for (j = 0;j < b[i];j = j + 1)
				{
					if (p != 0)
					{
						System.out.print("\n");
					}
					p++;
					for (k = a[i][j] - (i - 1) / 2;k <= a[i][j] + (i - 1) / 2;k = k + 1)
					{
						System.out.printf("%c",s.charAt(k));
					}
				}
			}
		}
		return 0;
	}

}
