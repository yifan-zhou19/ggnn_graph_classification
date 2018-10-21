package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int k = 0;
	int j;
	double x;
	double num = 0;
	double len;
	String c = new String(new char[1]);
	String a = new String(new char[500]);
	String b = new String(new char[500]);
	c = new Scanner(System.in).nextLine();
	x = Double.parseDouble(c);
	a = new Scanner(System.in).nextLine();
	b = new Scanner(System.in).nextLine();
	for (i = 0;i < a.length();i++)
	{
	if ((a.charAt(i) != 'A') && (a.charAt(i) != 'T') && (a.charAt(i) != 'C') && (a.charAt(i) != 'G'))
	{
	System.out.print("error");
	k = 1;
	break;
	}
	else
	{
	if ((b.charAt(i) != 'A') && (b.charAt(i) != 'T') && (b.charAt(i) != 'C') && (b.charAt(i) != 'G'))
	{
	System.out.print("error");
	k = 1;
	break;
	}
	}
	}
	if (k != 1)
	{
	if (a.length() != b.length())
	{
	System.out.print("error");
	}
	else
	{
	for (k = 0;k < a.length();k++)
	{
	if (a.charAt(k) == b.charAt(k))
	{
	num = num + 1;
	}
	}
	j = a.length();
	len = 1.00 * j;
	if ((num / len) <= x)
	{
	System.out.print("no");
	}
	else
	{
	if ((num / len) > x)
	{
	System.out.print("yes");
	}
	}
	}
	}
	return 0;
	}


}
