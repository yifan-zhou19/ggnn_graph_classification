package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		String str = new String(new char[1000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				str = tempVar2.charAt(0);
			}
			if (str.charAt(0) == '_' || (str.charAt(0) >= 'a' && str.charAt(0) <= 'z') || (str.charAt(0) >= 'A' && str.charAt(0) <= 'Z'))
			{
				for (j = 1;str.charAt(j) != '\0';j++)
				{
					if (str.charAt(j) == '_' || (str.charAt(j) >= 'a' && str.charAt(j) <= 'z') || (str.charAt(j) >= 'A' && str.charAt(j) <= 'Z') || (str.charAt(j) >= '0' && str.charAt(j) <= '9'))
					{
						j = j;
					}
				else
				{
						System.out.print("no\n");
						break;
				}
				}
				if (str.charAt(j) == '\0')
				{
						System.out.print("yes\n");
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

