package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int t = 0;
		char[][] str = new char[100][20];
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
				str[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (str[i][0] >= '0' && str[i][0] <= '9')
			{
				System.out.print("no\n");
				continue;
			}
			int m = String.valueOf(str[i]).length();
			t = 0;
			for (k = 0;k < m;k++)
			{

				if ((str[i][k] == '_') || ((str[i][k] >= 'a') && (str[i][k] <= 'z')) || ((str[i][k] >= 'A') && (str[i][k] <= 'Z')) || (str[i][k] >= '0') && (str[i][k] <= '9'))
				{
					t++;
				}
				else
				{
					System.out.print("no\n");
					break;
				}
				if (t == m)
				{
					System.out.print("yes\n");
					break;
				}
			}

		}
		return 0;
	}

}

