package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i = 1;
		int j = 1;
		int l = 1;
		int g = 1;
	char a;
	String x = new String(new char[300]);
	String y = new String(new char[300]);
	x = tangible.StringFunctions.changeCharacter(x, 0, 'q');
	y = tangible.StringFunctions.changeCharacter(y, 0, 'o');
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	System.in.read();
	for (i = 1;i <= n;i++)
	{
		for (j = 1;j <= 300;j++)
		{
		String tempVar2 = ConsoleInput.scanfRead(null, 1);
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
	x = tangible.StringFunctions.changeCharacter(x, j, a);
	if (a == '\n')
	{
		break;
	}
		}
	for (g = 1;g <= 300;g++)
	{
		switch (x.charAt(g))
		{
		case'A':
		y = tangible.StringFunctions.changeCharacter(y, g, 'T');
		break;
		case'T':
		y = tangible.StringFunctions.changeCharacter(y, g, 'A');
		break;
		case'C':
		y = tangible.StringFunctions.changeCharacter(y, g, 'G');
		break;
		case'G':
		y = tangible.StringFunctions.changeCharacter(y, g, 'C');
		break;
		}
	}
	for (l = 1;l <= j - 1;l++)
	{
		System.out.printf("%c",y.charAt(l));
	}
	System.out.print("\n");
	}

	return 0;
	}
}

