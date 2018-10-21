package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	double rate;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		rate = Double.parseDouble(tempVar);
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
	int len1 = a.length();
	int len2 = b.length();

	if (len1 != len2)
	{
	System.out.print("error\n");
	return 0;
	}

	int i;
	int sum = 0;
	for (i = 0; i < len1; i++)
	{
	switch (a.charAt(i))
	{
	case 'A':
		break;
	case 'T':
		break;
	case 'C':
		break;
	case 'G':
		break;
	default:
		System.out.print("error\n");
			 return 0;
	}
	switch (b.charAt(i))
	{
	case 'A':
		break;
	case 'T':
		break;
	case 'C':
		break;
	case 'G':
		break;
	default:
		System.out.print("error\n");
			 return 0;
	}

	if (a.charAt(i) == b.charAt(i))
	{
		sum++;
	}
	}

	if ((double)sum / len1 > rate)
	{
		System.out.print("yes\n");
	}
	else
	{
		System.out.print("no\n");
	}
	return 0;
	}
}

