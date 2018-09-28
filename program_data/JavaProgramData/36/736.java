package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s1 = new String(new char[100]);
		String s2 = new String(new char[100]);
		int l1;
		int l2;
		int i;
		int n = 0;
		int j;
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
		l1 = s1.length();
		l2 = s2.length();
		for (i = 0;i < l1;i++)
		{
			for (j = 0;j < 12;j++)
			{
				if (s1.charAt(i) == s2.charAt(j))
				{
				   n++;
				   s2 = tangible.StringFunctions.changeCharacter(s2, j, '\0');
				   break;

				}
			}
		}
		if (l1 == l2 && n == l1)
		{
			System.out.print("YES\n");
		}
		else
		{
			System.out.print("NO\n");
		}



	}

}

