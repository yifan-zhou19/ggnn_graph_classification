package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String N = new String(new char[101]);
		String s = new String(new char[100]);
		int i;
		int p;
		int j = 0;
		int ys = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = tempVar.charAt(0);
		}

		if (N.length() == 1)
		{
			System.out.printf("0\n%s",N);
			return 0;
		}


		for (i = 0;i < N.length() - 1;i++)
		{
			if (i == 0)
			{
				p = (N.charAt(i) - '0') * 10 + N.charAt(i + 1) - '0';
			}
			else
			{
				p = ys * 10 + N.charAt(i + 1) - '0';
			}
			ys = p % 13;
			if (i == 0 && p / 13 == 0)
			{
				continue;
			}
			s = tangible.StringFunctions.changeCharacter(s, j, p / 13 + '0');
			j++;
		}
		s = tangible.StringFunctions.changeCharacter(s, j, '\0');
		if (j == 0)
		{
			s = tangible.StringFunctions.changeCharacter(s, 0, '0');
			s = tangible.StringFunctions.changeCharacter(s, 1, '\0');
		}
		System.out.printf("%s\n%d",s,ys);
		return 0;
	}

}

