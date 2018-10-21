package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int l;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String s = new String(new char[81]);
		for (i = 0;i < n;i++)
		{
			s = new Scanner(System.in).nextLine();
			l = s.length();
			if (l == 0)
			{
				i--;
				continue;
			}
			for (j = 0;j < l;j++)
			{
				if ((s.charAt(0) >= 'a' && s.charAt(0) <= 'z') || (s.charAt(0) >= 'A' && s.charAt(0) <= 'Z') || s.charAt(0) == '_')
				{
						if ((s.charAt(j) >= 'a' && s.charAt(j) <= 'z') || (s.charAt(j) >= 'A' && s.charAt(j) <= 'Z') || s.charAt(j) == '_' || (s.charAt(j) >= '0' && s.charAt(j) <= '9'))
						{
							if (j == l - 1)
							{
									System.out.print("yes\n");
							}
						}
						else
						{
						System.out.print("no\n");
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
		return 0;
	}

}

