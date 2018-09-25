package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[100];
		int[] b = new int[100];
		int[] c = new int[100];
		int n;
		int i;
		int l = 0;
		int j;
		int h;
		int max = 0;
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
		for (i = 0;i < n;i++)
		{
			if (i == 0)
			{
				h = 0;
			}
			if (i == n - 1)
			{
				if (a[i] <= 140 && a[i] >= 90 && b[i] <= 90 && b[i] >= 60)
				{
					h++;
					c[l] = h;
					l++;
				}
			}
			else
			{
			if (a[i] <= 140 && a[i] >= 90 && b[i] <= 90 && b[i] >= 60)
			{
				h++;
			}
			else
			{
				c[l] = h;
				h = 0;
				l++;
			}
			}
		}
		for (i = 0;i < l;i++)
		{
			if (c[i] > max)
			{
				max = c[i];
			}
		}
		System.out.printf("%d",max);
	}
}

