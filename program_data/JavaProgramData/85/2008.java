package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String str = new String(new char[21]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int j = 0;j < n;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				str = tempVar2.charAt(0);
			}
			for (int i = 0;str.charAt(i) != '\0';i++)
			{
				if (i == 0)
				{
					if (((str.charAt(i) >= 'a') && (str.charAt(i) <= 'z')) || ((str.charAt(i) >= 'A') && (str.charAt(i) <= 'Z')) || (str.charAt(i) == '_'))
					{
						continue;
					}
					else
					{
						System.out.print("no\n");
						break;
					}
				}
				if (i > 0)
				{
					if (((str.charAt(i) >= 'a') && (str.charAt(i) <= 'z')) || ((str.charAt(i) >= 'A') && (str.charAt(i) <= 'Z')) || ((str.charAt(i) >= '0') && (str.charAt(i) <= '9')) || (str.charAt(i) == '_'))
					{
						if (str.charAt(i + 1) != '\0')
						{
							continue;
						}
						else
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
			}
		}
		return 0;
	}
}

