package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int len;
		String zf = new String(new char[21]);
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
				zf = tempVar2.charAt(0);
			}
			len = zf.length();
			for (j = 0;j < len;j++)
			{
				if (j == 0)
				{
					if ((zf.charAt(j) < 'a' || zf.charAt(j)>'z') && zf.charAt(j) != '_')
					{
						if (zf.charAt(j) < 'A' || zf.charAt(j)>'Z')
						{
							System.out.print("no\n");
							break;
						}
					}
				}
				else
				{
					if ((zf.charAt(j) < 'a' || zf.charAt(j)>'z') && zf.charAt(j) != '_')
					{
						if (zf.charAt(j) < 'A' || zf.charAt(j)>'Z')
						{
							if (zf.charAt(j) < '0' || zf.charAt(j)>'9')
							{
								System.out.print("no\n");
								break;
							}
						}
					}
				}
			}
			if (j == len)
			{
				System.out.print("yes\n");
			}
		}
		return 0;
	}

}

