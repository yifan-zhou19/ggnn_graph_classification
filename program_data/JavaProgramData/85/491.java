package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		int n;
		int i;
		int j;
		int flag = 0;
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
				a[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (a[i][0] >= '0' && a[i][0] <= '9')
			{
				System.out.print("no\n");
				continue;
			}
			for (j = 0;j < String.valueOf(a[i]).length();j++)
			{
				if ((a[i][j] >= 'a' && a[i][j] <= 'z') || (a[i][j] >= 'A' && a[i][j] <= 'Z') || (a[i][j] >= '0' && a[i][j] <= '9') || a[i][j] == '_')
				{
					flag++;
				}
				else
				{
					System.out.print("no\n");
					flag = 0;
					break;
				}
			}
			if (flag == String.valueOf(a[i]).length())
			{
				System.out.print("yes\n");
				flag = 0;
			}
		}
		return 0;
	}

}

