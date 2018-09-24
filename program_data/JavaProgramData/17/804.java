package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int j = 0;
		int k = 0;
		int n;
		int[][] f = new int[101][102];
		int[] l = new int[101];
		int g;
		char[][] s = new char[101][102];
		String a = new String(new char[102]);
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
				s[i] = tempVar2.charAt(0);
			}
			l[i] = String.valueOf(s[i]).length();
			for (j = l[i] - 1;j >= 0;j--)
			{
				if (s[i][j] == '(')
				{
					k = j;
				}
				else
				{
					continue;
				}
			for (g = k + 1;g < l[i];g++)
			{
				if (s[i][g] == ')' && f[i][g] == 0)
				{
					f[i][k] = 1;
					f[i][g] = 1;
					break;
				}
			}
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",s[i]);
			for (j = 0;j < l[i];j++)
			{
				if (s[i][j] == '(' && f[i][j] == 0)
				{
					System.out.print("$");
				}
				else if (s[i][j] == ')' && f[i][j] == 0)
				{
					System.out.print("?");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
		return 0;
	}


}

