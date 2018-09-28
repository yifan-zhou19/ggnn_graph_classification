package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	double m;
	double n = 0;
	String a = new String(new char[500]);
	String b = new String(new char[500]);
	String pa;
	String pb;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		m = Double.parseDouble(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a = tempVar2.charAt(0);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		b = tempVar3.charAt(0);
	}
	if (a.length() != b.length())
	{
	System.out.print("error\n");
	}
	else
	{
	for (pa = a,pb = b; pa != '\0';pa++,pb++)
	{
	if (pa == pb)
	{
	n++;
	}
	}
	n = n / a.length();
	for (pa = a,pb = b; pa != '\0';pa++,pb++)
	{
	if ((pa != 'A' && pa != 'T' && pa != 'G' && pa != 'C') || (pb != 'A' && pb != 'T' && pb != 'G' && pb != 'C'))
	{
	System.out.print("error\n");
	break;
	}
	else if (*(pa.Substring(1)) == '\0' && n > m)
	{
	System.out.print("yes\n");
	}
	else if (*(pa.Substring(1)) == '\0' && n <= m)
	{
	System.out.print("no\n");
	}
	}
	}
	return 0;
	}
}

