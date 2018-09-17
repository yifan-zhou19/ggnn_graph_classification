package <missing>;

public class GlobalMembers
{
	public static int[] aMaxLen = new int[35];
	public static int nTmp;
	public static int Main()
	{
		int k;
		int i;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] b = new int[25];
		for (i = 0;i < k;i++)
		{
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
			aMaxLen[1] = 1;
		for (i = 2;i <= k;i++)
		{
			int nTmp = 0;
			for (int j = 1;j < i;j++)
			{
				if (b[i] < b[j])
				{
					if (nTmp < aMaxLen[j])
					{
						nTmp = aMaxLen[j];
					}
				}
			}
			aMaxLen[i] = nTmp + 1;
		}
		int nMax = -1;
		for (i = 1;i <= k;i++)
		{
			if (nMax < aMaxLen[i])
			{
				nMax = aMaxLen[i];
			}
		}
		System.out.print(nMax);
		System.out.print("\n");

		return 0;
	}
}

