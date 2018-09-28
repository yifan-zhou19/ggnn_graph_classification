package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String a = new String(new char[256]);
	String b = new String(new char[256]);
	String c = new String(new char[256]);
	int q;
	int w;
	int e;
	int i;
	int k;
	int j;
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
	q = a.length();
	w = b.length();
	e = c.length();

	for (i = 0;i < q;i++)
	{
	j = 0;
	for (k = i;(k < i + w) && (k < q);k++)
	{

	if (a.charAt(k) != b.charAt(k - i))
	{
		continue;
	}
	if (a.charAt(k) == b.charAt(k - i))
	{
		j++;
	}
	if (j == w)
	{
		for (k = i;(k < i + w) && (k < q);k++)
		{
		a = tangible.StringFunctions.changeCharacter(a, k, c.charAt(k - i));
		}
		break;
	}
	}
	if (j == w)
	{




	break;
	}

	}

	System.out.printf("%s",a);

	return 0;
	}


}

