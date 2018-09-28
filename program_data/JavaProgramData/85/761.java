package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int n;
		int j;
		int flag;
		char t;
		char[] c = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
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
				c = tempVar2.charAt(0);
			}
			flag = 1;
			j = 1;
			t = c[0];
			if ((t >= 'a' && t <= 'z') || (t >= 'A' && t <= 'Z') || t == '_')
			{
				while ((t = c[j]) != '\0')
				{
					if ((t >= 'a' && t <= 'z') || (t >= 'A' && t <= 'Z') || t == '_' || (t >= '0' && t <= '9'))
					{
						j++;
					}
					else
					{
						flag = 0;
						break;
					}
				}
			}
			else
			{
				flag = 0;
			}
			if (flag == 1)
			{
				System.out.print("yes\n");
			}
			else
			{
				System.out.print("no\n");
			}
		}
	}
}

