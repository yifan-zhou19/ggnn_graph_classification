package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int m = 0;
		String a = new String(new char[39]);
		int i;
		int j;
		int p;
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
			for (j = 0;a.charAt(j) != '\0';j++)
			{
				if (((a.charAt(j) >= '0') && (a.charAt(j) <= '9') && (j>0)) || ((a.charAt(j) >= 'A') && (a.charAt(j) <= 'Z')) || ((a.charAt(j) >= 'a') && (a.charAt(j) <= 'z')) || (a.charAt(j) == '_'))
				{
					m++;
				}
			}
			p = a.length();
			if ((m == p) && ((a.charAt(0) >= 'A' && a.charAt(0) <= 'Z') || (a.charAt(0) >= 'a' && a.charAt(0) <= 'z') || (a.charAt(0) == '_')))
			{
				System.out.print("yes\n");
			}
			else
			{
				System.out.print("no\n");
			}
		}
	}

}

