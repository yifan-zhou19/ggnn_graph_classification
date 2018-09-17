package <missing>;

public class GlobalMembers
{
	public static int num(int k, int i, tangible.RefObject<Integer> p, int height)
	{
		if (i == k)
		{
			return 0;
		}
		if (*(p.argValue + i) > height)
		{
			return (num(k, i + 1, p, height));
		}
		if (*(p.argValue + i) == height)
		{
			return (num(k, i + 1, p, height) + 1);
		}
		int a = num(k, i + 1, p, height);
		int b = num(k, i + 1, p, *(p.argValue + i)) + 1;
		return a > b != 0?a:b;
	}
	public static int Main()
	{
		int k;
		int[] h = new int[25];
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
				h[i] = Integer.parseInt(tempVar2);
			}
		}
	tangible.RefObject<Integer> tempRef_h = new tangible.RefObject<Integer>(h);
		System.out.printf("%d",num(k, 0, tempRef_h, 1000000000));
		h = tempRef_h.argValue;
		return 0;
	}
}

