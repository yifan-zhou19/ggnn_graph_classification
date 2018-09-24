package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String a = new String(new char[1000]);
	int count = 1;
	int j;
	int k;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = tempVar.charAt(0);
	}
	for (j = 0;a.charAt(j) != '\0';j++)
	{
		if (a.charAt(j) >= 'a' && a.charAt(j) <= 'z')
		{
			a = tangible.StringFunctions.changeCharacter(a, j, a.charAt(j) + 'A'-'a');
		}
	}
	for (k = 0;a.charAt(k) != '\0';k++)
	{
		if (a.charAt(k) == a.charAt(k + 1))
		{
			count++;
		}
		else
		{
			System.out.printf("(%c,%d)",a.charAt(k),count);
			count = 1;
		}
	}
	return 0;
	}
}

