package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[300]);
		String subString = new String(new char[300]);
		String replacement = new String(new char[300]);
		String p;
		String q;
		int strLen;
		int subLen;
		int repLen;
		int move;
		int i;
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		subString = ConsoleInput.readToWhiteSpace(true).charAt(0);
		replacement = ConsoleInput.readToWhiteSpace(true).charAt(0);
		strLen = str.length();
		subLen = subString.length();
		repLen = replacement.length();
		p = tangible.StringFunctions.strStr(str, subString);
		if (p == null)
		{
			System.out.print(str);
			return 0;
		}
		q = replacement;
		if (repLen > subLen)
		{
			move = repLen - subLen;
			for (q = str.Substring(strLen) + move; q >= p.Substring(repLen); q--)
			{
				q = *(q - move);
			}
			i = 0;
			q = replacement;
			while (i < repLen)
			{
				p ++= q++;
				i++;
			}
		}
		else if (repLen == subLen)
		{
			i = 0;
			while (i < repLen)
			{
				p ++= q++;
				i++;
			}
		}
		else
		{
			i = 0;
			while (i < repLen)
			{
				p ++= q++;
				i++;
			}
			move = subLen - repLen;
			while (*(p.Substring(move)) != '\0')
			{
				p ++= *(p.Substring(move));
			}
			p = '\0';
		}
		System.out.print(str);
		System.out.print("\n");
		return 0;
	}

}

