package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int N;
		String ti = new String(new char[50]);
		String beiti = new String(new char[50]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			ti = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			beiti = tempVar2.charAt(0);
		}
		for (i = 0;i < (beiti.length() - ti.length() + 1);i++)
		{
			N = 0;
			for (j = 0;j < ti.length();j++)
			{
				if (beiti.charAt(i + j) == ti.charAt(j))
				{
					N++;
				}
			}
			if (N == ti.length())
			{
				System.out.printf("%d\n",i);
				break;
			}
		}
		return 0;
	}
}

