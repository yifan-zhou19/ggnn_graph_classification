package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[200]);
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		char[][] s_ = new char[200][200];
		String s__ = new String(new char[200]);
		int i;
		int n = 0;
		int m;
		int j = 0;
		int p = 0;
		s = new Scanner(System.in).nextLine();
		for (i = 0;s.charAt(i) != '\0';i++)
		{
			s__ = tangible.StringFunctions.changeCharacter(s__, i, s.charAt(i));
		}
		s__ = tangible.StringFunctions.changeCharacter(s__, i, ' ');
		s__ = tangible.StringFunctions.changeCharacter(s__, i + 1, '\0');
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
		for (i = 0;s__.charAt(i) != '\0';i++)
		{
			n++;
		}
		for (i = 0;i < n;i++)
		{
			if (s__.charAt(i) == ' ')
			{
				s_[j][p] = '\0';
				j++;
				p = 0;
			}
			else
			{
				s_[j][p] = s__.charAt(i);
				p++;
			}
		}
		m = j;
		for (j = 0;j < m - 1;j++)
		{
			if (strcmp(s_[j],a) == 0)
			{
				System.out.printf("%s ",b);
			}
			else
			{
				System.out.printf("%s ",s_[j]);
			}
		}
		if (strcmp(s_[m - 1],a) == 0)
		{
			System.out.printf("%s",b);
		}
		else
		{
			System.out.printf("%s",s_[j]);
		}
		return 0;
	}
}

