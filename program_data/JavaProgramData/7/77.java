package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[257]);
		String a = new String(new char[257]);
		String b = new String(new char[257]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b = tempVar3.charAt(0);
		}
		int i = 0;
		int j = 0;
		int find = 0;
		for (i = 0;s.charAt(i) != '\0';i++)
		{
			if (s.charAt(i) == a.charAt(0))
			{

				for (j = 0;a.charAt(j) != '\0';j++)
				{
					//printf("%d",i + j);
					if (a.charAt(j) != s.charAt(i + j))
					{
						find = 0;
						break;
					}
				}
				if (a.charAt(j) == '\0')
				{
					find = 1;
				}
			}
			if (find == 1)
			{
				break;
			}
		}
		if (find != 0)
		{
			for (j = 0;b.charAt(j) != '\0';j++)
			{
			s = tangible.StringFunctions.changeCharacter(s, i + j, b.charAt(j));
			}
		}
		System.out.printf("%s",s);
		return 0;
	}
}

