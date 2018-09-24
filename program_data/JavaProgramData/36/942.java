package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str1 = new String(new char[101]);
		String str2 = new String(new char[101]);
		int i;
		int j;
		int len1;
		int len2;
		str1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		str2 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		len1 = str1.length();
		len2 = str2.length();
		if (len1 != len2)
		{
			System.out.print("NO");
			return 0;
		}
		for (i = 0;i < len1;i++)
		{
			for (j = 0;j < len2;j++)
			{
				if (str1.charAt(i) == str2.charAt(j))
				{
					str2 = str2.substring(0, j);
					break;
				}
			}
			if (j == len2)
			{
				System.out.print("NO");
				return 0;
			}
		}
		System.out.print("YES");
		return 0;
	}
}

