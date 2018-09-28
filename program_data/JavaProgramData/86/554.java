package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] sa = new int[100000];
		int[] sb = new int[10000];
		int i;
		int j;
		int x;
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
					x = Integer.parseInt(tempVar2);
				}

				for (j = 0;j < x;j++)
				{
					String tempVar3 = ConsoleInput.scanfRead();
					if (tempVar3 != null)
					{
						sa[j] = Integer.parseInt(tempVar3);
					}
				}
				sb[i] = 60;
				for (j = 0;j < x;j++)
				{
						sb[i] -= 3;
						if (sb[i] - sa[j] <= 0 && sb[i] - sa[j] >= -3)
						{
							sb[i] = sa[j];
							break;
						}
						else if (sb[i] - sa[j] < 0)
						{
							sb[i] = sb[i] + 3;
							break;
						}
						if (sb[i] - sa[j] > 0)
						{
							continue;
						}
				}
		}
				for (i = 0;i < n;i++)
				{
						System.out.printf("%d\n",sb[i]);
				}

		return 0;
	}

}

