package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int la;
		int lb;
		int min;
		char t;
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		la = a.length();
		lb = b.length();
		for (i = 0;i < la;i++)
		{
			min = i;
			for (j = i + 1;j < la;j++)
			{
				if (a.charAt(j) < a.charAt(min))
				{
					min = j;
				}
			}
			t = a.charAt(i);
			a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(min));
			a = tangible.StringFunctions.changeCharacter(a, min, t);
		}
		for (i = 0;i < lb;i++)
		{
			min = i;
			for (j = i + 1;j < lb;j++)
			{
				if (b.charAt(j) < b.charAt(min))
				{
					min = j;
				}
			}
			t = b.charAt(i);
			b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(min));
			b = tangible.StringFunctions.changeCharacter(b, min, t);
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

