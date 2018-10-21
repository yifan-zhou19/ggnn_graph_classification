package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[256 * 2]);
		String sub = new String(new char[300]);
		String replacement = new String(new char[300]);
		String tmp = new String(new char[300]);
		int i;
		int j;
		int result = -1;
		int k;
		str = new Scanner(System.in).nextLine();
		sub = new Scanner(System.in).nextLine();
		replacement = new Scanner(System.in).nextLine();

		for (i = 0;i <= (int)(str.length() - sub.length());i++)
		{
			if (str.charAt(i) == sub.charAt(0))
			{
				for (j = 0;j < (int)sub.length();j++)
				{
					if (str.charAt(i + j) == sub.charAt(j))
					{
						result = i;
					}
					else
					{
						result = -1;
						break;
					}
				}
			}
			if (result != -1)
			{
				break;
			}
		}
		k = (int)replacement.length();
		if (result != -1)
		{
			tmp = (str.Substring(i) + j);
			(str.Substring(i)) = replacement;
			(str.Substring(i) + k) = tmp;
			System.out.printf("%s",str);
		}
		else
		{
			System.out.printf("%s",str);
		}
		return 0;
	}

}
