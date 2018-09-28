package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int s;
		int max;
		int[] a = new int[10000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		s = 0;
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			s = s + a[i];
		}
		max = 0;
		for (i = 1;i <= n;i++)
		{
			if (Math.abs(a[i] * n - s) > max)
			{
				max = Math.abs(a[i] * n - s);
			}
		}
		for (i = 1;i <= n;i++)
		{
			if (Math.abs(a[i] * n - s) == max)
			{
				System.out.printf("%d",a[i]);
				break;
			}
		}
		i++;
		for (;i <= n;i++)
		{
			if (Math.abs(a[i] * n - s) == max)
			{
				System.out.printf(",%d",a[i]);
			}
		}

		return (0);
	}
}

