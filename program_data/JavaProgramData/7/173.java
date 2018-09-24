package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String sr = new String(new char[1000]);
	sr = new Scanner(System.in).nextLine();
	String a = new String(new char[1000]);
	String b = new String(new char[1000]);
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
	int len;
	int ken;
	len = sr.length();
	ken = a.length();
	int i;
	int j;
	int k;
	int m;
	m = 0;
	// Ilovehomelive live==>jdkfjdsjfks
	for (i = 0;i < len;i++)
	{
		if (sr.charAt(i) == a.charAt(0))
		{
			j = i;
		for (k = 0;k < ken;k++)
		{
			if (sr.charAt(k + j) == a.charAt(k))
			{
			m = 1;
			}
			else if (sr.charAt(k + j) != a.charAt(k))
			{
				m = 0;
				break;
			}
		}
		}
		if (m == 1)
		{
			break;
		}
	}
	if (m == 0)
	{
		System.out.printf("%s",sr);
	}
	String c = new String(new char[1000]);
	String d = new String(new char[1000]);
	if (m == 1)
	{
		for (i = 0;i < j;i++)
		{
				c = tangible.StringFunctions.changeCharacter(c, i, sr.charAt(i));
		}
		c = tangible.StringFunctions.changeCharacter(c, j, '\0');
		if (j + ken == len)
		{
				System.out.printf("%s%s",c,b);
		}
		if (j + ken < len)
		{
			for (i = j + ken;i < len;i++)
			{
					d = tangible.StringFunctions.changeCharacter(d, i - j - ken, sr.charAt(i));
			}
				d = tangible.StringFunctions.changeCharacter(d, len - j - ken, '\0');
				System.out.printf("%s%s%s",c,b,d);
		}
	}
	return 0;
	}

}

