package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[505]);
		int i;
		int j;
		int l;
		s = ConsoleInput.readToWhiteSpace(true).charAt(0);
		l = s.length();
		for (i = 2; i <= l; i++)
		{
			for (j = 0; j <= l - i; j++)
			{
				int t = i / 2;
				int k;
				for (k = 0; k < t; k++)
				{
					if (s.charAt(j + k) != s.charAt(j + i - k - 1))
					{
						break;
					}
				}
				if (k >= t)
				{
					for (int m = j; m < j + i; m++)
					{
						System.out.print(s.charAt(m));
					}
					System.out.print("\n");
				}
			}
		}


		return 0;
	}

}

