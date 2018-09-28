package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[100];
		int n;
		int i;
		int u;
		int v;
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
		}
		if (a[0] > a[1])
		{
			u = a[0];
		}
		v = a[1];
		if (a[0] < a[1])
		{
			u = a[1];
		}
		v = a[0];
		for (i = 2;i < n;i++)
		{
			if (a[i] > u)
			{
				u = a[i];
			}
			if (a[i] < u && a[i]> v)
			{
				v = a[i];
			}
		}
		System.out.printf("%d\n%d",u,v);
	}

}

