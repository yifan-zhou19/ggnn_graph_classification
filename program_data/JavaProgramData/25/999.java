package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] s = new int[50];
		int t = 0;
		s[0] = 2;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i = 0;
		int j = 0;
		if (n == 0)
		{
			System.out.print("1");
		}
		else
		{
			for (i = 0;i < n - 1;i++)
			{
				t = 0;
				for (j = 0;j < 50;j++)
				{
					s[j] = s[j] * 2;
					s[j] = s[j] + t;
					if (s[j] > 9)
					{
						s[j] = s[j] - 10;
						t = 1;
					}
					else
					{
						t = 0;
					}
				}

			}
			for (j = 49;j >= 0;j--)
			{
				if (s[j] > 0)
				{
					break;
				}
			}
			for (i = j;i >= 0;i--)
			{
				System.out.print(s[i]);
			}
		}

		return 0;
	}
}

