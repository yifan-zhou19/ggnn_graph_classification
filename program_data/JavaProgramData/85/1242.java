package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		String a = new String(new char[25]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			a = new Scanner(System.in).nextLine();
			for (j = 0;j <= a.length() - 1;j++)
			{
				if (j == 0)
				{
					if (a.charAt(0) >= 'A' && a.charAt(0) <= 'Z' || a.charAt(0) >= 'a' && a.charAt(0) <= 'z' || a.charAt(0) == '_')
					{
						;
					}
					else
					{
						System.out.print("no\n");
						break;
					}
				}
				else
				{
					if (a.charAt(j) >= 'A' && a.charAt(j) <= 'Z' || a.charAt(j) >= 'a' && a.charAt(j) <= 'z' || a.charAt(j) == '_' || a.charAt(j) >= '0' && a.charAt(j) <= '9')
					{
						if (j == a.length() - 1)
						{
							System.out.print("yes\n");
							break;
						}
					}
					else
					{
						System.out.print("no\n");
						break;
					}
				}
			}
		}
	}
}

