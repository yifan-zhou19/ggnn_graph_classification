package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int a;
		int m;
		String s1 = new String(new char[300]);
		String s2 = new String(new char[300]);
		String s3 = new String(new char[300]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			s2 = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			s3 = tempVar3.charAt(0);
		}
		m = s1.length();
		a = s2.length();
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < a;j++)
			{
				if (s2.charAt(j) != s1.charAt(i + j))
				{
				break;
				}
			}
			if (j == a)
			{
				for (j = 0;j < a;j++)
				{
					s1 = tangible.StringFunctions.changeCharacter(s1, i + j, s3.charAt(j));
				}
				break;
			};
		}
		System.out.printf("%s",s1);
		return 0;
	}
}

