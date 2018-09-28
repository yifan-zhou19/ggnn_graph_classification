package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String a = new String(new char[10000]);
	String b = new String(new char[10000]);
	char tem;
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
	for (int i = a.length() - 1;i >= 0;i--)
	{
		for (int j = 0;j < i;j++)
		{
			if (a.charAt(j) > a.charAt(j + 1))
			{
			tem = a.charAt(j);
			a = tangible.StringFunctions.changeCharacter(a, j, a.charAt(j + 1));
			a = tangible.StringFunctions.changeCharacter(a, j + 1, tem);
			}
		}
	}
	for (int i = b.length() - 1;i >= 0;i--)
	{
		for (int j = 0;j < i;j++)
		{
			if (b.charAt(j) > b.charAt(j + 1))
			{
			tem = b.charAt(j);
			b = tangible.StringFunctions.changeCharacter(b, j, b.charAt(j + 1));
			b = tangible.StringFunctions.changeCharacter(b, j + 1, tem);
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

