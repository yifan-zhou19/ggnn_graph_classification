package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int m;
	public static int i;
	public static int j;
	public static int ans;
	public static int[] f = new int[510];
	public static String ss = new String(new char[510]);
	public static char[][] s = new char[510][510];
	public static int Main()
	{
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		ss = ConsoleInput.readToWhiteSpace(true).charAt(0);
		m = ss.length() - n + 1;
		for (i = 0;i < m;i++)
		{
			s[i] = ss.substring(i, i + n);
		}
		for (i = 0;i < m;i++)
		{
			for (j = i;j < m;j++)
			{
				if (strcmp(s[i],s[j]) == 0)
				{
					f[i]++;
				}
			}
			if (ans < f[i])
			{
				ans = f[i];
			}
		}
		if (ans > 1)
		{
			System.out.print(ans);
			System.out.print("\n");
			System.out.print("\n");
			for (i = 0;i < m;i++)
			{
				if (f[i] == ans)
				{
					System.out.print(s[i]);
					System.out.print("\n");
					System.out.print("\n");
				}
			}
		}
		else
		{
			System.out.print("NO");
			System.out.print("\n");
		}
		return 0;
	}

}

