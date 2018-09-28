package <missing>;

public class GlobalMembers
{
	public static int max(char a, String[] b, int l)
	{
		int i;
		 for (i = 0;i <= l - 1;i++)
		 {
		 if (b[0][i].equals(a) && b[1][i].equals('\0'))
		 {
			 b[1][i] = 1;
		 return 1;
		 break;
		 }
		 }
		 return 0;
	}
	public static int Main()
	{
		int l;
		int i;
		String a = new String(new char[50]);
		final String b = "";
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tangible.StringFunctions.changeCharacter(b, 0, tempVar2);
		}
		l = a.length();
		if (l != String.valueOf(b.charAt(0)).length())
		{
		System.out.print("NO");
		}
		else
		{
			for (i = 0;i <= l - 1;i++)
			{
			if (max(a.charAt(i), b, l) == 0)
			{
			break;
			}
			}

			if (i == l)
			{
			System.out.print("YES");
			}
			else
			{
			System.out.print("NO");
			}
		}
		return 0;
	}

}

