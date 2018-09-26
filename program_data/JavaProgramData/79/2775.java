package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int s;
		int k;
		int p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		while (n != 0 && m != 0)
		{
			int[] a = new int[n];
			for (p = 0;p < n;p++)
			{
				a[p] = 1;
			}
			s = 0;
			k = 0;
			i = 0;
			while (k < n - 1)
			{
				s += a[i];
				if (s == m)
				{
					a[i] = 0;
					s = 0;
					k++;
				}
				i++;
				if (i >= n)
				{
					i = i - n;
				}
			}
			for (i = 0;i < n;i++)
			{
				if (a[i] == 1)
				{
					i = i + 1;
					System.out.printf("%d\n",i);
				}
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				m = Integer.parseInt(tempVar4);
			}
		}
		return 0;
	}
}

