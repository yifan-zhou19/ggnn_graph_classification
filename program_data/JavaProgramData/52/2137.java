package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int m;
		int i;
		int j;
		int t;
		int s;
		int[] a = new int[100];
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
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < m;i++)
		{
			t = a[0];
		for (j = 1;j < n;j++)
		{
			s = a[j];
			a[j] = t;
			t = s;
		}
		a[0] = t;
		}
	System.out.printf("%d",a[0]);
	for (i = 1;i < n;i++)
	{
	System.out.printf(" %d",a[i]);
	}

	}
}

