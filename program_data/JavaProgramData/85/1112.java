package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int mark;
		int m;
		int j;
		final String a = "";
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			m = a.length();
			for (j = 0;j < m;j++)
			{
				if (a.charAt(j) == '_' || (a.charAt(j) >= '0' && a.charAt(j) <= '9') || (a.charAt(j) >= 'a' && a.charAt(j) <= 'z') || (a.charAt(j) >= 'A' && a.charAt(j) <= 'Z'))
				{
					mark = 0;
				}
				else
				{
					mark = 1;
					break;
				}
			}
			if (a.charAt(0) >= '0' && a.charAt(0) <= '9')
			{
				mark = 1;
			}
			if (mark == 1)
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

