package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s1 = new String(new char[10000]);
		String s2 = new String(new char[10000]);
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
		int i;
		int len1 = s1.length();
		int len2 = s2.length();
		if (len1 != len2)
		{
			System.out.print("NO\n");
		}
		else
		{
			int i;
			int j;
			for (i = 0;i < len1;i++)
			{
				for (j = 0;j < len1;j++)
				{
					if (s1.charAt(i) == s2.charAt(j))
					{
						s2 = tangible.StringFunctions.changeCharacter(s2, j, ' ');
						break;
					}
				}
			}
			j = 0;
			for (i = 0;i < len2;i++)
			{
				if (s2.charAt(i) != ' ')
				{
					j++;
				}
			}
			if (j == 0)
			{
				System.out.print("YES\n");
			}
			else
			{
				System.out.print("NO\n");
			}
		}
	}
}

