package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[300]);
		String subStr = new String(new char[10]);
		String re = new String(new char[10]);
		int i;
		int j;
		int lenth;
		int m;
		int n;
		int flag = 0;
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		subStr = ConsoleInput.readToWhiteSpace(true).charAt(0);
		re = ConsoleInput.readToWhiteSpace(true).charAt(0);
		lenth = str.length();
		n = subStr.length();
		m = re.length();
		for (i = 0; i < lenth; i++)
		{
			j = 0;
			if (str.charAt(i) == subStr.charAt(j))
			{
				for (j = 0; j < n; j++)
				{
					if (str.charAt(i) == subStr.charAt(j))
					{
						i++;
					}
					else
					{
						break;
					}
				}
			}
			if (j == n)
			{
				flag = 1;
				for (; j > 0; i--, j--)
				{
					str = tangible.StringFunctions.changeCharacter(str, i - 1, re.charAt(j - 1));
				}
			}
			if (flag == 1)
			{
				break;
			}
		}
		System.out.print(str);
		return 0;
	}





}

