package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[50]);
		String b = new String(new char[50]);
		char c;
		int i;
		int j = 0;
		int l1;
		int l2;
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
		l1 = a.length();
		l2 = b.length();
		if (l1 != l2)
		{
			System.out.print("NO");
		}
		else if (l1 == l2)
		{
		for (j = 0;j < l1;j++)
		{
			for (i = j;i < l2;i++)
			{
			if (a.charAt(j) == b.charAt(i))
			{
				c = b.charAt(i);
			b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(j));
			b = tangible.StringFunctions.changeCharacter(b, j, c);
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
}

