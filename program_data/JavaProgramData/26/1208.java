package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String sz = new String(new char[101]);
	int a;
	int b;
	sz = new Scanner(System.in).nextLine();
	for (a = 0;sz.charAt(a) != '\0';a++)
	{
	while (true)
	{
	if ((sz.charAt(a) == ' ') && (sz.charAt(a + 1) == ' '))
	{
	for (b = a + 1;sz.charAt(b) != '\0';b++)
	{
	sz = tangible.StringFunctions.changeCharacter(sz, b, sz.charAt(b + 1));
	}
	}
	else
	{
	break;
	}
	}
	}
	System.out.println(sz);
	return 0;
	}
}

