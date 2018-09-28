package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int j;
	int i;
	int q = 0;
	int a;
	int b;
	int d = 0;
	int e = 0;
	int l;
	int g;
	float c;
	float n;
	String s1 = new String(new char[500]);
	String s2 = new String(new char[500]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Float.parseFloat(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		s1 = tempVar2.charAt(0);
	}
	String tempVar3 = ConsoleInput.scanfRead("\n");
	if (tempVar3 != null)
	{
		s2 = tempVar3.charAt(0);
	}
	if (s1.length() != s2.length())
	{
		System.out.print("error");
	}
	if (s1.length() == s2.length())
	{
	for (i = 0;s1.charAt(i) != '\0';i++)
	{
		if (s1.charAt(i) != 'A' && s1.charAt(i) != 'T' && s1.charAt(i) != 'G' && s1.charAt(i) != 'C')
		{
			d++;
		}
	}
	for (j = 0;s2.charAt(j) != '\0';j++)
	{
		if (s2.charAt(j) != 'A' && s2.charAt(j) != 'T' && s2.charAt(j) != 'G' && s2.charAt(j) != 'C')
		{
			e++;
		}
	}
	l = s1.length();
	for (int k = 0;k < l;k++)
	{
		if (s1.charAt(k) == s2.charAt(k))
		{
			q++;
		}
	}
	a = s1.length();
	b = q;
	c = (float)b / (float)a;
	g = d + e;
	if (g != 0)
	{
		System.out.print("error");
	}
	else
	{
		if (c >= n)
		{
			System.out.print("yes");
		}
		if (c < n)
		{
			System.out.print("no");
		}
	}
	}

	return 0;
	}

}

