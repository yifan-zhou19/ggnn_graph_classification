package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int k;
		int n;
		int sum;
		int[] sz = new int[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		char[][] s = new char[1000][20];
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			sum = 0;
			sz[i] = String.valueOf(s[i]).length();
			for (k = 0;k < sz[i];k++)
			{
				if ((s[i][k] >= 'a' && s[i][k] <= 'z') || (s[i][k] >= 'A' && s[i][k] <= 'Z') || (s[i][k] >= '0' && s[i][k] <= '9') || (s[i][k] == '_'))
				{
					sum++;
				}
			}
			if (sum == sz[i] && ((s[i][0] >= 'a' && s[i][0] <= 'z') || (s[i][0] >= 'A' && s[i][0] <= 'Z') || (s[i][0] == '_')))
			{
				System.out.print("yes\n");
			}
			else
			{
				System.out.print("no\n");
			}
		}
		return 0;
	}
}

