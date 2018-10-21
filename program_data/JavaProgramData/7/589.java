package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[257]);
		String s = new String(new char[257]);
		String r = new String(new char[257]);
		int len1;
		int len2;
		int len3;
		int i;
		int j;
		int k;
		int c;
		int flag = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			r = tempVar3.charAt(0);
		}
		len1 = str.length();
		len2 = s.length();
		len3 = r.length();
		j = 0;
		while (str.charAt(j) != '\0')
		{
			if (str.charAt(j) == s.charAt(0))
			{
				c = j;
				for (i = 0;i < len2;i++)
				{
					if (str.charAt(j + i) != s.charAt(i))
					{
						flag = 0;
						break;
					}
				}
					if (i == len2)
					{
						flag = 1;
						break;
					}
			}
					j++;
		}
				if (flag != 0)
				{
					for (k = 0;k < c;k++)
					{
					System.out.printf("%c",str.charAt(k));
					}
					System.out.printf("%s",r);
					for (k = c + len2;k < len1;k++)
					{
					System.out.printf("%c",str.charAt(k));
					}
				}
				else
				{
				System.out.printf("%s",str);
				}
				return 0;
	}

}

