package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		char[][] data = new char[100][21];
		int[] num = new int[100];
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
				data[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (data[i][0] <= '9' && data[i][0] >= '0')
			{
					num[i]++;
				continue;
			}
			for (j = 0;data[i][j] != '\0';j++)
			{
				if ((data[i][j] <= 'Z' && data[i][j] >= 'A') || (data[i][j] >= 'a' && data[i][j] <= 'z') || (data[i][j] >= '0' && data[i][j] <= '9') || data[i][j] == '_')
				{
				}
				else
				{
					num[i]++;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (num[i] != 0)
			{
				System.out.print("no\n");
			}
			else
			{
				System.out.print("yes\n");
			}
		}
		return 0;
	}

}

