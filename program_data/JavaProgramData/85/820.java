package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int n;
		int l;
		String a = new String(new char[21]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 0;j < n;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			l = a.length();
			for (i = 0;i < l;i++)
			{
				if (i == 0)
				{
					if (a.charAt(i) >= 65 && a.charAt(i) <= 90 || a.charAt(i) >= 97 && a.charAt(i) <= 122 || a.charAt(i) == '_')
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
					if (a.charAt(i) >= 65 && a.charAt(i) <= 90 || a.charAt(i) >= 97 && a.charAt(i) <= 122 || a.charAt(i) == '_' || a.charAt(i) >= 48 && a.charAt(i) <= 57)
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

