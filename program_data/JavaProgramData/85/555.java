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
		char[][] str = new char[100][30];
		int i;
		int j;
		int k;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				str[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			int e;
			e = String.valueOf(str[i]).length();
			k = 0;
			if ((str[i][0] < 'A' || str[i][0]>'Z') && (str[i][0] < 'a' || str[i][0]>'z') && (str[i][0] != '_'))
			{
				k = 1;
			}
			for (j = 0;j < e;j++)
			{
			   if ((str[i][j] < 'A' || str[i][j]>'Z') && (str[i][j] < 'a' || str[i][j]>'z') && (str[i][j] < '0' || str[i][j]>'9') && (str[i][j] != '_'))
			   {
				   k = 1;
				   break;
			   }
			}
			if (k == 0)
			{
				System.out.print("yes\n");
			}
			if (k == 1)
			{
				System.out.print("no\n");
			}
		}
	return 0;
	}

}

