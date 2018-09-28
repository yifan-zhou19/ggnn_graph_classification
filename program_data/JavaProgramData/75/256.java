package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[1000];
		int[] b = new int[1000];
		int[] m = new int[1000];
		int i = 1;
		int j = 1;
		int l;
		int max;
		char c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[0] = Integer.parseInt(tempVar);
		}
		while ((c = System.in.read()) == ',')
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i++] = Integer.parseInt(tempVar2);
			}
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b[0] = Integer.parseInt(tempVar3);
		}
		while ((c = System.in.read()) == ',')
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				b[j++] = Integer.parseInt(tempVar4);
			}
		}
		l = i - 1;
		for (i = 0;i < 1000;i++)
		{
			for (j = 0;j <= l;j++)
			{
				if (i >= a[j] != 0 && i < b[j])
				{
					m[i]++;
				}
			}
		}
		max = m[0];
		for (i = 0;i < 1000;i++)
		{
			if (m[i] > max)
			{
				max = m[i];
			}
		}

		System.out.printf("%d %d\n",l + 1,max);
		return 0;
	}
}

