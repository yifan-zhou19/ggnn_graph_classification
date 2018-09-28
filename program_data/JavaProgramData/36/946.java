package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		char t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead("  ");
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		int l1 = a.length();
		int l2 = b.length();
		int i = 0;
		int j = 0;
		for (i = 0;i < l1;i++)
		{
			for (j = 0;j < l2;j++)
			{
			   if (a.charAt(i) == b.charAt(j))
			   {
				   t = b.charAt(j);
				   b = tangible.StringFunctions.changeCharacter(b, j, b.charAt(i));
				   b = tangible.StringFunctions.changeCharacter(b, i, t);
			   }
			}
		}
		if (strcmp(a,b) == 0)
		{
			System.out.print("YES");
		}
		else
		{
			System.out.print("NO");
		}
	}
}

