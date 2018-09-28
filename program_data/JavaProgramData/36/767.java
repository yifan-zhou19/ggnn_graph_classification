package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int flag = 1;
		String a = new String(new char[100]);
		String b = new String(new char[100]);
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
		for (i = 0;i < a.length();i++)
		{
			for (j = 0;j < b.length();j++)
			{
			   if (a.charAt(i) == b.charAt(j))
			   {
				   a = tangible.StringFunctions.changeCharacter(a, i, ' ');
				   b = tangible.StringFunctions.changeCharacter(b, j, ' ');
			   }
			}
		}
		for (i = 0;i < a.length();i++)
		{
			if (a.charAt(i) != ' ')
			{
				flag = 0;
				break;
			}
		}
		for (j = 0;j < b.length();j++)
		{
			if (b.charAt(j) != ' ')
			{
				flag = 0;
				break;
			}
		}
		if (flag != 0)
		{
			System.out.print("YES\n");
		}
		else
		{
			System.out.print("NO\n");
		}
		return 0;
	}
}

