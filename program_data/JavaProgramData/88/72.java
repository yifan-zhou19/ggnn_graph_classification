package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int j;
	int k;
	String a = new String(new char[31]);
	for (i = 0;i < 31;i++)
	{
	a = tangible.StringFunctions.changeCharacter(a, i, '\0');
	}
	a = new Scanner(System.in).nextLine();
	k = a.length();
	for (i = 0;i < k;i++)
	{
	for (j = i;j < k;j++)
	{
	if (a.charAt(j) >= '0' && a.charAt(j) <= '9' && a.charAt(j - 1) != '-')
	{
	System.out.printf("%c",a.charAt(j));
	a = tangible.StringFunctions.changeCharacter(a, j, '*');
	if (a.charAt(j + 1) < '0' || a.charAt(j + 1)>'9')
	{
	System.out.print("\n");
	break;
	}
	}
	}
	}
	}
}

