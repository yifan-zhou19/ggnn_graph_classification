package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int j;
	j = 0;
	String zfc = new String(new char[31]);
	String jg = new String(new char[31]);
	zfc = new Scanner(System.in).nextLine();
	for (i = 0;zfc.charAt(i) != 0;i++)
	{
		if (zfc.charAt(i) >= '0' && zfc.charAt(i) <= '9')
		{
			jg = tangible.StringFunctions.changeCharacter(jg, j, zfc.charAt(i));
			if (zfc.charAt(i + 1) >= '0' && zfc.charAt(i + 1) <= '9')
			{
				j++;
				continue;
			}
			else
			{
				jg = jg.substring(0, j + 1);
				System.out.println(jg);
				j = 0;
			}
		}
	}
		return 0;
	}



}

