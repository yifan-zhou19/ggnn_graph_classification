package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	double n;
	double m;
	double d;
	int a;
	int b;
	int i;
	int c;
	String u = new String(new char[500]);
	String v = new String(new char[500]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Double.parseDouble(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		u = tempVar2.charAt(0);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		v = tempVar3.charAt(0);
	}
	a = u.length();
	b = v.length();
	if (a != b)
	{
		System.out.print("error");
	}
	else if (a == b)
	{
		c = 0;
		for (i = 0;u.charAt(i) != '\0';i++)
		{
		if (u.charAt(i) != 'A' && u.charAt(i) != 'T' && u.charAt(i) != 'G' && u.charAt(i) != 'C' && v.charAt(i) != 'A' && v.charAt(i) != 'T' && v.charAt(i) != 'G' && v.charAt(i) != 'C')
		{
			System.out.print("error");
			c = 1;
			break;

		}
		}
		if (c == 0)

		{
			d = 0;
			for (i = 0;u.charAt(i) != '\0';i++)
			{
			if (u.charAt(i) == v.charAt(i))
			{
				d++;
			}
			}
			m = d / (1.0 * (a - 1));
			if (m > n)
			{
				System.out.print("yes");
			}
			else
			{
				System.out.print("no");
			}



		}

	}


	return 0;
	}

}

