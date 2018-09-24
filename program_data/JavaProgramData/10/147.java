package <missing>;

public class GlobalMembers
{
	public static int k;
	public static int[] h = new int[30];
	public static int[] f = new int[30];
	public static int l;

	public static int Main()
	{
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				h + i = tempVar2;
			}
		}
		l = 0;
		for (i = k - 1;i >= 0;i--)
		{
			if (l == 0 || f[l - 1] <= h[i])
			{
				f[l++] = h[i];
			}
			else
			{
				int mid;
				int left = 0;
				int right = l - 1;
				while (left < right)
				{
					mid = (left + right) / 2;
					if (h[i] >= f[mid])
					{
						left = mid + 1;
					}
					else if (h[i] < f[mid])
					{
						right = mid - 1;
					}
				}
				if (f[left] > h[i])
				{
					f[left] = h[i];
				}
				else
				{
					f[left + 1] = h[i];
				}
			}
		}
		System.out.printf("%d\n",l);
	}
}

