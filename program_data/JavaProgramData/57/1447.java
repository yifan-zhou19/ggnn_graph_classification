package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String p;
		String a = new String(new char[100]);
		int n;
		int l;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int j = 0;j < n;j++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
			p = a;
			l = a.length();
			if (strcmp("er",(p.Substring(l) - 2)) == 0)
			{
				*(p.Substring(l) - 2) = '\0';
				System.out.println(p);
			}
			if (strcmp("ly",(p.Substring(l) - 2)) == 0)
			{
				*(p.Substring(l) - 2) = '\0';
				System.out.println(p);
			}
			if (strcmp("ing",(p.Substring(l) - 3)) == 0)
			{
				*(p.Substring(l) - 3) = '\0';
				System.out.println(p);
			}
		}

		return 0;
	}


}

