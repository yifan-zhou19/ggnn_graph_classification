package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int x;
	int y = 0;
	String a = new String(new char[999]);
	a = new Scanner(System.in).nextLine();
	for (;a.charAt(y) != '\0';y++)
	{
	x = 1;
	for (;;y++)
	{
	if (a.charAt(y) == a.charAt(y + 1) || (a.charAt(y) - a.charAt(y + 1)) == ('A'-'a') || (a.charAt(y + 1) - a.charAt(y)) == ('A'-'a'))
	{
	x++;
	}
	else
	{
	break;
	}
	}
	if (a.charAt(y) < 'Z')
	{
	System.out.printf("(%c,%d)",a.charAt(y),x);
	}
	else
	{
	System.out.printf("(%c,%d)",(a.charAt(y) + 'A'-'a'),x);
	}
	}

	}

}
