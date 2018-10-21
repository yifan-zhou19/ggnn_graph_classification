package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int b;
		int n;
		int l;
		int m;
		String a = new String(new char[21]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (b = 0;b < n;b++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			l = a.length();
			for (i = 0;i < l;i++)
			{
				m = (int)(a.charAt(i));
				if (i == 0)
				{
					if ((m >= 65 && m <= 90) || (m >= 97 && m <= 122) || a.charAt(i) == '_')
					{
						continue;
					}
					else
					{
						break;
					}
				}
				if (i != 0)
				{
					if ((m >= 65 && m <= 90) || (m >= 97 && m <= 122) || (a.charAt(i) == '_') || (m >= 48 && m <= 57))
					{
						continue;
					}
					else
					{
						break;
					}
				}
			}
			if (i == l)
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

