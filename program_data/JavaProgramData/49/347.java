package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[502]);
		int l = 0;
		int k = 0;
		int ii = 0;
		int m = 0;
		int step = 0;
		int num = 0;
		int flag = 0;
		int i = 0;
		int j = 0;
		s = ConsoleInput.readToWhiteSpace(true).charAt(0);
		l = s.length();
		for (j = 2;j <= l;j++) //j?????
		{
			for (i = 0;i <= l - j;i++) //i??????
			{
				flag = 1;
				for (ii = 1;ii <= j / 2;ii++)
				{
					k = i + j - ii;
					if (s.charAt(i + ii - 1) != s.charAt(k))
					{
						flag = 0;
						break;
					}
				}
				if (flag == 1)
				{
					for (ii = i;ii <= i + j - 1;ii++)
					{
						System.out.print(s.charAt(ii));
					}
					System.out.print("\n");
				}
			}
		}
		return 0;
	}

}

