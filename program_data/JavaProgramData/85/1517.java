package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String a = new String(new char[100]);
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			if (a.charAt(0) - 'A' >= 0 && a.charAt(0) - 'Z' <= 0 || a.charAt(0) - '_' == 0 || a.charAt(0) - 'a' >= 0 && a.charAt(0) - 'z' <= 0)
			{
				for (int j = 1;j < 100;j++)
				{
					if (a.charAt(j) == '\0')
					{
						System.out.print("yes\n");
						break;
					}
					else
					{
					if (a.charAt(j) - 'A' >= 0 && a.charAt(j) - 'Z' <= 0 || a.charAt(j) - '_' == 0 || a.charAt(j) - 'a' >= 0 && a.charAt(j) - 'z' <= 0 || a.charAt(j) - '0' >= 0 && a.charAt(j) - '9' <= 0)
					{
						continue;
					}
					else
					{
						System.out.print("no\n");
						break;
					}
					}

				}
			}
			else
			{
				System.out.print("no\n");
			}
		}
			return 0;
	}
}

