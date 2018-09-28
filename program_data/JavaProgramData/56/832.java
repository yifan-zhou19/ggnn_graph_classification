package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	String a = new String(new char[6]);
	int i;
	int n;
	for (i = 0;i < 6;i++)
	{
	String tempVar = ConsoleInput.scanfRead(null, 1);
	if (tempVar != null)
	{
		a = tangible.StringFunctions.changeCharacter(a, i, tempVar);
	}
	if (a.charAt(i) == '\n')
	{
	i--;
	n = i;
	break;
	}
	}
	for (i = n;i >= 0;i--)
	{
	System.out.printf("%c",a.charAt(i));
	}
	System.out.print("\n");
	}
}

