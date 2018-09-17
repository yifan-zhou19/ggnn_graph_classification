package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String s = "\0";
		int i;
		int j;
		int n = 0;
		int l;
		int[] a = {'0', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		s = new Scanner(System.in).nextLine();
		l = s.length();
		for (i = 0; i < l; i++)
		{
			for (j = 65; j <= 90; j++)
			{
				if (s.charAt(i) == j)
				{
					a[j - 65] = a[j - 65] + 1;
					n = n + 1;
				}
				else
				{
					;
				}
			}
			for (j = 97; j <= 122; j++)
			{
				if (s.charAt(i) == j)
				{
					a[j - 71] = a[j - 71] + 1;
					n = n + 1;
				}
				else
				{
					;
				}
			}
		}
		a[0] = a[0] - 48;
		if (n != 0)
		{
			for (i = 0; i < 26; i++)
			{
				if (a[i] != 0)
				{
					System.out.printf("%c=%d\n", i + 65, a[i]);
				}
				else
				{
					;
				}
			}
			for (i = 26; i < 52; i++)
			{
				if (a[i] != 0)
				{
					System.out.printf("%c=%d\n", i + 71, a[i]);
				}
				else
				{
					;
				}
			}
		}
		else
		{
			System.out.print("No");
		}
		return 0;
	}
}
