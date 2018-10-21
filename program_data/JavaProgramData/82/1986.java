package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[101];
		int[] b = new int[101];
		int[] c = new int[101];
		int i;
		int j;
		int s;
		i = 1;
		j = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (i <= n)
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
			if (a[i] >= 90 && a[i] <= 140 && b[i] >= 60 && b[i] <= 90)
			{
				j = j + 1;
				c[i] = j;
			}
			else
			{
				c[i] = j = 0;
			}
			i++;
		}
		s = c[1];
		for (i = 1;i <= n;i++)
		{
			if (s < c[i])
			{
				s = c[i];
			}
		}
		System.out.printf("%d\n",s);
		return 0;
	}
}

