package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String zfc = new String(new char[1000]);
	String cs = new String(new char[1000]);
	int n;
	int e;
	int j = 0;
	int i = 0;
	int a;
	zfc = new Scanner(System.in).nextLine();
	n = zfc.length();
	while (i < n)
	{
		e = 0;
		cs = tangible.StringFunctions.changeCharacter(cs, j, zfc.charAt(i));
		if (zfc.charAt(i) == ' ')
		{
			for (a = i + 1;a < n;a++)
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
		cs = tangible.StringFunctions.changeCharacter(cs, j, '\0');
	System.out.printf("%s",cs);
	return 0;
	}


}

