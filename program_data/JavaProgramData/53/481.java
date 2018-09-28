package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int b;
		int i = 1;
		int j;
		int t;
		int s;
		int k;
		int[] a = new int[300];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		a[0] = b;
		for (k = 1;k < n;k++)
		{
			s = 1;
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				m = Integer.parseInt(tempVar3);
			}
			a[i] = m;
			for (j = 0;j < i;j++)
			{
				if (a[i] == a[j])
				{
					t = 0;
				}
				else
				{
					t = 1;
				}
				s = s * t;
			}
			if (s != 0)
			{
				i++;
			}
		}
		for (j = 0;j < i - 1;j++)
		{
			System.out.printf("%d,",a[j]);
		}
		System.out.printf("%d",a[i - 1]);
	}
}

