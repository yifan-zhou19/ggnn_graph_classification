package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int t;
	String a = new String(new char[50]);

	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (int i = 0;i < n;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		t = 1;
		if ((a.charAt(0) < 'A' || a.charAt(0)>'Z') && (a.charAt(0) < 'a' || a.charAt(0)>'z') && a.charAt(0) != '_')
		{
			t = 0;
		}
		for (int j = 1;j < a.length();j++)
		{
			if ((a.charAt(j) < 'A' || a.charAt(j)>'Z') && (a.charAt(j) < 'a' || a.charAt(j)>'z') && a.charAt(j) != '_' && (a.charAt(j) < '0' || a.charAt(j)>'9'))
			{
				t = 0;
				break;
			}
		}
		if (t == 0)
		{
			System.out.print("no\n");
		}
		else if (t == 1)
		{
			System.out.print("yes\n");
		}
	}






	return 0;
	}
}

