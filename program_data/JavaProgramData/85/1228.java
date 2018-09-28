package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int[] sz = new int[20];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		char[][] a = new char[20][20];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (k = 1;a[i][k] != '\0';k++)
			{
				if (((a[i][0] < 91) && (a[i][0]>64)) || ((a[i][0] < 123) && (a[i][0]>96)) || (a[i][0] == '_'))
				{
					if (((a[i][k] <= '9') && (a[i][k] >= '0')) || ((a[i][k] <= 'z') && (a[i][k] >= 'a')) || ((a[i][k] <= 'Z') && (a[i][k] >= 'A')) || (a[i][k] == '_'))
					{
					   sz[i] = 1;
					}
					else
					{
					   sz[i] = 0;
					   break;
					}
				}
				else
				{
					sz[i] = 0;
					break;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (sz[i] == 0)
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

