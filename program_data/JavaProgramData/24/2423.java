package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String b = new String(new char[30]);
	String m1 = new String(new char[30]);
	String m2 = new String(new char[30]);
	int max = 0;
	int min = 40;
	for (int i = 0;;i++)
	{
	String tempVar = ConsoleInput.scanfRead(null, 1);
	if (tempVar != null)
	{
		b = tangible.StringFunctions.changeCharacter(b, i, tempVar);
	}
	if (b.charAt(i) == '\n' || b.charAt(i) == 0)
	{
		b = b.substring(0, i);
		if (i > max)
		{
			max = i;
			m1 = b;
		}
		if (i < min && i>0)
		{
			min = i;
			m2 = b;
		}
		break;
	}

	if (b.charAt(i) == ' ' || b.charAt(i) == ',')
	{
		b = b.substring(0, i);
		if (i > max)
		{
			max = i;
			m1 = b;
		}
		if (i < min && i>0)
		{
			min = i;
			m2 = b;
		}
		i = -1;
	}
	}
	System.out.printf("%s",m1);
	System.out.print("\n");
	System.out.printf("%s",m2);
	}

}

