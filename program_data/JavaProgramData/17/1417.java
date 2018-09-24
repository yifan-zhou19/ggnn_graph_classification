package <missing>;

public class GlobalMembers
{
	public static String s = new String(new char[1000]);
	public static int[] dp = new int[1000];
	public static int Main()
	{
		//freopen("in.txt","r",stdin);
		int i;
		int j;
		int k;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (scanf("%s",s) == 1)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(dp,0,(Integer.SIZE / Byte.SIZE));
			n = s.length();
			for (i = 0;i < n;i++)
			{
				if (s.charAt(i) == '(')
				{
					dp[i] = -1;
				}
				if (s.charAt(i) == ')')
				{
					dp[i] = 1;
				}
			}
			for (i = 0;i < n;i++)
			{
				if (s.charAt(i) == ')')
				{
					for (j = i - 1;j >= 0;j--)
					{
						if (s.charAt(j) == '(' && dp[j] == -1)
						{
							dp[i] = 0;
							dp[j] = 0;
							break;
						}
					}
				}
			}
			System.out.printf("%s\n",s);
			for (i = 0;i < n;i++)
			{
				if (dp[i] == -1)
				{
					System.out.print("$");
				}
				else if (dp[i] == 1)
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

