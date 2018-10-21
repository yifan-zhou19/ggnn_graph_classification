package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] d = new int[500];
		String a = new String(new char[600]);
		char[][] b =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		String c = new String(new char[10]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = new Scanner(System.in).nextLine();
		int i;
		int j;
		int k;
		int l = 0;
		int m;
		int x;
		int y;
		k = a.length();
		for (i = 0;i <= k - n;i++)
		{
			for (j = i;j <= i + n - 1;j++)
			{
				c = tangible.StringFunctions.changeCharacter(c, j - i, a.charAt(j));
			}
			c = tangible.StringFunctions.changeCharacter(c, n, '\0');
			for (m = 1;m <= l;m++)
			{
				if (strcmp(c,b[m - 1]) == 0)
				{
					x = m - 1;
					break;
				}
			}
			if (m > l)
			{
				b[m - 1] = c;
				l++;
			}
			else
			{
				d[x]++;
			}
		}
		int max = d[0];
		for (i = 0;i < l;i++)
		{
			if (d[i] > max)
			{
				max = d[i];
			}
		}
		max++;
		if (max == 1)
		{
			System.out.print("NO");
		}
		else
		{
			System.out.printf("%d\n",max);
			for (i = 0;i < l;i++)
			{
				if (d[i] == max - 1)
				{
					System.out.println(b[i]);
				}
			}
		}
		return 0;
	}
}

