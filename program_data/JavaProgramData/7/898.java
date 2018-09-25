package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[501]);
		String subs = new String(new char[501]);
		String rep = new String(new char[501]);
		int i;
		int j;
		int k;
		int len;
		int len1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			subs = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			rep = tempVar3.charAt(0);
		}
		i = 0;
		len = str.length();
		while (str.charAt(i) != '\0')
		{
			if (str.charAt(i) == subs.charAt(0))
			{
				len1 = subs.length();
				for (j = 0;j < len1;j++)
				{
				if (str.charAt(i + j) != subs.charAt(j))
				{
					break;
				}
				}
				if (j == len1)
				{
					for (k = 0;k < i;k++)
					{
					System.out.printf("%c",str.charAt(k));
					}
					System.out.printf("%s",rep);
					for (k = i + len1;k < len;k++)
					{
					System.out.printf("%c",str.charAt(k));
					}
					break;
				}
			}
			i++;
		}
		if (str.charAt(i) == '\0')
		{
		System.out.printf("%s",str);
		}
		return 0;
	}


}

