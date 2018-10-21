package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

	int i;
	int b;
	int d;
	double n;
	double e;
	String s1 = new String(new char[500]);
	String s2 = new String(new char[500]);
	int c = 0;

	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Double.parseDouble(tempVar);
	}
	s1 = new Scanner(System.in).nextLine();
	s2 = new Scanner(System.in).nextLine();
	b = s1.length();
	d = s2.length();
	for (i = 0;i < b;i++)
	{
			if ((s1.charAt(i) != 'A') && (s1.charAt(i) != 'T') && (s1.charAt(i) != 'C') && (s1.charAt(i) != 'G'))
			{
		System.out.print("error");
	return 0;
			}
	}

	for (i = 0;i < b;i++)
	{
			if ((s2.charAt(i) != 'A') && (s2.charAt(i) != 'T') && (s2.charAt(i) != 'C') && (s2.charAt(i) != 'G'))
			{
		System.out.print("error");
	return 0;
			}
	}



	if (b == d)
	{
			for (i = 0;i < b;i++)
			{
				if (s1.charAt(i) == s2.charAt(i))
				{
						c++;
				}
			}
		e = 1.0 * c / b;
		if (e >= n)
		{
				System.out.print("yes");
		}
		else
		{
				System.out.print("no");
		}
	}


	else
	{
			System.out.print("error");
	}


	return 0;
	}
}

