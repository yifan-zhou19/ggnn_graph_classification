package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int[] h = new int[30];
	public static int[] len = new int[30];

	public static int Main()
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				h[i] = Integer.parseInt(tempVar2);
			}
		}
		len[0] = 1;
		for (int i = 1;i < n;i++)
		{
			len[i] = 1;
			for (int j = 0;j < i;j++)
			{
				if (h[j] >= h[i] != 0 && len[j] + 1 > len[i])
				{
					len[i] = len[j] + 1;
				}
			}
		}
		int maxi = 0;
		for (int i = 0;i < n;i++)
		{
			if (len[i] > maxi)
			{
				maxi = len[i];
			}
		}
		System.out.printf("%d\n",maxi);
	}
}

