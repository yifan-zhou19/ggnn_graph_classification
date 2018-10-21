package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[SIZE];
		int[] l = new int[SIZE];
		int i = 1;
		int j;
		int k;
		int t;
		int min;
		int max;
		int maxn;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[0] = Integer.parseInt(tempVar);
		}
		min = a[0];
//C++ TO JAVA CONVERTER TODO TASK: Variables cannot be declared in if/while/switch conditions in Java:
		while (scanf(",%d", a[i++]) == 1)
		{
			;
		}
		{
			if (a[i - 1] < min)
			{
				min = a[i - 1];
			}
	}

		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			l[0] = Integer.parseInt(tempVar2);
		}
		max = l[0];

		for (j = 1;j < i;j++)
		{
			String tempVar3 = ConsoleInput.scanfRead(",");
			if (tempVar3 != null)
			{
				l[j] = Integer.parseInt(tempVar3);
			}
			if (l[j] > max)
			{
				max = l[j];
			}
		}
	   //printf("[%d][%d]\n",min,max);
			maxn = 0;

			for (k = min;k <= max;k++)
			{
				t = 0;
				for (j = 0;j < i;j++)
				{
					if ((k >= a[j]) && (k < l[j]))
					{
						t++;
					}
				}

				if (t > maxn)
				{
					maxn = t;
				}
			}


		System.out.printf("%d %d", i - 1, maxn);
		return 0;
	}

}

