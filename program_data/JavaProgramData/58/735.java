package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] judge = new int[100];
		int i;
		int j;
		int k;
		int t;
		int length;
		String ch = new String(new char[81]);
		for (k = 1;k <= 100;k++)
		{
			judge[k - 1] = 1;
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			ch = new Scanner(System.in).nextLine();
			if (ch.charAt(0) == '_' || (ch.charAt(0) >= 'a' && ch.charAt(0) <= 'z') || (ch.charAt(0) >= 'A' && ch.charAt(0) <= 'Z'))
			{
				length = ch.length() - 1;
				for (j = 1;j <= length;j++)
				{
					if (ch.charAt(j) == '_' || (ch.charAt(j) >= 'a' && ch.charAt(j) <= 'z') || (ch.charAt(j) >= 'A' && ch.charAt(j) <= 'Z') || (ch.charAt(j) >= '0' && ch.charAt(j) <= '9'))
					{
						;
					}
					else
					{
						judge[i - 1] = 0;
					}
				}
			}
			else
			{
				judge[i - 1] = 0;
			}
		}
		for (t = 1;t <= n;t++)
		{
			System.out.printf("%d\n",judge[t - 1]);
		}
	}
}

