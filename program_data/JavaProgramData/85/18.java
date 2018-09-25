package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[21]);
		int n;
		int i;
		int j;
		int a1;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			m = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			a1 = a.length();
			for (j = 0;j < a1;j++)
			{
				if (a.charAt(0) <= '9' && a.charAt(0) >= '0')
				{
					System.out.print("no\n");
					m += 1;
					break;
				}
				if ((a.charAt(j) <= 'z' && a.charAt(j) >= 'a') || (a.charAt(j) <= 'Z' && a.charAt(j) >= 'A') || (a.charAt(j) <= '9' && a.charAt(j) >= '0') || a.charAt(j) == '_')
				{
					m += 0;
				}
				else
				{
					m += 1;
				}
				if (m == 1)
				{
					System.out.print("no\n");
					break;
				}
			}
			if (m == 0)
			{
				System.out.print("yes\n");
			}
		}
		return 0;
	}
}

