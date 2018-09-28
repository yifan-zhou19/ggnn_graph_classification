package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] a = new int[100];
		int[] b = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int m = 0;
		int i = 0;
		for (i;i < n;i++)
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
		i = 0;
		while (i < n)
		{
			int s = 0;
			while (a[i] >= 90 && a[i] <= 140 && b[i] >= 60 && b[i] <= 90 && i < n)
			{
				s++;
				i++;
			}
			if (s > m)
			{
				m = s;
			}
			i++;
		}
		System.out.printf("%d",m);
	}
}

