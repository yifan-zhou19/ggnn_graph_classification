package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int len;
		int j;
		char[] str = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	loop:
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		str = tempVar2.charAt(0);
	}
			len = str.length();
			if (str[0] == '_' || (str[0] >= 'a' && str[0] <= 'z') || (str[0] >= 'A' && str[0] <= 'Z'))
			{
			}
			else
			{
				System.out.print("no\n");
				continue;
			}
			for (j = 1;j < len;j++)
			{
				if (str[j] == '_' || (str[j] >= 'a' && str[j] <= 'z') || (str[j] >= 'A' && str[j] <= 'Z') || (str[j] >= '0' && str[j] <= '9'))
				{
				}
				else
				{
					System.out.print("no\n");
					i++;
					if (i < n)
					{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
						goto loop;
					}
					else
					{
						return 0;
					}
				}
			}
			System.out.print("yes\n");
		}
		return 0;
	}


}

