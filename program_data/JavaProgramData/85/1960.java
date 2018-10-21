package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String a = new String(new char[22]);
	int n;
	int i;
	int j;
	int m;

	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (j = 1;j <= n;j++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
	m = a.length();
	if (a.charAt(0) >= '0' && a.charAt(0) <= '9')
	{
		System.out.print("no\n");
	continue;
	}
	for (i = 0;i <= m;i++)
	{
		if (i == m)
		{
	System.out.print("yes\n");
	break;
		}

	if ((a.charAt(i) >= 'a' && a.charAt(i) <= 'z') || (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z') || (a.charAt(i) >= '0' && a.charAt(i) <= '9') || a.charAt(i) == '_')
	{
	continue;
	}
	else
	{
		System.out.print("no\n");
		break;
	}


	}
	}
	return 0;
	}
}

