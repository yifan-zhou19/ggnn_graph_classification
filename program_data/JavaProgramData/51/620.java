package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[510]);
		int[] cnt = new int[500];
		int[] f = new int[500];
		int n;
		int i;
		int j;
		int l;
		int m = 0;
		int flag = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		char[][] b = new char[500][n + 10];
		l = a.length();
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(b, 0, (Character.SIZE / Byte.SIZE));
		for (i = 0; i < l - n + 1; ++i)
		{
				for (j = 0; j < n; j++)
				{
				b[i][j] = (a.Substring(i) + j);
				}
		}
		for (i = 0; i < l - n; ++i)
		{
				if (f[i] != 0)
				{
				continue;
				}
				for (j = i + 1; j < l - n + 1; ++j)
				{
					if (strcmp(*(b + i), *(b + j)) == 0)
					{
						flag = 1;
						f[j] = 1;
						cnt[i]++;
					}
				}
		}
		if (flag == 0)
		{
		System.out.print("NO");
		System.out.print("\n");
		}
		else
		{
			for (i = 0; i < 500; i++)
			{
				if (cnt[i] > m)
				{
					m = cnt[i];
				}
			}
			System.out.print(m + 1);
			System.out.print("\n");
			for (i = 0; i < 500; i++)
			{
				if (f[i] == 0 && cnt[i] == m)
				{
					System.out.print((b + i));
					System.out.print("\n");
				}
			}
		}

		return 0;
	}

}

