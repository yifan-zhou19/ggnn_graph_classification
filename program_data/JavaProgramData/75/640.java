package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[1001]; //???????
		int[] b = new int[1001];
		int i = 1; //??????????????
		int count;
		int max1 = INT_MIN;
		int min1 = INT_MAX;
		int MAX = 0;
		int total = 0;
		while (true) //?????????? ????
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i++] = Integer.parseInt(tempVar);
			}
			char c = System.in.read();
			if (c == '\n')
			{
				count = i;
				break;
			}
		}
		i = 1;
		while (true)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b[i++] = Integer.parseInt(tempVar2);
			}
			char c = System.in.read();
			if (c == '\n')
			{
				break;
			}
		}
		count = i - 1;
		for (int j = 1;j <= count;j++)
		{
			min1 = min1 >= a[j] != 0?a[j]:min1;
		}
		for (int j = 1;j <= count;j++)
		{
			max1 = max1 <= b[j] != 0?b[j]:max1;
		}
		for (int l = min1;l <= max1;l++)
		{
			for (int k = 1;k <= count;k++)
			{
				if (a[k] == l)
				{
					total++;
				}
				if (b[k] == l)
				{
					total--;
				}

			}
			MAX = MAX >= total != 0?MAX:total;
		}

		System.out.print(count);
		System.out.print(" ");
		System.out.print(MAX);
		System.out.print("\n");
		return 0;
	}
}

