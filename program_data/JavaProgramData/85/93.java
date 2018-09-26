package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		char[][] p = new char[100][20];
		int n;
		int i;
		int j;
			 int k = 1;
			 int c;
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

		for (i = 0;i < n;i++)
		{
			{
				if ((p[i][0] >= 'A' && p[i][0] <= 'Z') || (p[i][0] >= 'a' && p[i][0] <= 'z') || p[i][0] == '_')
				{
				for (j = 1;p[i][j] != '\0';j++)
				{

					if ((p[i][j] >= 'A' && p[i][j] <= 'Z') || (p[i][j] >= 'a' && p[i][j] <= 'z') || p[i][j] == '_' || (p[i][j] >= '0' && p[i][j] <= '9'))
					{
						k = k + 1;
					}
				}
				}
		}
			c = String.valueOf(p[i]).length();
			if (k == c)
			{
				System.out.print("yes\n");
			}
			else
			{
			System.out.print("no\n");
			}
			k = 1;

		}
	}

}

