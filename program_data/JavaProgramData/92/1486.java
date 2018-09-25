package <missing>;

public class GlobalMembers
{
	public static int[] sa = new int[2000];
	public static int[] sb = new int[2000];

	public static int Main()
	{
		int n;
		while (scanf("%d", n) && n != 0)
		{
			for (int i = 1;i <= n;i++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					sa[i] = Integer.parseInt(tempVar);
				}
			}
			for (int i = 1;i <= n;i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					sb[i] = Integer.parseInt(tempVar2);
				}
			}
			sort(sa[1],sa[n + 1]);
			sort(sb[1],sb[n + 1]);

			int stpA = 1;
			int edpA = n;
			int stpB = 1;
			int edPB = n;
			int result = 0;

			for (int i = 1;i <= n;i++)
			{
				if (sa[stpA] > sb[stpB])
				{
					result += 200;
					stpA++;
					stpB++;
				}
				else if (sa[edpA] > sb[edPB])
				{
					result += 200;
					edpA--;
					edPB--;
				}
				else
				{
					if (sa[stpA] > sb[edPB])
					{
						result += 200;
					}
					else if (sa[stpA] < sb[edPB])
					{
						result -= 200;
					}
					stpA++;
					edPB--;
				}
			}
			System.out.print(result);
			System.out.print("\n");
		}
		return 0;
	}
}

