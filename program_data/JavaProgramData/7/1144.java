package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[256]);
		String b = new String(new char[256]);
		String c = new String(new char[256]);
		int len1;
		int len2;
		int len3;
		int i;
		int j;
		int sum = 0;
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
			if (a.charAt(i) == b.charAt(0))
			{
					sum = 0;
					for (j = 0;j < len2;j++)
					{
					if (a.charAt(i + j) == b.charAt(j))
					{
						sum++;
					}
					}
				if (sum == len2)
				{
					for (j = 0;j < len3;j++)
					{
						a = tangible.StringFunctions.changeCharacter(a, i + j, c.charAt(j));
					}
					break;
				}
			}
		}
		System.out.printf("%s",a);
	}
}

