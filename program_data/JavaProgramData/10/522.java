package <missing>;

public class GlobalMembers
{
	public static int k;
	public static int[] h = new int[30];
	public static int[] r = new int[30];
	public static int Main()
	{
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int j;
		for (i = 0;i < k;i++)
		{
			h[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}

	//	memset(h,0,sizeof(h));
	//	memset(r,0,sizeof(r));

		r[k - 1] = 1;
		for (i = k - 2;i >= 0;i--)
		{
			if (r[i] >= r[i + 1])
			{
				System.out.print("first way taken");
				System.out.print("\n");
				r[i] = r[i + 1] + 1;
			}
			else
			{
				int max = 0;
				for (j = i + 1;j < k;j++)
				{
					if (h[j] <= h[i] != 0 && r[j]> max)
					{
						max = r[j];
					}
				}
				r[i] = max + 1;
			}
		}
		int ans = 0;
		for (i = 0;i < k;i++)
		{
			//cout<<r[i]<<endl;
			if (r[i] > ans)
			{
				ans = r[i];
			}
		}
		System.out.print(ans);

	}
}

