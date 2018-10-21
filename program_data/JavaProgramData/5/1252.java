package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int k;
	int i;
	double m;
	double ac;
	double bc;
	double n;
	k = 0;
	m = 0;
	ac = 0;
	bc = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Double.parseDouble(tempVar);
	}
	String a = new String(new char[501]);
	String b = new String(new char[501]);
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
	ac = a.length() - 1;
	bc = b.length() - 1;
	if (ac != bc)
	{
		k++;
		System.out.print("error");
	return 0;
	}
	else
	{
		for (i = 0;a.charAt(i) != '\0';i++)
		{
		if ((a.charAt(i) != 'A' && a.charAt(i) != 'T' && a.charAt(i) != 'G' && a.charAt(i) != 'C') || (b.charAt(i) != 'A' && b.charAt(i) != 'T' && b.charAt(i) != 'G' && b.charAt(i) != 'C'))
		{
			k++;
			System.out.print("error");
		break;
		}
		else
		{
			if (a.charAt(i) == b.charAt(i))
			{
			m++;
			}
		}
		}
	}
	if (k == 0)
	{
		if (m / ac >= n)
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

