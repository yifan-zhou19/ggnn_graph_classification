package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zfc = new String(new char[1000]);
		String cs = new String(new char[1000]);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
	memset(zfc,0,1000);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
	memset(cs,0,1000);
	int y;
	int e = 0;
	int j = 0;
	int i = 0;
	zfc = new Scanner(System.in).nextLine();
		y = zfc.length();
	while (i < y)
	{
	e = 0;
	cs = tangible.StringFunctions.changeCharacter(cs, j, zfc.charAt(i));
	if (zfc.charAt(i) == ' ')
	{
	for (int a = i + 1;a < y;a++)
	{
	if (zfc.charAt(a) == ' ')
	{
	e++;
	continue;
	}
	else
	{
	break;
	}
	}
	i = i + e;
	}
	j++;
	i++;
	}
	cs = tangible.StringFunctions.changeCharacter(cs, j + 1, '\0');
	System.out.printf("%s",cs);
	return 0;
	}


}

