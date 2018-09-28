package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String a = new String(new char[256]);
	String b = new String(new char[256]);
	String c = new String(new char[256]);
	int n;
	int m;
	int i;
	int j;
	int k;
	int d;
	for (i = 0;i < 256;i++)
	{
	a = tangible.StringFunctions.changeCharacter(a, i, '\0');
	b = tangible.StringFunctions.changeCharacter(b, i, '\0');
	c = tangible.StringFunctions.changeCharacter(c, i, '\0');
	}
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = tempVar.charAt(0);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		b = tempVar2.charAt(0);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		c = tempVar3.charAt(0);
	}

	m = 0;
	n = 0;
	d = 0;
	for (i = 0;a.charAt(i) != '\0';i++)
	{
	m++;
	}
	for (i = 0;b.charAt(i) != '\0';i++)
	{
	n++;
	}
	for (i = 0;c.charAt(i) != '\0';i++)
	{
	d++;
	}

	int h = 0;
	i = 0;
	while (a.charAt(i) != '\0')
	{
	if (a.charAt(i) == b.charAt(0))
	{
	j = 0;
	h = i;
	k = 0;
	while (a.charAt(i) == b.charAt(j) && a.charAt(i) != '\0')
	{

	k++;
	i++;
	j++;

	}
	if (k == n)
	{
	int t = 0;
	for (t = 0;t < d;t++)
	{
	a = tangible.StringFunctions.changeCharacter(a, h + t, c.charAt(t));
	}
	break;
	}
	}
	else
	{
	i++;
	}
	}
	System.out.printf("%s",a);
	}

}

