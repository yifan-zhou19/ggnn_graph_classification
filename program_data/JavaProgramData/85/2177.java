package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String sz = new String(new char[MAX + 1]);
		int i;
		int j;
		int n;
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
				sz = tempVar2.charAt(0);
			}
			for (j = 0;sz.charAt(j);j++)
			{
				if (!((sz.charAt(j) == '_') || (sz.charAt(j) >= 'a' && sz.charAt(j) <= 'z') || (sz.charAt(j) >= 'A' && sz.charAt(j) <= 'Z') || (sz.charAt(j) >= '0' && sz.charAt(j) <= '9' && j != 0)))
				{
					break;
				}
			}
			if (i == 0)
			{
			if (sz.charAt(j) != null)
			{
				System.out.print("no");
			}
			else
			{
				System.out.print("yes");
			}
			}
		else
		{
		if (sz.charAt(j) != null)
		{
				System.out.print("\nno");
		}
			else
			{
				System.out.print("\nyes");
			}
		}
		}
		return 0;
	}



}

