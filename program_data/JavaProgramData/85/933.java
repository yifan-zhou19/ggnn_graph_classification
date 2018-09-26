package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i = 1;
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String sz = new String(new char[21]);
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz = tempVar2.charAt(0);
			}
			int j;
			if (sz.charAt(0) == '_' || (sz.charAt(0) <= 'z' && sz.charAt(0) >= 'a') || (sz.charAt(0) <= 'Z' && sz.charAt(0) >= 'A'))
			{
				a = 1;
				for (j = 1;sz.charAt(j) != '\0';j++)
				{
					if (!(sz.charAt(j) == '_' || (sz.charAt(j) <= 'z' && sz.charAt(j) >= 'a') || (sz.charAt(j) <= 'Z' && sz.charAt(j) >= 'A') || (sz.charAt(j) <= '9' && sz.charAt(j) >= '0')))
					{
						a = 0;
						break;
					}
					else if (sz.charAt(j) == '_' || (sz.charAt(j) <= 'z' && sz.charAt(j) >= 'a') || (sz.charAt(j) <= 'Z' && sz.charAt(j) >= 'A') || (sz.charAt(j) <= '9' && sz.charAt(j) >= '0'))
					{
						a = 1;
					}
				}
				if (a == 1)
				{
					System.out.print("yes\n");
				}
				if (a == 0)
				{
					System.out.print("no\n");
				}
			}
			else
			{
			System.out.print("no\n");
			}
		}
	return 0;
	}


}

