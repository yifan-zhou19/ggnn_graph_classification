package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int count = 0;
		int len;
		int j;
		String zf = new String(new char[30]);
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
			if ((zf.charAt(0) >= 'a' && zf.charAt(0) <= 'z') || (zf.charAt(0) >= 'A' && zf.charAt(0) <= 'Z') || zf.charAt(0) == '_')
			{
				count++;
			}
			for (j = 1;j < len;j++)
			{
				if ((zf.charAt(j) >= 'a' && zf.charAt(j) <= 'z') || (zf.charAt(j) >= 'A' && zf.charAt(j) <= 'Z') || zf.charAt(j) == '_' || (zf.charAt(j) >= '0' && zf.charAt(j) <= '9'))
				{
					count++;
				}
			}
			if (count == len)
			{
				System.out.print("yes\n");
			}
			else
			{
				System.out.print("no\n");
			}
			count = 0;
		}
	}

}

