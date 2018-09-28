package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		int i = 0;
		int j = 0;
		int LEN = 0;
		int k = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String zf = new String(new char[21]);
		for (i = 0;i < n;i++)
		{
			j = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				zf = tempVar2.charAt(0);
			}
			LEN = zf.length();
			while (j < LEN)
			{
				if ((zf.charAt(j) >= 'a' && zf.charAt(j) <= 'z') || (zf.charAt(j) >= 'A' && zf.charAt(j) <= 'Z') || zf.charAt(j) == '_' || (j != 0 && zf.charAt(j) >= '0' && zf.charAt(j) <= '9'))
				{
					k = 0;
					j++;
				}
				else
				{
					k = 1;
					break;
				}
			}
			if (k == 0)
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

