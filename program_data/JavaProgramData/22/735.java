package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int m1;
	int m2;
	int n;
	char c;
	m1 = m2 = 0;
	do
	{
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(null, 1);
	if (tempVar2 != null)
	{
		c = tempVar2.charAt(0);
	}
	if (n > m1)
	{
	m2 = m1;
	m1 = n;
	}
	else if ((n > m2) && (n != m1))
	{
	m2 = n;
	}
	} while (c == ',');
	if ((m2 != m1) && (m2 != 0))
	{
	System.out.printf("%d",m2);
	}
	else
	{
	System.out.print("No");
	}

	return 0;
	}

}

