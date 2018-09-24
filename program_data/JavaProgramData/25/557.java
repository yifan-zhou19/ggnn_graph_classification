package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int ans = 2;
		int i;
		int k = 0;
		int p;
		String num = new String(new char[1000]);
		int[] m = new int[1000];
		int[] result = new int[1000];

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n == 0)
		{
			System.out.print("1");
			System.out.print("\n");
		}
		else if (n < 31)
		{
			for (i = 1;i < n;i++)
			{
				ans = ans * 2;
			}
			System.out.print(ans);
			System.out.print("\n");
		}
		else
		{
			for (i = 1;i < 30;i++)
			{
				ans = ans * 2;
			}
			for (int y = 0;y < 1000;y++)
			{
				num = tangible.StringFunctions.changeCharacter(num, k++, ans % 10);
				ans = ans / 10;
			}
			for (int l = 30;l < n;l++)
			{
				for (i = 0;i < 1000;i++)
				{
					result[i] = 0;
				}

				for (i = 0;i < 1000;i++)
				{
					result[i] = result[i] + num.charAt(i) * 2;
					if (result[i] >= 10)
					{
						result[i] = result[i] % 10;
						result[i + 1] += 1;
					}
				}
				for (i = 0;i < 1000;i++)
				{
					num = tangible.StringFunctions.changeCharacter(num, i, result[i]);
				}

			}
			for (i = 999;i >= 0;i--)
			{
				if (result[i] != 0)
				{
					p = i;
					break;
				}
			}
			for (i = p;i >= 0;i--)
			{
				System.out.print(result[i]);
			}
		}

		return 0;
	}
}

