package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k = 1;
		int i;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		String str = new String(new char[81]);
		while (k <= n)
		{
			str = new Scanner(System.in).nextLine();
			m = str.length();
			if ((str.charAt(0) != '_') && ((str.charAt(0) < 'A') || (str.charAt(0)>'Z' && str.charAt(0) < 'a') || (str.charAt(0)>'z')))
			{
				System.out.print("0\n");
			}
			else
			{
				if (m == 1)
				{
					System.out.print("1\n");
				}
				else
				{
					i = 1;
					while (i <= m)
					{
						if ((str.charAt(i) != '_') && (str.charAt(i) < 'A' || (str.charAt(i)>'Z' && str.charAt(i) < 'a') || str.charAt(i)>'z') && ((str.charAt(i) < '0') || (str.charAt(i)>'9')))
						{
							System.out.print("0\n");
							break;
						}
						else if (i == m - 1)
						{
							System.out.print("1\n");
							break;
						}
						i = i + 1;
					}
				}
			}
			k = k + 1;
		}
		return 0;
	}

}

