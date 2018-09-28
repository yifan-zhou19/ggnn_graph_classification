package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String b = new String(new char[33]);
	String a = new String(new char[22]);
	String z = new String(new char[22]);
	String q = new String(new char[1]);
	int i;
	int j;
	int l;
	int n = 0;
	b = new Scanner(System.in).nextLine();
	for (i = 0,j = 0;b.charAt(i) != ' ';i++,j++)
	{
	a = tangible.StringFunctions.changeCharacter(a, j, b.charAt(i));
	}
	for (i = j + 1,l = 0;b.charAt(i) != '\0';i++,l++)
	{
	z = tangible.StringFunctions.changeCharacter(z, l, b.charAt(i));
	}
	z.charAt(l) == '\0';
	for (l = 0;z.charAt(l) != '\0';l++)
	{
		if (z.charAt(l) == a.charAt(0) && z.charAt(l + 1) == a.charAt(1))
		{
		break;
		}
		n++;
	}
	System.out.printf("%d",n);
	return 0;
	}
}

