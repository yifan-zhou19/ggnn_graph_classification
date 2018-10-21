package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		char[][] zfc = new char[n][21];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				zfc[i] = tempVar2.charAt(0);
			}
		}
		int len;
		int result;
		for (i = 0;i < n;i++)
		{
			result = 0;
			len = String.valueOf(zfc[i]).length();
			if (zfc[i][0] != '_')
			{
				if (zfc[i][0] < 'A')
				{
					result++;
				}
				if (zfc[i][0] > 'Z' && zfc[i][0] < 'a')
				{
					result++;
				}
				if (zfc[i][0] > 'z')
				{
					result++;
				}
			}
			for (a = 1;a < len;a++)
			{
				if (zfc[i][a] != '_')
				{
					if (zfc[i][a] < '0')
					{
						result++;
					}
					if (zfc[i][a] > '9' && zfc[i][a] < 'A')
					{
						result++;
					}
					if (zfc[i][a] > 'Z' && zfc[i][a] < 'a')
					{
						result++;
					}
					if (zfc[i][a] > 'z')
					{
						result++;
					}
				}
			}
			if (result == 0)
			{
				System.out.print("yes\n");
			}
			if (result != 0)
			{
				System.out.print("no\n");
			}
		}
		return 0;
	}



}

