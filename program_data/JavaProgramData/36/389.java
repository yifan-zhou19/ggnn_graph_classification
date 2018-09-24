package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	String c = new String(new char[10]);
	String b = new String(new char[10]);
	int i;
	int j;
	int n;
	int k;
	int m;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		c = tempVar.charAt(0);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		b = tempVar2.charAt(0);
	}
	n = c.length();
	m = b.length();
	if (m == n)
	{
	for (i = 0;i < n;i++)
	{
	for (j = 0;j < n;j++)
	{
	if (c.charAt(i) != ' ' && b.charAt(j) != ' ')
	{
	if (c.charAt(i) == b.charAt(j))
	{
	c = tangible.StringFunctions.changeCharacter(c, i, b[j] = ' ');
	}
	}
	}
	}
	for (i = 0;i < n;i++)
	{
	if (c.charAt(i) != ' ' || b.charAt(i) != ' ')
	{
	System.out.print("NO");
	break;
	}
	}
	if (i == n)
	{
	System.out.print("YES");
	}
	}
	else
	{
	System.out.print("NO");
	}
	}
}

