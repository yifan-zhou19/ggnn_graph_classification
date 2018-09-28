package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int sum = 0;
		int[] m = new int[1000];
		char[][] c = new char[1000][22];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				c[i] = tempVar2.charAt(0);
			}
			m[i] = String.valueOf(c[i]).length();
		  //  printf("%s\n",c[i]);
		}
		for (int i = 0;i < n;i++)
		{
			for (int j = 0;j < m[i];j++)
			{
				if (((c[i][0] >= 'A' && c[i][0] <= 'Z') || (c[i][0] >= 'a' && c[i][0] <= 'z') || c[i][0] == '_') && ((c[i][j] >= 'A' && c[i][j] <= 'Z') || (c[i][j] >= 'a' && c[i][j] <= 'z') || c[i][j] == '_' || (c[i][j] >= '0' && c[i][j] <= '9')))
				{
				sum++;
				}
			}
			if (sum == m[i])
			{
				System.out.print("yes\n");
			}
			else
			{
				System.out.print("no\n");
			}
			sum = 0;
		}
	}
}

