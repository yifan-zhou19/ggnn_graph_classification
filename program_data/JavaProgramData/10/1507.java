package <missing>;

public class GlobalMembers
{
	public static int[] h = new int[30];
	public static int[] result = new int[30];

	public static int findFirstLess(int num)
	{
		int index = 0;
		while (true)
		{
			if (result[index] < num)
			{
				return index;
			}
			index++;
		}
	}

	public static int Main()
	{
		int k;
		int i = 0;
		int r;
		int p;
		int ans;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		while (true)
		{
			if (i >= k)
			{
				break;
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				h + i = tempVar2;
			}
			i++;
		}
		result[0] = h[0];
		i = 1;
		r = 0;
		while (i < k) // ????????, i.e. ???????
		{
			if (h[i] <= result[r]) // h?????????
			{
				result[++r] = h[i]; //??
			}
			if (h[i] > result[r])
			{
				result[findFirstLess(h[i])] = h[i];
			}
			i++;
		}
	//	printf()


		//??????????
	/*
		i = 0;
		p = 0;
		ans = 0;
		while(i < k)
		{
			if(h[i] == result[p + 1])
			{
				p++;
				continue;
			}
			if(h[i] == result[p])
				ans++;
			i++;
		}
	*/
		System.out.printf("%d\n", r + 1);

		return 0;
	}
}

