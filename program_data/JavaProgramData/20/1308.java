package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[] str = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		char[] substr = {0, '\0', '\0', '\0', '\0'};
		while (scanf("%s",str) != EOF)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				substr = tempVar.charAt(0);
			}
			int i;
			int k;
			int u;
			for (u = 0;u <= 9;u++)
			{
				if (!str[u])
				{
					break;
				}
			}
			k = 0;
			for (i = 1;i <= u - 1;i++)
			{
				if (str[k] < str[i])
				{
					k = i;
				}
			}
			for (i = 0;i <= k;i++)
			{
				System.out.printf("%c",str[i]);
			}
			for (i = 0;i <= 2;i++)
			{
				System.out.printf("%c",substr[i]);
			}
			for (i = k + 1;i <= u - 1;i++)
			{
				System.out.printf("%c",str[i]);
			}
			System.out.print("\n");
		}
		return 0;
	}
}

