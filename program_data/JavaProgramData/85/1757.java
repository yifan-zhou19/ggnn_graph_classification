package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String sz = new String(new char[21]);
		for (i = 0;i < n;i++)
		{
			int zs = 1;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz = tempVar2.charAt(0);
			}
			if (sz.charAt(0) >= '0' && sz.charAt(0) <= '9')
			{
				zs = 0;
			}
			else
			{
			for (j = 0;sz.charAt(j);j++)
			{
				if (!((sz.charAt(j) == '_') || (sz.charAt(j) >= '0' && sz.charAt(j) <= '9') || (sz.charAt(j) >= 'a' && sz.charAt(j) <= 'z') || (sz.charAt(j) >= 'A' && sz.charAt(j) <= 'Z')))
				{
					   zs = 0;
				}
			}
			}
			if (zs == 1)
			{
					System.out.print("yes\n");
			}
			  if (zs == 0)
			  {
					System.out.print("no\n");
			  }
		}
		return 0;
	}

}

