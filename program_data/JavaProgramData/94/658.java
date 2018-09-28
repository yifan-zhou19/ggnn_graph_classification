package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int k;
		int b;
		int h;
		int c;
		int[] shuzu = new int[n];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				shuzu[i] = Integer.parseInt(tempVar2);
			}
		}
		int a = 0;
		int[] shuzu_ = new int[n];
		for (k = 0;k < n;k++)
		{
			if (shuzu[k] % 2 != 0)
			{
				shuzu_[a] = shuzu[k];
				a++;
			}
		}
		a = a;
		int g;
		for (b = 1;b <= a;b++)
		{
			int e = 0;
			for (c = 0;c <= a - b;c++)
			{
				if (shuzu_[c] > shuzu_[e])
				{
					e = c;
				}
			}
			if (e != a - b)
			{
				g = shuzu_[a - b];
				shuzu_[a - b] = shuzu_[e];
				shuzu_[e] = g;
			}
		}
		for (h = 0;h < a - 1;h++)
		{
			System.out.printf("%d,",shuzu_[h]);
		}
		if (h = a - 1)
		{
			System.out.printf("%d",shuzu_[a - 1]);
		}
		return 0;
	}
}

