package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int j;
	String a = new String(new char[81]);
	String b = new String(new char[81]);
	a = new Scanner(System.in).nextLine();
	b = new Scanner(System.in).nextLine();
	for (i = 0;a.charAt(i) != '\n';i++)
	{
	if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z')
	{
	a.charAt(i) += 'A'-'a';
	}
	}
	for (j = 0;b.charAt(j) != '\n';j++)
	{
	if (b.charAt(j) >= 'a' && b.charAt(j) <= 'z')
	{
	b.charAt(j) += 'A'-'a';
	}
	}
	if (strcmp(a,b) < 0)
	{
	System.out.print("<");
	}
	else if (strcmp(a,b) > 0)
	{
	System.out.print(">");
	}
	else
	{
	System.out.print("=");
	}
	return 0;
	}
}
