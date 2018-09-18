package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[20];
		int s = 0;
		while (scanf("%d", a[++s]) != EOF)
		{
			if (a[1] == -1)
			{
				break;
			}
			do
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[++s] = Integer.parseInt(tempVar);
				}
			} while (a[s] != 0);
			s--;
			int ans = 0;
			for (int i = 1;i <= s;i++)
			{
				for (int j = 1;j <= s;j++)
				{
					if (a[i] * 2 == a[j])
					{
						ans++;
					}
				}
			}
			System.out.printf("%d\n",ans);
			s = 0;

		}
		return 0;
	}
}

