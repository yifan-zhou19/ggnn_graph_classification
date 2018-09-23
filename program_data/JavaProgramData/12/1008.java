package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		float[] sz = new float[16];
		int[] n = new int[100];
		int i;
		int k;
		for (i = 0;i >= 0;i++)
		{
			n[i] = 0;
			for (k = 0;k < 16;k++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					sz[k] = Float.parseFloat(tempVar);
				}
				if (sz[k] == 0F || sz[0] == -1F)
				{
					break;
				}
			}
			for (int a = 0;a < k - 1;a++)
			{
				for (int b = a + 1;b < k;b++)
				{
					if (sz[a] == sz[b] * 2 || sz[a] == sz[b] / 2)
					{
					n[i]++;
					}
				}
			}
			if (sz[0] == -1F)
			{
				break;
			}
		}
		for (k = 0;k < i;k++)
		{
			System.out.printf("%d\n",n[k]);
		}
		return 0;
	}

}

