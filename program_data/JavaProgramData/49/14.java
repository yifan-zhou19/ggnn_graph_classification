package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[500]);
		int n;
		int i;
		int j;
		int t;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		n = s.length();
		if (n % 2 == 0)
		{
			for (i = 1;i <= (n / 2);i++)
			{
				for (j = 0;j < (n - 2 * i + 1);j++)
				{
					t = 0;
					for (k = 0;k < i;k++)
					{
						if (s.charAt(j + k) == s.charAt(j + 2 * i - 1 - k))
						{
							t = t + 1;
						}
					}
					if (t == i)
					{
						for (k = j;k < j + 2 * i;k++)
						{
							System.out.printf("%c",s.charAt(k));
						}
						System.out.print("\n");
					}
				}
			}
			for (i = 1;i < ((n - 1) / 2);i++)
			{
				for (j = 0;j < (n - 2 * i + 1 + 1);j++)
				{
					t = 0;
					for (k = 0;k < ((2 * i + 1 - 1) / 2);k++)
					{
						if (s.charAt(j + k) == s.charAt(j + 2 * i + 1 - 1 - k))
						{
							t = t + 1;
						}
					}
					if (t == ((2 * i + 1 - 1) / 2))
					{
						for (k = j;k < j + 2 * i + 1;k++)
						{
							System.out.printf("%c",s.charAt(k));
						}
						System.out.print("\n");
					}
				}
			}
		}
		else
		{
			for (i = 1;i < (n / 2);i++)
			{
				for (j = 0;j < (n - 2 * i + 1);j++)
				{
					t = 0;
					for (k = 0;k < i;k++)
					{
						if (s.charAt(j + k) == s.charAt(j + 2 * i - 1 - k))
						{
							t = t + 1;
						}
					}
					if (t == i)
					{
						for (k = j;k < j + 2 * i;k++)
						{
							System.out.printf("%c",s.charAt(k));
						}
						System.out.print("\n");
					}
				}
			}
			for (i = 1;i <= ((n + 1) / 2);i++)
			{
				for (j = 0;j < (n - 2 * i + 1 + 1);j++)
				{
					t = 0;
					for (k = 0;k < ((2 * i + 1 - 1) / 2);k++)
					{
						if (s.charAt(j + k) == s.charAt(j + 2 * i + 1 - 1 - k))
						{
							t = t + 1;
						}
					}
					if (t == ((2 * i + 1 - 1) / 2))
					{
						for (k = j;k < j + 2 * i + 1;k++)
						{
							System.out.printf("%c",s.charAt(k));
						}
						System.out.print("\n");
					}
				}
			}
		}
		return 0;
	}
}

