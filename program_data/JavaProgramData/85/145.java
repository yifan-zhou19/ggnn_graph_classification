package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[19]);
		int n;
		int i;
		int j;
		int d;
		int len;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n + 1;i++)
		{
			a = new Scanner(System.in).nextLine();
			len = a.length();
			d = 0;
			for (j = 0;j <= len - 1;j++)
			{
				if (((a.charAt(0) >= '9') || (a.charAt(0) < '0')) && ((a.charAt(j) >= 'a' && a.charAt(j) <= 'z') || (a.charAt(j) >= 'A' && a.charAt(j) <= 'Z') || (a.charAt(j) == '_') || (a.charAt(j) >= '0' && a.charAt(j) <= '9')))
				{
					continue;
				}
				else
				{
					d++;
					System.out.print("no\n");
					break;
				}
			}
			if ((d == 0) && (i != 1))
			{
				System.out.print("yes\n");
			}
		}
		return 0;
	}
}

