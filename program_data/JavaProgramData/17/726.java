package <missing>;

public class GlobalMembers
{
	public static String p = new String(new char[200]);
	public static String q = new String(new char[200]);
	public static int Main()
	{
	while (scanf("%s",p) != EOF)
	{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
	memset(q,' ',(Character.SIZE / Byte.SIZE));
	int l = p.length();
	q = q.substring(0, l);
	int t = 0;
	for (int i = 0;i < l;i++)
	{
	if (p.charAt(i) == '(')
	{
		t++;
	}
	else if (p.charAt(i) == ')')
	{
	if (t > 0)
	{
		t--;
	}
	else
	{
		q = tangible.StringFunctions.changeCharacter(q, i, '?');
	}
	}
	}
	t = 0;
	for (int i = l - 1;i >= 0;i--)
	{
	if (p.charAt(i) == ')')
	{
		t++;
	}
	else if (p.charAt(i) == '(')
	{
	if (t > 0)
	{
		t--;
	}
	else
	{
		q = tangible.StringFunctions.changeCharacter(q, i, '$');
	}
	}
	}
	System.out.print(p);
	System.out.print("\n");
	System.out.print(q);
	System.out.print("\n");
	}
	return 0;
	}
}

