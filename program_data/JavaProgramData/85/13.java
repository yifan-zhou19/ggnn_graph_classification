package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String a = new String(new char[25]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int k;
		int l;
		int j;
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			l = a.length();
			k = 1;
			if (a.charAt(0) == 95 || (a.charAt(0) <= 'z' && a.charAt(0) >= 'a') || (a.charAt(0) <= 'Z' && a.charAt(0) >= 'A'))
			{
				a = tangible.StringFunctions.changeCharacter(a, 0, 1);
			}
			else
			{
				a = null;
			}
			for (j = 1;j < l;j++)
			{
				if ((a.charAt(j) <= 'z' && a.charAt(j) >= 'a') || (a.charAt(j) <= 'Z' && a.charAt(j) >= 'A') || (a.charAt(j) <= '9' && a.charAt(j) >= '0') || a.charAt(j) == 95)
				{
					a = tangible.StringFunctions.changeCharacter(a, j, 1);
				}
				else
				{
					a = a.substring(0, j);
				}
			}
			for (j = 0;j < l;j++)
			{
				k = k * a.charAt(j);
			}
			if (k == 1)
			{
				System.out.print("yes\n");
			}
			if (k == 0)
			{
				System.out.print("no\n");
			}
		}
		return 0;
	}
}

