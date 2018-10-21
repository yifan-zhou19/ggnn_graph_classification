package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int k;
	int t;
	String s = new String(new char[60]);
	while (scanf("%d", n) != EOF)
	{
	System.in.read();
	while (n-- != 0)
	{
	s = new Scanner(System.in).nextLine();
	t = s.length();
	if (t > 50)
	{
	System.out.print("no\n");
	continue;
	}
	if (!((s.charAt(0) >= 'a' && s.charAt(0) <= 'z') || (s.charAt(0) >= 'A' && s.charAt(0) <= 'Z') || s.charAt(0) == '_'))
	{
	System.out.print("no\n");
	continue;
	}
	k = 1;
	for (i = 0;s.charAt(i) != '\0';i++)
	{
	if (s.charAt(i) == ' ')
	{
	k = 0;
	break;
	}
	if (!((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') || (s.charAt(i) >= '0' && s.charAt(i) <= '9') || s.charAt(i) == '_'))
	{
	k = 0;
	break;
	}
	}
	if (k == 0)
	{
	System.out.print("no\n");
	continue;
	}
	System.out.print("yes\n");
	}
	}
	return 0;
	}

}
