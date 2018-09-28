package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int flag;
		String s = new String(new char[81]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			s = new Scanner(System.in).nextLine();
			flag = 1;
			if ((s.charAt(0) >= 'a' && s.charAt(0) <= 'z') || (s.charAt(0) >= 'A' && s.charAt(0) <= 'Z') || s.charAt(0) == '_')
			{
				if (s.length() == 1)
				{
					flag = 1;
				}
				else
				{
					for (j = 1;j < s.length();j++)
					{
						if ((s.charAt(j) >= 'a' && s.charAt(j) <= 'z') || (s.charAt(j) >= 'A' && s.charAt(j) <= 'Z') || (s.charAt(j) >= '0' && s.charAt(j) <= '9') || s.charAt(j) == '_')
						{
							continue;
						}
						else
						{
							flag = 0;
							break;
						}
					}
				}
			}
			else
			{
				flag = 0;
			}
			System.out.printf("%d\n",flag);
		}
		return 0;
	}
}

