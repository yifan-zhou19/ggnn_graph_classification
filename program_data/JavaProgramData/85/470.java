package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String[] p = {"\0"};
		int i;
		int j;
		int flag;
		int n;
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
				p[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0;i < n;i++,flag = 1)
		{
			if (p[i][0] <= 'z' && p[i][0] >= 'a' || p[i][0] <= 'Z' && p[i][0] >= 'A' || p[i][0] == '_')
			{
			for (j = 1;p[i][j] != '\0';j++)
			{
				if (!(p[i][j] <= 'z' && p[i][j] >= 'a' || p[i][j] <= 'Z' && p[i][j] >= 'A' || p[i][j] == '_' || p[i][j] >= '0' && p[i][j] <= '9'))
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
				if (flag != 0)
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

