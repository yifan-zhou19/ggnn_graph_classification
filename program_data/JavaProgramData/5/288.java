package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	double n;
	double p = 0;
	double a;
	double b;
	double m = 0;
	String s1 = new String(new char[500]);
	String s2 = new String(new char[500]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Double.parseDouble(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		s1 = tempVar2.charAt(0);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		s2 = tempVar3.charAt(0);
	}
	a = s1.length();
	for (i = 0;i < a;i++)
	{
		if ((s1.charAt(i) != 'A' && s1.charAt(i) != 'T' && s1.charAt(i) != 'C' && s1.charAt(i) != 'G') || (s2.charAt(i) != 'A' && s2.charAt(i) != 'T' && s2.charAt(i) != 'C' && s2.charAt(i) != 'G'))
		{
			m = 1;
			break;
		}
		if (s1.charAt(i) == s2.charAt(i))
		{
			p++;
		}
	}
	if (m == 1)
	{
		System.out.print("error");
	}
	else
	{
	b = p / a;
	if (b > n)
	{
		System.out.print("yes");
	}
	else
	{
		System.out.print("no");
	}
	}
	return 0;
	}
}

