package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[21]);
		int i;
		int j;
		int n;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			b = 1;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			for (j = 0;;j++)
			{
				if (a.charAt(j) == '\0')
				{
					break;
				}
					if (a.charAt(0) >= '0' && a.charAt(0) <= '9')
					{
					System.out.print("no\n");
					b = 0;
					break;
					}
				if (!((a.charAt(j) >= 'A' && a.charAt(j) <= 'Z') || ((a.charAt(j) >= 'a') && a.charAt(j) <= 'z') || a.charAt(j) == '_' || (a.charAt(j) >= '0' && a.charAt(j) <= '9')))
				{
					System.out.print("no\n");
					b = 0;
					break;
				}

			}
			if (b == 1)
			{
				System.out.print("yes\n");
			}
		}
		return 0;
	}

}

