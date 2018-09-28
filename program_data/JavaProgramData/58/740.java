package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int ans;
		String s = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			s = new Scanner(System.in).nextLine();
			ans = 1;
			if ((s.charAt(0) == '_') || ((s.charAt(0) >= 'a' && s.charAt(0) <= 'z') || (s.charAt(0) >= 'A' && s.charAt(0) <= 'Z')))
			{
				for (j = 1;j < s.length();j++)
				{
					if ((s.charAt(j) != '_') && (s.charAt(j) < 'a' || s.charAt(j)>'z') && (s.charAt(j) < 'A' || s.charAt(j)>'Z') && (s.charAt(j) < '0' || s.charAt(j)>'9'))
					{
						ans = 0;
					}
					else
					{
						continue;
					}
				}
			}
			else
			{
				ans = 0;
			}
			System.out.printf("%d\n",ans);
		}
		return 0;
	}


}

