package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[1000][21];
		int b;
		int i;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			b = Integer.parseInt(tempVar);
		}
		for (i = 0;i < b;i++)
		{

				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i] = tempVar2.charAt(0);
				}

		}
		for (i = 0;i < b;i++)
		{
			if (a[i][0] == '_' || (a[i][0] >= 'a' && a[i][0] <= 'z') || (a[i][0] >= 'A' && a[i][0] <= 'Z'))
			{
				for (k = 1;a[i][k] != '\0';k++)
				{
					if (a[i][k] == '_' || (a[i][k] >= 'a' && a[i][k] <= 'z') || (a[i][k] >= 'A' && a[i][k] <= 'Z') || (a[i][k] >= '0' && a[i][k] <= '9'))
					{
						continue;
					}
					else
					{
						break;
					}
				}
				if (a[i][k] != '\0')
				{
					System.out.print("no\n");
				}
				else
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

