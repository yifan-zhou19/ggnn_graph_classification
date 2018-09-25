package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String a = new String(new char[1000]);
	String b = new String(new char[1000]);
	int[] c = new int[1000];
	int i;
	int j;
	int n;
	int m;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = tempVar.charAt(0);
	}
	i = a.length();
	if (a.charAt(0) <= 90)
	{
	b = tangible.StringFunctions.changeCharacter(b, 0, a.charAt(0));
	}
	else
	{
	b = tangible.StringFunctions.changeCharacter(b, 0, a.charAt(0) - 32);
	}
	c[0] = 1;
	n = 0;
	m = 0;
	for (j = 1;j < i;j++)
	{
		if (a.charAt(j) == a.charAt(j - 1) || a.charAt(j) == a.charAt(j - 1) - 32 || a.charAt(j) == a.charAt(j - 1) + 32)
		{
	c[n] = c[n] + 1;
		}
	else
	{
		m = m + 1;
	n = n + 1;
	if (a.charAt(j) <= 90)
	{
	b = tangible.StringFunctions.changeCharacter(b, m, a.charAt(j));
	}
	else
	{
	b = tangible.StringFunctions.changeCharacter(b, m, a.charAt(j) - 32);
	}
	c[n] = c[n] + 1;
	}
	}
	for (i = 0;i <= m;i++)
	{
	System.out.printf("(%c,%d)",b.charAt(i),c[i]);
	}
	}



}

