package <missing>;

public class GlobalMembers
{
	public static int left(tangible.RefObject<Integer> h, int i)
	{
		int j;
		int flag = 0;
		int num;
		int max;

		if (i == 0)
		{
			return 1;
		}
		else
		{
			for (j = i - 1;j >= 0;j--)
			{
				if (*(h.argValue + j) >= *(h.argValue + i))
				{
					num = left(h, j) + 1;
					if (flag == 0)
					{
						max = num;
						flag = 1;
					}
					else if (num > max)
					{
						max = num;
					}
				}
			}
			if (flag == 0)
			{
				return 1;
			}
			else
			{
				return max;
			}
		}
	}

	public static void Main()
	{
		int n;
		int i;
		int[] h = new int[MAX];
		int num;
		int max;

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
				h + i = tempVar2;
			}
		}

		for (i = n - 1;i >= 0;i--)
		{
		tangible.RefObject<Integer> tempRef_h = new tangible.RefObject<Integer>(h);
			num = left(tempRef_h, i);
			h = tempRef_h.argValue;
			if (i == n - 1)
			{
				max = num;
			}
			else if (num > max)
			{
				max = num;
			}
		}

		System.out.printf("%d\n",max);
	}

}

