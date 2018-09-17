package <missing>;

public class GlobalMembers
{
	/* Note:Your choice is C IDE */
	public static void Main()
	{
		int i = 0;
		int j = 0;
		int flag = 0;
		int s1;
		int s2;
		int n;
		int p;
		int[] a = new int[12];
		int[] b = new int[12];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p = Integer.parseInt(tempVar2);
		}
		while (n > 0)
		{
			a[i] = n;
			n /= 2;
			i++;
		}
			while (p > 0)
			{
			b[j] = p;
			p /= 2;
			j++;
			}
		for (s1 = 0;s1 < i && flag != 1;s1++)
		{
			for (s2 = 0;s2 < j && flag != 1;s2++)
			{
			if (a[s1] == b[s2])
			{
				flag = 1;
			}
			}
		}
		System.out.printf("%d",a[s1 - 1]);
	}
}

