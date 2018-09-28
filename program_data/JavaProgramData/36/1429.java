package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String a = "";
		final String b = "";
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int la;
		int lb;
		int jieguo = 0;
		int jishu = 0;
		la = a.length();
		lb = b.length();
		if (la != lb)
		{
			jieguo = 0;
		}
		else
		{
			int i;
			int j;
			for (i = 0;i < la;i++)
			{
				for (j = 0;j < la;j++)
				{
					if (b.charAt(j) == a.charAt(i))
					{
						b = tangible.StringFunctions.changeCharacter(b, j, '\0');
						jishu++;
						break;
					}
				}
			}
			if (jishu == la)
			{
				jieguo = 1;
			}
		}
		if (jieguo == 1)
		{
			System.out.print("YES");
		}
		else
		{
			System.out.print("NO");
		}



		return 0;
	}
}

