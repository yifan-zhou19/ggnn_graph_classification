package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s1 = new String(new char[256]);
		String s2 = new String(new char[256]);
		String s3 = new String(new char[256]);
		int i;
		int j;
		int length1;
		int length2;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s2 = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			s3 = tempVar3.charAt(0);
		}
		length1 = s1.length();
		length2 = s2.length();
		for (i = 0;i < length1;i++)
		{
			j = 0;
			for (;j < length2 && s1.charAt(i) == s2.charAt(j);j++)
			{
					i++;
			}
			if (j == length2)
			{
				for (k = 0;k < length2;k++)
				{
				s1 = tangible.StringFunctions.changeCharacter(s1, i - j + k, s3.charAt(k));
				}
				break;
			}
		}
		System.out.printf("%s",s1);
		return 0;
	}
}

