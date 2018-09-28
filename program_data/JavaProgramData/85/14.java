package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[21]);
		int i;
		int n;
		int l;
		int j;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; i++)
		{
			m = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			l = a.length();
			if ((a.charAt(0) != '_' && (a.charAt(0) - 65) * (a.charAt(0) - 90) * (a.charAt(0) - 97) * (a.charAt(0) - 122) > 0) || a.charAt(0) < 47)
			{
				System.out.print("no\n");
				m++;
			}
			else
			{
				for (j = 1; j < l; j++)
				{
					if ((a.charAt(j) != '_' && (a.charAt(j) - 48) * (a.charAt(j) - 57) * (a.charAt(j) - 65) * (a.charAt(j) - 90) * (a.charAt(j) - 97) * (a.charAt(j) - 122) > 0) || a.charAt(j) < 47)
					{
						System.out.print("no\n");
						m++;
					}
					else
					{
						;
					}
					if (m > 0)
					{
						break;
					}
					else
					{
						;
					}
				}
			}
			if (m > 0)
			{
				continue;
			}
			else
			{
				System.out.print("yes\n");
			}
		}
	}

}

