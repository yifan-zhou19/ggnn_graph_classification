package <missing>;

public class GlobalMembers
{
	// xiaomingao.cpp : ??????????????
	//

	public static int Main()
	{
	int n;
	int i;
	int p;
	int q;
	String a = new String(new char[21]);

	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (q = 0;q < n;q++)
	{
		int m = 0;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		p = a.length();
		for (i = 0;i < p;i++)
		{
			if (((a.charAt(0) >= 'A' && a.charAt(0) <= 'Z') || (a.charAt(0) >= 'a' && a.charAt(0) <= 'z') || (a.charAt(0) == '_')) && ((a.charAt(i) >= 'A' && a.charAt(i) <= 'Z') || (a.charAt(i) >= 'a' && a.charAt(i) <= 'z') || (a.charAt(i) >= '0' && a.charAt(i) <= '9') || (a.charAt(i) == '_')))
			{
					m = m + 0;
			}
		   else
		   {
					m = m + 1;
		   }

		}
		if (m == 0)
		{
			System.out.print("yes\n");
		}
		else
		{
		System.out.print("no\n");
		}
	}
	return 0;
	}



}

