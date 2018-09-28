package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String s1 = new String(new char[100]);
		String s2 = new String(new char[100]);
		int i;
		int j;
		int c;
		int d;
		char t;
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
		c = s1.length();
		d = s2.length();
		for (i = 0;i < c;i++)
		{
			for (j = c - 1;j >= i + 1;j--)
			{
			if (s1.charAt(j) < s1.charAt(j - 1))
			{
			t = s1.charAt(j);
			s1 = tangible.StringFunctions.changeCharacter(s1, j, s1.charAt(j - 1));
			s1 = tangible.StringFunctions.changeCharacter(s1, j - 1, t);
			}
			}
		}
		for (i = 0;i < d;i++)
		{
			for (j = d - 1;j >= i + 1;j--)
			{
			if (s2.charAt(j) < s2.charAt(j - 1))
			{
			t = s2.charAt(j);
			s2 = tangible.StringFunctions.changeCharacter(s2, j, s2.charAt(j - 1));
			s2 = tangible.StringFunctions.changeCharacter(s2, j - 1, t);
			}
			}
		}
		if (strcmp(s1,s2) == 0)
		{
			System.out.print("YES");
		}
		else
		{
			System.out.print("NO");
		}





	}



}

