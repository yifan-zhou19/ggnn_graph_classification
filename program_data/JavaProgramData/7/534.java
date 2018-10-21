package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String string = new String(new char[256]);
		String substr = new String(new char[256]);
		String replace = new String(new char[256]);
		int i;
		int j;
		int k;
		int len;
		int len1;
		int len2;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			String = tempVar;
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			substr = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			replace = tempVar3.charAt(0);
		}
		len1 = String.length();
		len2 = substr.length();
		for (i = 0;i < len1;i++)
		{
			if (substr.charAt(0) == string.charAt(i))
			{
				len = 0;
				for (j = 0;j < len2;j++)
				{
					if ((substr.charAt(j) == string.charAt(i + j)) && len < len2)
					{
						len++;
					}
				}
				if (len == len2)
				{
					for (k = 0;k < i;k++)
					{
						System.out.printf("%c",string.charAt(k));
					}
					System.out.printf("%s",replace);
					for (k = i + len2;k < len1;k++)
					{
						System.out.printf("%c",string.charAt(k));
					}
					m = 1;
				}
			}
			if (m == 1)
			{
				break;
			}
		}
		if (m != 1)
		{
			System.out.printf("%s",String);
		}
		return 0;
	}

}

