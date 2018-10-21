package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[500];
		int i;
		int j;
		int n;
		int ans;
		for (;scanf("%d", a[0]), a[0] != -1;)
		{
			for (n = 1;scanf("%d", a[n]), a[n] != 0;n++)
			{
				;
			}
			ans = 0;
			for (int i = 0;i < n;i++)
			{
				for (int j = 0;j < n;j++)
				{
					if (a[i] == a[j] * 2)
					{
						ans++;
					}
				}
			}
			System.out.printf("%d\n",ans);
		}
		return 0;
	}



}
