package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] s = new char[1000][1000];
		String t = new String(new char[1000]);
		String str = new String(new char[1000]);
		int[] a = new int[1000];
		int i;
		int j;
		int m;
		int n;
		int k;
		int l;
		int max;
		int x;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		str = new Scanner(System.in).nextLine();
		m = str.length();
		k = 0;
		for (i = 0;i < m - n + 1;i++)
		{
			for (j = 0;j < 1000;j++)
			{
				t = t.substring(0, j);
			}
			for (j = 0;j < n;j++)
			{
				t = tangible.StringFunctions.changeCharacter(t, j, str.charAt(i + j));
			}
			l = 0;
			for (j = 1;j <= k;j++)
			{
				x = 0;
				for (b = 0;b < n;b++)
				{
					if (t.charAt(b) != s[j][b])
					{
						x = 1;
					}
				}
				if (x == 0)
				{
					l = 1;
					a[j]++;
				}
			}
			if (l == 0)
			{
				k++;
				for (j = 0;j < n;j++)
				{
					s[k][j] = t.charAt(j);
				}
				for (j = n;j < 1000;j++)
				{
					s[k][j] = 0;
				}
				a[k] = 1;
			}
		}
		max = 0;
		for (i = 1;i <= k;i++)
		{
			if (a[i] > max)
			{
				max = a[i];
			}
		}
		if (max == 1)
		{
			System.out.print("NO");
		}
		else
		{
			System.out.printf("%d\n",max);
		for (i = 1;i <= k;i++)
		{
			if (a[i] == max)
			{
				System.out.println(s[i]);
			}
		}

		}
	}
}

