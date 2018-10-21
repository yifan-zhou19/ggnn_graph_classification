package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String s1 = new String(new char[50]);
		String s2 = new String(new char[50]);
		String s3 = new String(new char[50]);
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
		int l = s1.length();
		int i;
		int j;
		for (i = 0;i < 50;i++)
		{
			if (s2.charAt(i) == s1.charAt(0))
			{
				for (j = 0;j < l;j++)
				{
					s3 = tangible.StringFunctions.changeCharacter(s3, j, s2.charAt(i + j));
				}
				s3 = tangible.StringFunctions.changeCharacter(s3, l, '\0');
			}
			if (strcmp(s1,s3) == 0)
			{
				System.out.printf("%d",i);
				break;
			}
			else
			{
				continue;
			}
		}

	}

}

