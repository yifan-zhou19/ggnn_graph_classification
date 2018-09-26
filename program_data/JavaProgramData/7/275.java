package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[300]);
		String sub = new String(new char[300]);
		String re = new String(new char[300]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			sub = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			re = tempVar3.charAt(0);
		}
		int i;
		int j;
		int k;
		int first;
		int len = str.length();
		int len1 = sub.length();
		int len2 = re.length();
		first = 0;
		for (i = 0;i < len;i++)
		{
			if (str.charAt(i) == sub.charAt(0))
			{
				for (k = i,j = 0;j < len1;j++,k++)
				{
					if (str.charAt(k) != sub.charAt(j))
					{
						break;
					}
				}
			}
			if (j == len1)
			{
				first = i;
				break;
			}
		}
		if (j != len1)
		{
			System.out.printf("%s",str);
		}
		else
		{
			for (i = 0;i < first;i++)
			{
				System.out.printf("%c",str.charAt(i));
			}
			System.out.printf("%s",re);
			for (i = (first + len2);i < len;i++)
			{
				System.out.printf("%c",str.charAt(i));
			}
		}
		return 0;
	}
}

