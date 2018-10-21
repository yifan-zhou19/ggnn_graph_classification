package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String a = new String(new char[300]);
	String b = new String(new char[300]);
	int l;
	int i;
	int j;
	int k;
	int m;
	a = new Scanner(System.in).nextLine();
	l = a.length();
	for (i = 0,j = 0;i < l;i++,j++)
	{
	k = 0;
	b = tangible.StringFunctions.changeCharacter(b, j, a.charAt(i));
	if (a.charAt(i) == ' ')
	{
	for (m = i + 1;m < l;m++)
	{
	if (a.charAt(m) == ' ')
	{
	k++;
	}
	else
	{
	break;
	}
	}
	i = i + k;
	}
	}
	b = tangible.StringFunctions.changeCharacter(b, j, '\0');
	System.out.println(b);
	return 0;
	}
}

