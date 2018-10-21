package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String t = new String(new char[150]);
	String x = new String(new char[150]);
	t = new Scanner(System.in).nextLine();
	int i;
	int j;
	for (i = 0,j = 0;t.charAt(i) != '\0';i++,j++)
	{
		if ((t.charAt(i) != ' ') || ((t[i] = ' ') && (t.charAt(i - 1) != ' ')))
		{
			x = tangible.StringFunctions.changeCharacter(x, j, t.charAt(i));
		}
		else
		{
			j--;
		}
	}
	x = tangible.StringFunctions.changeCharacter(x, j, '\0');
	System.out.printf("%s",x);
	return 0;
	}
}

