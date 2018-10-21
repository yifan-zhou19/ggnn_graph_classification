package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i = 0;
		int[] a = new int[10000];
		int[] b = new int[10000];
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
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		int min;
		int max;
		min = a[0],max = b[0];
		i = 0;
		for (i = 0;i < n;i++)
		{
			if (a[i] < min)
			{
				min = a[i];
			}
			if (b[i] > max)
			{
				max = b[i];
			}
		}
		float j;
		float m = 0F;
		float e = 0F;
		float k = 0F;
		i = 0;
		j = min;
		for (j = min;j <= max;j = j + 0.5)
		{
			e = 0F;

			for (i = 0;i < n;i++)
			{
				if (j >= a[i] != 0 && j <= b[i])
				{
					e++;
				}
			}
			if (e == 0F)
			{
				k = 1F;
				break;
			}

		}
		if (k == 1F)
		{
			System.out.print("no");
		}
		if (k == 0F)
		{
			System.out.printf("%d %d",min,max);
		}
		return 0;
	}


}

