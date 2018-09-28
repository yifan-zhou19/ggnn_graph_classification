package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

	int i;
	int n;
	int m;
	int k;
	int p;
	int q;
	int z = 0;
	String a = new String(new char[260]);
	String b = new String(new char[260]);
	String c = new String(new char[260]);
	String d = new String(new char[260]);

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
	n = a.length();
	m = b.length();
	q = c.length();
	for (i = 0;i < n;i++)
	{
		if (a.charAt(i) == b.charAt(0))
		{
			for (k = 0;k < m;k++)
			{
			d = tangible.StringFunctions.changeCharacter(d, k, a.charAt(k + i));
			}
			d = tangible.StringFunctions.changeCharacter(d, k, '\0');
			if (strcmp(b,d) == 0)
			{
				for (p = 0;p < i;p++)
				{
				System.out.printf("%c",a.charAt(p));

				}
					System.out.printf("%s",c);
				for (p = i + q;p < (n - m + q);p++)
				{
				System.out.printf("%c",a.charAt(p));
				}
				 z = 1;
				break;
			}
		}
	}

	if (z == 0)
	{
	System.out.printf("%s",a);
	}




	return 0;
	}


}

