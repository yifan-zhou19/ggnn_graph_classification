package <missing>;

public class GlobalMembers
{
	public static String t = new String(new char[200]);
	public static int Main()
	{
	int s;
	int i;
	int j;
	int n;
	int l;
	t = new Scanner(System.in).nextLine();
	l = t.length();
	for (i = 0;i < 200;i++)
	{
	for (j = 0;j < l;j++)
	{
	if (t.charAt(j) == ' ' && t.charAt(j + 1) == ' ')
	{
	for (s = j;s < l;s++)
	{
	t = tangible.StringFunctions.changeCharacter(t, s, t.charAt(s + 1));
	}
	}
	}
	}
	System.out.println(t);
	return 0;
	}
}

