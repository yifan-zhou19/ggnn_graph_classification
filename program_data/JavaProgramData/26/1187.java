package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String a = new String(new char[1000]);
	int i;
	int k;
	int j = 0;
	int n;
	int m = 0;
	a = new Scanner(System.in).nextLine();
	while (true)
	{
	for (i = 0;a.charAt(i) != '\0';i++)
	{
	if (a.charAt(i) == ' ' && a.charAt(i + 1) == ' ')
	{
	for (k = i;a.charAt(k) != '\0';k++)
	{
	a = tangible.StringFunctions.changeCharacter(a, k, a.charAt(k + 1));
	}
	}
	}
	j = 0;
	for (m = 0;a.charAt(m) != '\0';m++)
	{
	if (a.charAt(m) == ' ')
	{
	if (a.charAt(m + 1) == ' ')
	{
		j++;
	}
	}
	}
	if (j == 0)
	{
		break;
	}
	}
	System.out.println(a);
	return 0;
	}


}

