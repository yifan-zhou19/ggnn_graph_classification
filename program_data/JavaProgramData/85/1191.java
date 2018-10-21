package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zf = new String(new char[30]);
		int n;
		int i;
		int j;
		int c;
		int b;
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
			b = 0;
			c = 0;
			for (j = 0;zf.charAt(j) != '\0';j++)
			{
				c++;
				if (((zf.charAt(0) <= 'z' && zf.charAt(0) >= 'a') || (zf.charAt(0) <= 'Z' && zf.charAt(0) >= 'A') || zf.charAt(0) == '_') && ((zf.charAt(j) <= 'z' && zf.charAt(j) >= 'a') || (zf.charAt(j) <= 'Z' && zf.charAt(j) >= 'A') || zf.charAt(j) == '_' || (zf.charAt(j) >= '0' && zf.charAt(j) <= '9')))
				{
					b++;
				}
			}
			if (c == b)
			{
				System.out.print("yes\n");
			}
			else
			{
				System.out.print("no\n");
			}
		}
		return 0;
	}
}

