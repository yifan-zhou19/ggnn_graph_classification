package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] sz = new int[200];
		int carry = 0;
		int i;
		int k;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n == 0)
		{
			System.out.print("1");
			return 0;
		}
		sz[0] = 2;
		for (i = 1;i < n;i++)
		{
			for (k = 0;k < 199;k++)
			{
				sz[k] = sz[k] * 2 + carry;
				carry = 0;
				while (sz[k] >= 10)
				{
					sz[k] -= 10;
					carry++;
				}
			}
		}
		for (i = 199;i >= 0;i--)
		{
			if (sz[i] != 0)
			{
				for (i = i;i >= 0;i--)
				{
					System.out.printf("%d",sz[i]);
				}
				break;
			}
		}
		return 0;
	}

}

