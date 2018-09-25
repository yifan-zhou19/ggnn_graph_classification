package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[99];
		int f;
		int s;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a + i = tempVar2;
			}
		}
		for (i = 1,f = a[0];i <= n - 1;i++)
		{
			if (a[i] > f)
			{
				f = a[i];
			}
		}
		for (i = 0;i <= n - 1;i++)
		{
			if (a[i] < f)
			{
				break;
			}
		}
		for (s = a[i],i = i + 1;i <= n - 1;i++)
		{
			if (a[i] > s && a[i] < f)
			{
				s = a[i];
			}
		}
		System.out.printf("%d\n%d\n",f,s);
		return (0);
	}
}

