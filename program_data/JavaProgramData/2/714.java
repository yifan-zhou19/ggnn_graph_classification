package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int[] x = new int[1000];
		int[] a = new int[26];
		int b;
		int c;
		int num = 0;
		char[][] s = new char[1000][26];
		for (i = 0;i < 25;i++)
		{
			a[i] = 0;
		}
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			x[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			s[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			for (j = 0;s[i][j] != '\0';j++)
			{
				a[(int)s[i][j] - 65]++;
			}
		}
		b = a[0];
		c = 0;
		for (i = 1;i < 26;i++)
		{
			if (b < a[i])
			{
				b = a[i];
				c = i;
			}
		}
		System.out.print((char)(c + 65));
		System.out.print("\n");
		for (i = 0;i < n;i++)
		{
			for (j = 0;s[i][j] != '\0';j++)
			{
				if (s[i][j] == (char)c + 65)
				{
					num++;
				}
			}
		}
		System.out.print(num);
		System.out.print("\n");
		for (i = 0;i < n;i++)
		{
			for (j = 0;s[i][j] != '\0';j++)
			{
				if (s[i][j] == (char)c + 65)
				{
					System.out.print(x[i]);
					System.out.print("\n");
					break;
				}
			}
		}
		return 0;
	}
}

