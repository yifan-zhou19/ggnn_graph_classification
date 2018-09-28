package <missing>;

public class GlobalMembers
{
	public static String a = new String(new char[502]);
	public static char[][] b = new char[502][6];
	public static String c = new String(new char[502]);
	public static int Main()
	{
		int n;
		int j;
		int i;
		int m;
		String p = a;
		(char)(*q)[6] = b;
		String r = c;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int len = a.length();
		for (i = 0; i <= len - n; i++)
		{
			for (j = 0; j < n; j++)
			{
				q[i][j] = *(p.Substring(i) + j);
			}
		}

		for (i = 0; i <= len - n; i++)
		{
			for (j = i + 1; j <= len - n; j++)
			{
				if (strcmp(q[i], q[j]) == 0)
				{
					r.charAt(i)++;
				}
			}
		}

		int max = c.charAt(0);
		for (i = 0; i <= len - n; i++)
		{
			if (max < r.charAt(i))
			{
				max = r.charAt(i);
			}
		}

		if (max <= 0)
		{
			System.out.print("NO");
		}

		else
		{
				System.out.print(max + 1);
				System.out.print("\n");
				for (i = 0; i < len - n; i++)
				{
					if (r.charAt(i) == max)
					{
						System.out.print(q[i]);
						System.out.print("\n");
					}
				}
		}
		return 0;
	}
}

