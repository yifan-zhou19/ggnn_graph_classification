package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int z;
		int i;
		int j;
	String a = new String(new char[21]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n;i++)
	{
		m = 1;
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a = tempVar2.charAt(0);
	}
	z = a.length();
	if (a.charAt(0) < 65 || (a.charAt(0)>90 && a.charAt(0) < 97) || a.charAt(0)>122)
	{
		m = 0;
	}
	if (a.charAt(0) == 95)
	{
		m = 1;
	}
	if (m == 1)
	{
	for (j = 1;j < z;j++)
	{
		if (a.charAt(j) < 48)
		{
			m = 0;
		}
	if (a.charAt(j) > 57 && a.charAt(j) < 65)
	{
		m = 0;
	}
	if (a.charAt(j) > 90 && a.charAt(j) < 95)
	{
		m = 0;
	}
	if (a.charAt(j) > 95 && a.charAt(j) < 97)
	{
		m = 0;
	}
	if (a.charAt(j) > 122)
	{
		m = 0;
	}
	if (m == 0)
	{
		break;
	}
	}
	}
	if (m == 0)
	{
		System.out.print("no\n");
	}
	else
	{
	System.out.print("yes\n");
	}
	}
	return 0;
	}
}

