package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int n;
	int m;
	int j;
	double x;
	double s;
	String a = new String(new char[101]);
	String b = new String(new char[101]);
	j = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		x = Double.parseDouble(tempVar);
	}
		//getchar();
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
		n = a.length();
		m = b.length();
		s = 0;
		for (i = 0;i < n;i++)
		{
			if (a.charAt(i) != 'A' && a.charAt(i) != 'T' && a.charAt(i) != 'C' && a.charAt(i) != 'G')
			{
				j++;
				break;
			}
		}

	if (n != m || j != 0)
	{
		System.out.print("error");
	}
	else
	{
		for (i = 0;i < n;i++)
		{
			if (b.charAt(i) == a.charAt(i))
			{
				s++;
			}
		}
		s = s / n;
		if (s > x)
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

