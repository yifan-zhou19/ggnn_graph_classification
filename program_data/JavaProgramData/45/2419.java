package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[50]);
		String w = new String(new char[50]);
		int i;
		int j;
		int flag = 0;
		s = ConsoleInput.readToWhiteSpace(true).charAt(0);
		w = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int len = w.length();
		int lenS = s.length();
		for (i = 0 ; i < len ; i++)
		{
			if (s.charAt(0) == w.charAt(i))
			{
				for (j = 0 ; j < lenS ; j++)
				{
					if (s.charAt(j) != w.charAt(i + j))
					{
						break;
					}
				}
				if (j == lenS)
				{
					System.out.print(i);
					return 0;
				}
				else
				{
					continue;
				}
			}
		}
		return 0;
	}
}

