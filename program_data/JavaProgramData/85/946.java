package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zxc = new String(new char[30]);
		int n;
		int i;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				zxc = tempVar2.charAt(0);
			}
			for (k = 0;zxc.charAt(k) != '\0';k++)
			{
				if (zxc.charAt(0) - '0' <= 9 && zxc.charAt(0) - '0' >= 0)
				{
					System.out.print("no\n");
					break;
				}
				else if ((zxc.charAt(k) - 'A' <= 25 && zxc.charAt(k) - 'A' >= 0) || (zxc.charAt(k) - 'a' <= 25 && zxc.charAt(k) - 'a' >= 0) || (zxc.charAt(k) - '0' <= 9 && zxc.charAt(k) - '0' >= 0) || (zxc.charAt(k) == '_'))
				{



				}
				else
				{
					System.out.print("no\n");
					break;

				}
				if (zxc.charAt(k + 1) == '\0')
				{
				System.out.print("yes\n");
				}
			}

		}

		return 0;
	}
}

