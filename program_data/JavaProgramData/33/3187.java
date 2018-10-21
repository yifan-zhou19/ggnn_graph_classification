package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int len;
		int sum = 0;
		String a = new String(new char[300]);
		String b = new String(new char[300]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (j = 0;j < n;j++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a = tempVar2.charAt(0);
	}
			for (i = 0;a.charAt(i) != '\0';i++)
			{
		if (a.charAt(i) == 'A')
		{
			a = tangible.StringFunctions.changeCharacter(a, i, 'T');
		}
		else if (a.charAt(i) == 'T')
		{
			a = tangible.StringFunctions.changeCharacter(a, i, 'A');
		}
			else if (a.charAt(i) == 'C')
			{
			a = tangible.StringFunctions.changeCharacter(a, i, 'G');
			}
				else if (a.charAt(i) == 'G')
				{
			a = tangible.StringFunctions.changeCharacter(a, i, 'C');
				}
			}
			System.out.printf("%s\n",a);
	}
		return 0;
	}
}

