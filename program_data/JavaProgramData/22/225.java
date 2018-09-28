package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] n = new int[300];
		int i;
		int max = 0;
		int len;
		int maxn;
		int t = 0;
		char c;
		for (i = 0;;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n[i] = Integer.parseInt(tempVar);
			}
			if ((c = System.in.read()) == '\n')
			{
			break;
			}
		}
		len = i;
		if (len == 0)
		{
			System.out.print("No\n");
		}
		else
		{
			for (i = 1;i <= len;i++)
			{
					if (n[0] != n[i])
					{
						t = 1;
					}
			}
			if (t == 0)
			{
				System.out.print("No\n");
			}
			else
			{
				for (i = 0;i <= len;i++)
				{
					if (max < n[i])
					{
							max = n[i];
							maxn = i;
					}
				}
				for (i = 0;i <= len;i++)
				{
					if (i != maxn)
					{
						if (n[maxn] == n[i])
						{
							n[i] = 0;
						}
					}
				}
				n[maxn] = 0;
				max = 0;
				for (i = 0;i <= len;i++)
				{
					if (max < n[i])
					{
							max = n[i];
							maxn = i;
					}
				}
				System.out.printf("%d\n",n[maxn]);
			}
		}
	}
}

