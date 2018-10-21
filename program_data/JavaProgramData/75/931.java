package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int j;
		int[] a = new int[2000];
		int[] b = new int[2000];
		int k;
		int m;
		int p;
		int q;
		char c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(null, 1);
		if (tempVar2 != null)
		{
			c = tempVar2.charAt(0);
		}
		while (c != '\n')
		{
			a[i] = k;
			i++;
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				k = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(null, 1);
			if (tempVar4 != null)
			{
				c = tempVar4.charAt(0);
			}
		}
		a[i] = k;
		for (j = 0;j <= i;j++)
		{
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				b[j] = Integer.parseInt(tempVar5);
			}
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			b[j] = Integer.parseInt(tempVar6);
		}
		System.out.printf("%d ",i + 1);
		p = 0;
		q = 0;
		for (m = 0;m < 1000;m++)
		{
			for (j = 0;j <= i;j++)
			{
				if (m >= a[j] != 0 && m < b[j])
				{
					q++;
				}
			}
			if (q >= p)
			{
				p = q;
			}
			q = 0;
		}
		System.out.printf("%d\n",p);
	}
}

