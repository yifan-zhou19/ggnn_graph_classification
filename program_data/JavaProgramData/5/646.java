package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	double r;
	int k = 0;
	int i;
	int q = 1;
	String s = new String(new char[600]);
	String s1 = new String(new char[600]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		r = Double.parseDouble(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		s = tempVar2.charAt(0);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		s1 = tempVar3.charAt(0);
	}
	if (s.length() != s1.length())
	{
	q = 0;
	}
	for (i = 0;i < s.length();i++)
	{
	if (s.charAt(i) != 'A' && s.charAt(i) != 'C' && s.charAt(i) != 'T' && s.charAt(i) != 'G')
	{
	q = 0;
	break;
	}
	}
	for (i = 0;i < s1.length();i++)
	{
	if (s1.charAt(i) != 'A' && s1.charAt(i) != 'C' && s1.charAt(i) != 'T' && s1.charAt(i) != 'G')
	{
	q = 0;
	break;
	}
	}
	if (q == 1)
	{
	for (i = 0;i < s.length();i++)
	{
	if (s.charAt(i) == s1.charAt(i))
	{
	k++;
	}
	}
	if (1.0 * k / s.length() > r)
	{
	System.out.print("yes");
	}
	else
	{
	System.out.print("no");
	}
	}
	if (q == 0)
	{
	System.out.print("error");
	}
	return 0;
	}
}

