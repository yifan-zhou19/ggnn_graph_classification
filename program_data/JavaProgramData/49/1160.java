package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[501]);
		int l;
		int cnt;

		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		l = str.length();
		for (int i = 2; i <= l; i++)
		{
			for (int j = 0; j <= l - i; j++)
			{
				cnt = 0;
				for (int k = 0; k <= i - 1; k++)
				{
					if (str.charAt(j + k) == str.charAt(j + i - 1 - k))
					{
						cnt++;
					}
				}
				if (cnt == i)
				{
					for (int k = j; k <= j + i - 2; k++)
					{
						System.out.print(str.charAt(k));
					}
					System.out.print(str.charAt(j + i - 1));
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

