package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k = 0;
		int p;
	String zf = new String(new char[101]);
	String jg = new String(new char[101]);
	zf = new Scanner(System.in).nextLine();
	for (i = 0;zf.charAt(i) != '\0';i++)
	{
		if (zf.charAt(i) == ' ')
		{
		jg = tangible.StringFunctions.changeCharacter(jg, k, ' ');
		k++;
		j = i + 1;
		while (zf.charAt(j) == ' ')
		{
			j++;
		}
		i = j;
		}
		jg = tangible.StringFunctions.changeCharacter(jg, k, zf.charAt(i));
		k++;
	}
	jg = tangible.StringFunctions.changeCharacter(jg, k, '\0');
	System.out.printf("%s",jg);
	return 0;
	}

}

