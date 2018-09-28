package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	double c;
	double w = 0;
	double n = 0;
	String x = new String(new char[600]);
	String y = new String(new char[600]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		c = Double.parseDouble(tempVar);
	}
	System.in.read();
	x = new Scanner(System.in).nextLine();
	y = new Scanner(System.in).nextLine();
	if (x.length() == y.length())
	{
	for (int j = 0;j < x.length();j++)
	{
		if ((x.charAt(j) != 'A' && x.charAt(j) != 'T' && x.charAt(j) != 'G' && x.charAt(j) != 'C') || (y.charAt(j) != 'A' && y.charAt(j) != 'T' && y.charAt(j) != 'G' && y.charAt(j) != 'C'))
		{
					  System.out.print("error");
					  n = 1;
					  break;
		}
		if (x.charAt(j) == y.charAt(j))
		{
			  w++;
		}
	}
	}
	else
	{
		 System.out.print("error");
		 n = 1;
	}
	if (n == 0)
	{
		w = w / x.length();
		if (c < w)
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

