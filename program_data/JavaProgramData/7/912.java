package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[257]);
		String b = new String(new char[257]);
		String c = new String(new char[257]);
		int i;
		int k = 0;
		int j;
		int len1;
		int len2;
		int len3;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			c = tempVar3.charAt(0);
		}
		len1 = a.length();
			len2 = b.length();
	len3 = c.length();
		for (i = 0;i < len1;i++)
		{
			for (j = 0;j < len2;j++)
			{
				if (a.charAt(i + j) == b.charAt(j))
				{
					k++;
				}

			}
			if (k == len2)
			{
					break;
			}
	k = 0;
		}
	if (k == len2)
	{
		for (j = 0;j < i;j++)
		{
		System.out.printf("%c",a.charAt(j));
		}
	for (j = 0;j < len3;j++)
	{
		System.out.printf("%c",c.charAt(j));
	}
	for (j = i + len2;j < len1;j++)
	{
		System.out.printf("%c",a.charAt(j));
	}
	}
	if (k != len2)
	{
		System.out.printf("%s",a);
	}
	return 0;
	}

}

