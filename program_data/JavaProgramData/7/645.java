package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int ls1;
		int ls2;
		int ls3;
		int i;
		int j = 0;
		int m;
		int lans = 0;
		int z = 0;
		String s1 = new String(new char[100]);
		String s2 = new String(new char[100]);
		String s3 = new String(new char[100]);
		String ans = new String(new char[100]);
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
		ls1 = s1.length();
		ls2 = s2.length();
		ls3 = s3.length();
		for (i = 0;i < ls1;i++)
		{

			if (s1.charAt(i) != s2.charAt(0))
			{
				ans = tangible.StringFunctions.changeCharacter(ans, lans++, s1.charAt(i));
			}
			else
			{
				for (j = 0,m = i;j < ls2;j++,m++)
				{
				if (s1.charAt(m) != s2.charAt(j))
				{
					break;
				}
				}
			if (j == ls2 && z != 1)
			{
				i = m - 1;
				for (j = 0;j < ls3;j++)
				{
					ans = tangible.StringFunctions.changeCharacter(ans, lans++, s3.charAt(j));
				}
				z++;
			}
				else
				{
					for (;i <= m;i++)
					{
					ans = tangible.StringFunctions.changeCharacter(ans, lans++, s1.charAt(i));
					}
					i--;
				}

			}
		}
				ans = tangible.StringFunctions.changeCharacter(ans, lans, '\0');
				System.out.printf("%s",ans);
		return 0;
	}
}

