package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s1 = new String(new char[100]);
		String s2 = new String(new char[100]);
		char temp;
		char a;
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
		int j;
		int k = 0;
		int l;
		int m;
		int n;
		m = s1.length();
		n = s2.length();
		for (i = 0;i < n;i++)
		{
			k = 0;
			for (j = 0;j < m;j++)
			{
				if (s1.charAt(j) != s2.charAt(j))
				{
					k = 1;
					break;
				}
			}
			if (k == 0)
			{
				System.out.printf("%d\n",i);
				break;
			}
			else
			{
				a = s2.charAt(0);
				for (l = 0;l < n - 1;l++)
				{
					temp = s2.charAt(l);
					s2 = tangible.StringFunctions.changeCharacter(s2, l, s2.charAt(l + 1));
					s2 = tangible.StringFunctions.changeCharacter(s2, l + 1, temp);
				}
				s2 = tangible.StringFunctions.changeCharacter(s2, n - 1, a);
			}
		}
		return 0;
	}


}

